package mage.cards.b;

import java.util.UUID;

import mage.abilities.effects.common.counter.AddCountersTargetEffect;
import mage.abilities.effects.keyword.ScryEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.counters.CounterType;

/**
 *
 * @author TheElk801
 */
public final class BoonOfSafety extends CardImpl {

    public BoonOfSafety(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{W}");

        // Put a shield counter on target creature.
        this.getSpellAbility().addEffect(new AddCountersTargetEffect(CounterType.SHIELD.createInstance()));

        // Scry 1.
        this.getSpellAbility().addEffect(new ScryEffect(1,false).concatBy("<br>"));
    }

    private BoonOfSafety(final BoonOfSafety card) {
        super(card);
    }

    @Override
    public BoonOfSafety copy() {
        return new BoonOfSafety(this);
    }
}
