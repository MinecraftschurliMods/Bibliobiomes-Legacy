package com.github.minecraftschurlimods.bibliobiomes.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliobiomes.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.block.set.WoodSet;
import net.regions_unexplored.data.block.RuWoodTypes;

public class RegionsUnexploredMod extends AbstractMod {
    public RegionsUnexploredMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "alpha", "block/alpha_oak_planks", RuWoodTypes.ALPHA, RuBlocks.ALPHA_WOOD_SET::getPlanks, RuBlocks.ALPHA_WOOD_SET::getSlab, RuBlocks.ALPHA_WOOD_SET::getStairs);
        woodType(event, "baobab",           RuWoodTypes.BAOBAB,           RuBlocks.BAOBAB_WOOD_SET::getPlanks,           RuBlocks.BAOBAB_WOOD_SET::getSlab,           RuBlocks.BAOBAB_WOOD_SET::getStairs);
        woodType(event, "blackwood",        RuWoodTypes.BLACKWOOD,        RuBlocks.BLACKWOOD_WOOD_SET::getPlanks,        RuBlocks.BLACKWOOD_WOOD_SET::getSlab,        RuBlocks.BLACKWOOD_WOOD_SET::getStairs);
        woodType(event, "blue_bioshroom",   RuWoodTypes.BLUE_BIOSHROOM,   RuBlocks.BLUE_BIOSHROOM_WOOD_SET::getPlanks,   RuBlocks.BLUE_BIOSHROOM_WOOD_SET::getSlab,   RuBlocks.BLUE_BIOSHROOM_WOOD_SET::getStairs);
        woodType(event, "brimwood",         RuWoodTypes.BRIMWOOD,         RuBlocks.BRIMWOOD_WOOD_SET::getPlanks,         RuBlocks.BRIMWOOD_WOOD_SET::getSlab,         RuBlocks.BRIMWOOD_WOOD_SET::getStairs);
        woodType(event, "cobalt",           RuWoodTypes.COBALT,           RuBlocks.COBALT_WOOD_SET::getPlanks,           RuBlocks.COBALT_WOOD_SET::getSlab,           RuBlocks.COBALT_WOOD_SET::getStairs);
        woodType(event, "cypress",          RuWoodTypes.CYPRESS,          RuBlocks.CYPRESS_WOOD_SET::getPlanks,          RuBlocks.CYPRESS_WOOD_SET::getSlab,          RuBlocks.CYPRESS_WOOD_SET::getStairs);
        woodType(event, "dead",             RuWoodTypes.DEAD,             RuBlocks.DEAD_WOOD_SET::getPlanks,             RuBlocks.DEAD_WOOD_SET::getSlab,             RuBlocks.DEAD_WOOD_SET::getStairs);
        woodType(event, "eucalyptus",       RuWoodTypes.EUCALYPTUS,       RuBlocks.EUCALYPTUS_WOOD_SET::getPlanks,       RuBlocks.EUCALYPTUS_WOOD_SET::getSlab,       RuBlocks.EUCALYPTUS_WOOD_SET::getStairs);
        woodType(event, "green_bioshroom",  RuWoodTypes.GREEN_BIOSHROOM,  RuBlocks.GREEN_BIOSHROOM_WOOD_SET::getPlanks,  RuBlocks.GREEN_BIOSHROOM_WOOD_SET::getSlab,  RuBlocks.GREEN_BIOSHROOM_WOOD_SET::getStairs);
        woodType(event, "joshua",           RuWoodTypes.JOSHUA,           RuBlocks.JOSHUA_WOOD_SET::getPlanks,           RuBlocks.JOSHUA_WOOD_SET::getSlab,           RuBlocks.JOSHUA_WOOD_SET::getStairs);
        woodType(event, "kapok",            RuWoodTypes.KAPOK,            RuBlocks.KAPOK_WOOD_SET::getPlanks,            RuBlocks.KAPOK_WOOD_SET::getSlab,            RuBlocks.KAPOK_WOOD_SET::getStairs);
        woodType(event, "larch",            RuWoodTypes.LARCH,            RuBlocks.LARCH_WOOD_SET::getPlanks,            RuBlocks.LARCH_WOOD_SET::getSlab,            RuBlocks.LARCH_WOOD_SET::getStairs);
        woodType(event, "magnolia",         RuWoodTypes.MAGNOLIA,         RuBlocks.MAGNOLIA_WOOD_SET::getPlanks,         RuBlocks.MAGNOLIA_WOOD_SET::getSlab,         RuBlocks.MAGNOLIA_WOOD_SET::getStairs);
        woodType(event, "maple",            RuWoodTypes.MAPLE,            RuBlocks.MAPLE_WOOD_SET::getPlanks,            RuBlocks.MAPLE_WOOD_SET::getSlab,            RuBlocks.MAPLE_WOOD_SET::getStairs);
        woodType(event, "mauve",            RuWoodTypes.MAUVE,            RuBlocks.MAUVE_WOOD_SET::getPlanks,            RuBlocks.MAUVE_WOOD_SET::getSlab,            RuBlocks.MAUVE_WOOD_SET::getStairs);
        woodType(event, "palm",             RuWoodTypes.PALM,             RuBlocks.PALM_WOOD_SET::getPlanks,             RuBlocks.PALM_WOOD_SET::getSlab,             RuBlocks.PALM_WOOD_SET::getStairs);
        woodType(event, "pine",             RuWoodTypes.PINE,             RuBlocks.PINE_WOOD_SET::getPlanks,             RuBlocks.PINE_WOOD_SET::getSlab,             RuBlocks.PINE_WOOD_SET::getStairs);
        woodType(event, "pink_bioshroom",   RuWoodTypes.PINK_BIOSHROOM,   RuBlocks.PINK_BIOSHROOM_WOOD_SET::getPlanks,   RuBlocks.PINK_BIOSHROOM_WOOD_SET::getSlab,   RuBlocks.PINK_BIOSHROOM_WOOD_SET::getStairs);
        woodType(event, "redwood",          RuWoodTypes.REDWOOD,          RuBlocks.REDWOOD_WOOD_SET::getPlanks,          RuBlocks.REDWOOD_WOOD_SET::getSlab,          RuBlocks.REDWOOD_WOOD_SET::getStairs);
        woodType(event, "socotra",          RuWoodTypes.SOCOTRA,          RuBlocks.SOCOTRA_WOOD_SET::getPlanks,          RuBlocks.SOCOTRA_WOOD_SET::getSlab,          RuBlocks.SOCOTRA_WOOD_SET::getStairs);
        woodType(event, "willow",           RuWoodTypes.WILLOW,           RuBlocks.WILLOW_WOOD_SET::getPlanks,           RuBlocks.WILLOW_WOOD_SET::getSlab,           RuBlocks.WILLOW_WOOD_SET::getStairs);
        woodType(event, "yellow_bioshroom", RuWoodTypes.YELLOW_BIOSHROOM, RuBlocks.YELLOW_BIOSHROOM_WOOD_SET::getPlanks, RuBlocks.YELLOW_BIOSHROOM_WOOD_SET::getSlab, RuBlocks.YELLOW_BIOSHROOM_WOOD_SET::getStairs);
    }
}
