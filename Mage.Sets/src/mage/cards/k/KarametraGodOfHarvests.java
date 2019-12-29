package mage.cards.k;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.dynamicvalue.common.DevotionCount;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.continuous.LoseCreatureTypeSourceEffect;
import mage.abilities.effects.common.search.SearchLibraryPutInPlayEffect;
import mage.abilities.hint.ValueHint;
import mage.abilities.keyword.IndestructibleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.filter.FilterCard;
import mage.filter.StaticFilters;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.SubtypePredicate;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

/**
 * @author LevelX2
 */
public final class KarametraGodOfHarvests extends CardImpl {

    private static final FilterCard filter = new FilterCard("Forest or Plains card");

    static {
        filter.add(Predicates.or(
                new SubtypePredicate(SubType.FOREST),
                new SubtypePredicate(SubType.PLAINS)
        ));
    }

    public KarametraGodOfHarvests(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT, CardType.CREATURE}, "{3}{G}{W}");
        addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.GOD);

        this.power = new MageInt(6);
        this.toughness = new MageInt(7);

        // Indestructible
        this.addAbility(IndestructibleAbility.getInstance());

        // As long as your devotion to green and white is less than seven, Karametra isn't a creature.
        Effect effect = new LoseCreatureTypeSourceEffect(DevotionCount.GW, 7);
        effect.setText("As long as your devotion to green and white is less than seven, {this} isn't a creature");
        this.addAbility(new SimpleStaticAbility(effect).addHint(new ValueHint("Devotion to green and white", DevotionCount.GW)));

        // Whenever you cast a creature spell, you may search your library for a Forest or Plains card, put it onto the battlefield tapped, then shuffle your library.
        this.addAbility(new SpellCastControllerTriggeredAbility(
                new SearchLibraryPutInPlayEffect(new TargetCardInLibrary(filter), true),
                StaticFilters.FILTER_SPELL_A_CREATURE, true
        ));
    }

    public KarametraGodOfHarvests(final KarametraGodOfHarvests card) {
        super(card);
    }

    @Override
    public KarametraGodOfHarvests copy() {
        return new KarametraGodOfHarvests(this);
    }
}
