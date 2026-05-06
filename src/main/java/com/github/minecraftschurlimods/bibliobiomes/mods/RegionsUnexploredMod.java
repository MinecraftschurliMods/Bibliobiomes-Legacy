package com.github.minecraftschurlimods.bibliobiomes.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliobiomes.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import net.regions_unexplored.block.RuWoodTypes;
import net.regions_unexplored.registry.RUBlocks;

public class RegionsUnexploredMod extends AbstractMod {
    public RegionsUnexploredMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "alpha", "block/alpha_oak_planks", RuWoodTypes.ALPHA, RUBlocks.ALPHA_WOOD_SET::getPlanks, RUBlocks.ALPHA_WOOD_SET::getSlab, RUBlocks.ALPHA_WOOD_SET::getStairs);
        woodType(event, "baobab",           RuWoodTypes.BAOBAB,           RUBlocks.BAOBAB_WOOD_SET::getPlanks,           RUBlocks.BAOBAB_WOOD_SET::getSlab,           RUBlocks.BAOBAB_WOOD_SET::getStairs);
        woodType(event, "blackwood",        RuWoodTypes.BLACKWOOD,        RUBlocks.BLACKWOOD_WOOD_SET::getPlanks,        RUBlocks.BLACKWOOD_WOOD_SET::getSlab,        RUBlocks.BLACKWOOD_WOOD_SET::getStairs);
        woodType(event, "blue_bioshroom",   RuWoodTypes.BLUE_BIOSHROOM,   RUBlocks.BLUE_BIOSHROOM_WOOD_SET::getPlanks,   RUBlocks.BLUE_BIOSHROOM_WOOD_SET::getSlab,   RUBlocks.BLUE_BIOSHROOM_WOOD_SET::getStairs);
        woodType(event, "brimwood",         RuWoodTypes.BRIMWOOD,         RUBlocks.BRIMWOOD_WOOD_SET::getPlanks,         RUBlocks.BRIMWOOD_WOOD_SET::getSlab,         RUBlocks.BRIMWOOD_WOOD_SET::getStairs);
        woodType(event, "cobalt",           RuWoodTypes.COBALT,           RUBlocks.COBALT_WOOD_SET::getPlanks,           RUBlocks.COBALT_WOOD_SET::getSlab,           RUBlocks.COBALT_WOOD_SET::getStairs);
        woodType(event, "cypress",          RuWoodTypes.CYPRESS,          RUBlocks.CYPRESS_WOOD_SET::getPlanks,          RUBlocks.CYPRESS_WOOD_SET::getSlab,          RUBlocks.CYPRESS_WOOD_SET::getStairs);
        woodType(event, "dead",             RuWoodTypes.DEAD,             RUBlocks.DEAD_WOOD_SET::getPlanks,             RUBlocks.DEAD_WOOD_SET::getSlab,             RUBlocks.DEAD_WOOD_SET::getStairs);
        woodType(event, "eucalyptus",       RuWoodTypes.EUCALYPTUS,       RUBlocks.EUCALYPTUS_WOOD_SET::getPlanks,       RUBlocks.EUCALYPTUS_WOOD_SET::getSlab,       RUBlocks.EUCALYPTUS_WOOD_SET::getStairs);
        woodType(event, "green_bioshroom",  RuWoodTypes.GREEN_BIOSHROOM,  RUBlocks.GREEN_BIOSHROOM_WOOD_SET::getPlanks,  RUBlocks.GREEN_BIOSHROOM_WOOD_SET::getSlab,  RUBlocks.GREEN_BIOSHROOM_WOOD_SET::getStairs);
        woodType(event, "joshua",           RuWoodTypes.JOSHUA,           RUBlocks.JOSHUA_WOOD_SET::getPlanks,           RUBlocks.JOSHUA_WOOD_SET::getSlab,           RUBlocks.JOSHUA_WOOD_SET::getStairs);
        woodType(event, "kapok",            RuWoodTypes.KAPOK,            RUBlocks.KAPOK_WOOD_SET::getPlanks,            RUBlocks.KAPOK_WOOD_SET::getSlab,            RUBlocks.KAPOK_WOOD_SET::getStairs);
        woodType(event, "larch",            RuWoodTypes.LARCH,            RUBlocks.LARCH_WOOD_SET::getPlanks,            RUBlocks.LARCH_WOOD_SET::getSlab,            RUBlocks.LARCH_WOOD_SET::getStairs);
        woodType(event, "magnolia",         RuWoodTypes.MAGNOLIA,         RUBlocks.MAGNOLIA_WOOD_SET::getPlanks,         RUBlocks.MAGNOLIA_WOOD_SET::getSlab,         RUBlocks.MAGNOLIA_WOOD_SET::getStairs);
        woodType(event, "maple",            RuWoodTypes.MAPLE,            RUBlocks.MAPLE_WOOD_SET::getPlanks,            RUBlocks.MAPLE_WOOD_SET::getSlab,            RUBlocks.MAPLE_WOOD_SET::getStairs);
        woodType(event, "mauve",            RuWoodTypes.MAUVE,            RUBlocks.MAUVE_WOOD_SET::getPlanks,            RUBlocks.MAUVE_WOOD_SET::getSlab,            RUBlocks.MAUVE_WOOD_SET::getStairs);
        woodType(event, "palm",             RuWoodTypes.PALM,             RUBlocks.PALM_WOOD_SET::getPlanks,             RUBlocks.PALM_WOOD_SET::getSlab,             RUBlocks.PALM_WOOD_SET::getStairs);
        woodType(event, "pine",             RuWoodTypes.PINE,             RUBlocks.PINE_WOOD_SET::getPlanks,             RUBlocks.PINE_WOOD_SET::getSlab,             RUBlocks.PINE_WOOD_SET::getStairs);
        woodType(event, "pink_bioshroom",   RuWoodTypes.PINK_BIOSHROOM,   RUBlocks.PINK_BIOSHROOM_WOOD_SET::getPlanks,   RUBlocks.PINK_BIOSHROOM_WOOD_SET::getSlab,   RUBlocks.PINK_BIOSHROOM_WOOD_SET::getStairs);
        woodType(event, "redwood",          RuWoodTypes.REDWOOD,          RUBlocks.REDWOOD_WOOD_SET::getPlanks,          RUBlocks.REDWOOD_WOOD_SET::getSlab,          RUBlocks.REDWOOD_WOOD_SET::getStairs);
        woodType(event, "socotra",          RuWoodTypes.SOCOTRA,          RUBlocks.SOCOTRA_WOOD_SET::getPlanks,          RUBlocks.SOCOTRA_WOOD_SET::getSlab,          RUBlocks.SOCOTRA_WOOD_SET::getStairs);
        woodType(event, "willow",           RuWoodTypes.WILLOW,           RUBlocks.WILLOW_WOOD_SET::getPlanks,           RUBlocks.WILLOW_WOOD_SET::getSlab,           RUBlocks.WILLOW_WOOD_SET::getStairs);
        woodType(event, "yellow_bioshroom", RuWoodTypes.YELLOW_BIOSHROOM, RUBlocks.YELLOW_BIOSHROOM_WOOD_SET::getPlanks, RUBlocks.YELLOW_BIOSHROOM_WOOD_SET::getSlab, RUBlocks.YELLOW_BIOSHROOM_WOOD_SET::getStairs);
    }
}
