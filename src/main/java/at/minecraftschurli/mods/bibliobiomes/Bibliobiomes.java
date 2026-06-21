package at.minecraftschurli.mods.bibliobiomes;

import at.minecraftschurli.mods.bibliobiomes.mods.BiomesOPlentyMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

import java.util.function.BiFunction;

@Mod(Bibliobiomes.MOD_ID)
public final class Bibliobiomes {
    public static final String MOD_ID = "bibliobiomes";

    public Bibliobiomes(IEventBus bus) {
        addIfLoaded("biomesoplenty",      bus, BiomesOPlentyMod::new);
        //addIfLoaded("biomeswevegone",     bus, BiomesWeveGoneMod::new);
        //addIfLoaded("regions_unexplored", bus, RegionsUnexploredMod::new);
    }

    private void addIfLoaded(String modId, IEventBus bus, BiFunction<String, IEventBus, AbstractMod> modBuilder) {
        if (ModList.get().isLoaded(modId)) {
            modBuilder.apply(modId, bus);
        }
    }
}
