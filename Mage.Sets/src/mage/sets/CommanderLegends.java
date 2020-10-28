package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class CommanderLegends extends ExpansionSet {

    private static final CommanderLegends instance = new CommanderLegends();

    public static CommanderLegends getInstance() {
        return instance;
    }

    private CommanderLegends() {
        super("Commander Legends", "CMR", ExpansionSet.buildDate(2020, 11, 1), SetType.SUPPLEMENTAL);
        this.blockName = "Commander Legends";
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.maxCardNumberInBooster = 361;

        cards.add(new SetCardInfo("Acidic Slime", 421, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Alena, Kessig Trapper", 160, Rarity.UNCOMMON, mage.cards.a.AlenaKessigTrapper.class));
        cards.add(new SetCardInfo("Bladegriff Prototype", 300, Rarity.RARE, mage.cards.b.BladegriffPrototype.class));
        cards.add(new SetCardInfo("Brazen Freebooter", 164, Rarity.COMMON, mage.cards.b.BrazenFreebooter.class));
        cards.add(new SetCardInfo("Briarblade Adept", 111, Rarity.COMMON, mage.cards.b.BriarbladeAdept.class));
        cards.add(new SetCardInfo("Charcoal Diamond", 303, Rarity.COMMON, mage.cards.c.CharcoalDiamond.class));
        cards.add(new SetCardInfo("Coastline Marauders", 168, Rarity.UNCOMMON, mage.cards.c.CoastlineMarauders.class));
        cards.add(new SetCardInfo("Command Tower", 350, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 306, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Confiscate", 62, Rarity.UNCOMMON, mage.cards.c.Confiscate.class));
        cards.add(new SetCardInfo("Entourage of Trest", 224, Rarity.COMMON, mage.cards.e.EntourageOfTrest.class));
        cards.add(new SetCardInfo("Exquisite Huntmaster", 122, Rarity.COMMON, mage.cards.e.ExquisiteHuntmaster.class));
        cards.add(new SetCardInfo("Halana, Kessig Ranger", 231, Rarity.UNCOMMON, mage.cards.h.HalanaKessigRanger.class));
        cards.add(new SetCardInfo("Horizon Scholar", 73, Rarity.UNCOMMON, mage.cards.h.HorizonScholar.class));
        cards.add(new SetCardInfo("Ikra Shidiqi, the Usurper", 519, Rarity.MYTHIC, mage.cards.i.IkraShidiqiTheUsurper.class));
        cards.add(new SetCardInfo("Interpret the Signs", 75, Rarity.UNCOMMON, mage.cards.i.InterpretTheSigns.class));
        cards.add(new SetCardInfo("Keeper of the Accord", 27, Rarity.RARE, mage.cards.k.KeeperOfTheAccord.class));
        cards.add(new SetCardInfo("Kitesail Corsair", 76, Rarity.COMMON, mage.cards.k.KitesailCorsair.class));
        cards.add(new SetCardInfo("Kitesail Skirmisher", 77, Rarity.COMMON, mage.cards.k.KitesailSkirmisher.class));
        cards.add(new SetCardInfo("Kydele, Chosen of Kruphix", 524, Rarity.MYTHIC, mage.cards.k.KydeleChosenOfKruphix.class));
        cards.add(new SetCardInfo("Maelstrom Colossus", 322, Rarity.COMMON, mage.cards.m.MaelstromColossus.class));
        cards.add(new SetCardInfo("Maelstrom Wanderer", 526, Rarity.MYTHIC, mage.cards.m.MaelstromWanderer.class));
        cards.add(new SetCardInfo("Mana Confluence", 721, Rarity.MYTHIC, mage.cards.m.ManaConfluence.class));
        cards.add(new SetCardInfo("Marble Diamond", 323, Rarity.COMMON, mage.cards.m.MarbleDiamond.class));
        cards.add(new SetCardInfo("Mask of Memory", 324, Rarity.UNCOMMON, mage.cards.m.MaskOfMemory.class));
        cards.add(new SetCardInfo("Mindless Automaton", 326, Rarity.UNCOMMON, mage.cards.m.MindlessAutomaton.class));
        cards.add(new SetCardInfo("Nekusar, the Mindrazer", 529, Rarity.MYTHIC, mage.cards.n.NekusarTheMindrazer.class));
        cards.add(new SetCardInfo("Phyrexian Triniform", 331, Rarity.MYTHIC, mage.cards.p.PhyrexianTriniform.class));
        cards.add(new SetCardInfo("Prophetic Prism", 334, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Prossh, Skyraider of Kher", 530, Rarity.MYTHIC, mage.cards.p.ProsshSkyraiderOfKher.class));
        cards.add(new SetCardInfo("Prying Eyes", 86, Rarity.COMMON, mage.cards.p.PryingEyes.class));
        cards.add(new SetCardInfo("Queen Marchesa", 531, Rarity.MYTHIC, mage.cards.q.QueenMarchesa.class));
        cards.add(new SetCardInfo("Raise the Alarm", 41, Rarity.COMMON, mage.cards.r.RaiseTheAlarm.class));
        cards.add(new SetCardInfo("Rebbec, Architect of Ascension", 42, Rarity.UNCOMMON, mage.cards.r.RebbecArchitectOfAscension.class));
        cards.add(new SetCardInfo("Rejuvenating Springs", 354, Rarity.RARE, mage.cards.r.RejuvenatingSprings.class));
        cards.add(new SetCardInfo("Reliquary Tower", 1000, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Sandstone Oracle", 336, Rarity.UNCOMMON, mage.cards.s.SandstoneOracle.class));
        cards.add(new SetCardInfo("Sengir, the Dark Baron", 149, Rarity.RARE, mage.cards.s.SengirTheDarkBaron.class));
        cards.add(new SetCardInfo("Siani, Eye of the Storm", 95, Rarity.UNCOMMON, mage.cards.s.SianiEyeOfTheStorm.class));
        cards.add(new SetCardInfo("Sidar Kondo of Jamuraa", 535, Rarity.MYTHIC, mage.cards.s.SidarKondoOfJamuraa.class));
        cards.add(new SetCardInfo("Silas Renn, Seeker Adept", 536, Rarity.MYTHIC, mage.cards.s.SilasRennSeekerAdept.class));
        cards.add(new SetCardInfo("Siren Stormtamer", 96, Rarity.UNCOMMON, mage.cards.s.SirenStormtamer.class));
        cards.add(new SetCardInfo("Spectator Seating", 356, Rarity.RARE, mage.cards.s.SpectatorSeating.class));
        cards.add(new SetCardInfo("Supreme Will", 102, Rarity.UNCOMMON, mage.cards.s.SupremeWill.class));
        cards.add(new SetCardInfo("Tevesh Szat, Doom of Fools", 153, Rarity.MYTHIC, mage.cards.t.TeveshSzatDoomOfFools.class));
        cards.add(new SetCardInfo("Thorn of the Black Rose", 154, Rarity.COMMON, mage.cards.t.ThornOfTheBlackRose.class));
        cards.add(new SetCardInfo("Three Visits", 1001, Rarity.UNCOMMON, mage.cards.t.ThreeVisits.class));
        cards.add(new SetCardInfo("Training Center", 358, Rarity.RARE, mage.cards.t.TrainingCenter.class));
        cards.add(new SetCardInfo("Undergrowth Stadium", 359, Rarity.RARE, mage.cards.u.UndergrowthStadium.class));
        cards.add(new SetCardInfo("Vampiric Tutor", 156, Rarity.MYTHIC, mage.cards.v.VampiricTutor.class));
        cards.add(new SetCardInfo("Vault of Champions", 360, Rarity.RARE, mage.cards.v.VaultOfChampions.class));
        cards.add(new SetCardInfo("Vial Smasher the Fierce", 540, Rarity.MYTHIC, mage.cards.v.VialSmasherTheFierce.class));
        cards.add(new SetCardInfo("Warden of Evos Isle", 106, Rarity.UNCOMMON, mage.cards.w.WardenOfEvosIsle.class));
        cards.add(new SetCardInfo("Xenagos, God of Revels", 541, Rarity.MYTHIC, mage.cards.x.XenagosGodOfRevels.class));
    }
}
