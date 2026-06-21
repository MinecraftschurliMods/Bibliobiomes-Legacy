package at.minecraftschurli.mods.bibliobiomes;

import at.minecraftschurli.mods.bibliocraft.api.BibliocraftApi;
import at.minecraftschurli.mods.bibliocraft.api.datagen.BibliocraftDatagenHelper;
import at.minecraftschurli.mods.bibliocraft.api.datagen.NonClearingBlockTagsProvider;
import at.minecraftschurli.mods.bibliocraft.api.datagen.NonClearingItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Bibliobiomes.MOD_ID)
public final class BibliobiomesDatagen {
    @SubscribeEvent
    private static void gatherData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        LanguageProvider language = generator.addProvider(true, new LanguageProvider(generator.getPackOutput(), Bibliobiomes.MOD_ID, "en_us") {
            @Override
            protected void addTranslations() {}
        });
        NonClearingBlockTagsProvider blockTags = generator.addProvider(true, new NonClearingBlockTagsProvider(output, lookupProvider, Bibliobiomes.MOD_ID) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {}
        });
        NonClearingItemTagsProvider itemTags = generator.addProvider(true, new NonClearingItemTagsProvider(output, lookupProvider, Bibliobiomes.MOD_ID) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {}
        });
        BibliocraftDatagenHelper helper = BibliocraftApi.getDatagenHelper();
        helper.addWoodTypesToGenerateByModid("biomesoplenty");
        helper.addWoodTypesToGenerateByModid("biomeswevegone");
        helper.addWoodTypesToGenerateByModid("regions_unexplored");
        helper.generateAll(Bibliobiomes.MOD_ID, lookupProvider, generator.getVanillaPack(true), generator.getVanillaPack(true), language, blockTags::tag, itemTags::tag);
    }
}
