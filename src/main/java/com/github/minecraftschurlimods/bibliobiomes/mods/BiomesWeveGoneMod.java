package com.github.minecraftschurlimods.bibliobiomes.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliobiomes.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWoodSet;

public class BiomesWeveGoneMod extends AbstractMod {
    public BiomesWeveGoneMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        for (BWGWoodSet woodSet : BWGWoodSet.woodsets()) {
            woodType(event, woodSet.name(), "block/" + woodSet.name() + "/planks", woodSet.woodType(), woodSet::planks, woodSet::slab, woodSet::stairs);
        }
    }
}
