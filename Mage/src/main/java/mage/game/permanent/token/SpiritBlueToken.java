

package mage.game.permanent.token;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.MageInt;
import mage.abilities.keyword.FlyingAbility;

/**
 *
 * @author spjspj
 */
public final class SpiritBlueToken extends TokenImpl {

    public SpiritBlueToken() {
        super("Spirit Token", "1/1 blue Spirit creature token with flying");
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.SPIRIT);
        color.setBlue(true);
        power = new MageInt(1);
        toughness = new MageInt(1);
        setTokenType(2);
        addAbility(FlyingAbility.getInstance());
    }

    public SpiritBlueToken(final SpiritBlueToken token) {
        super(token);
    }

    public SpiritBlueToken copy() {
        return new SpiritBlueToken(this);
    }
}
