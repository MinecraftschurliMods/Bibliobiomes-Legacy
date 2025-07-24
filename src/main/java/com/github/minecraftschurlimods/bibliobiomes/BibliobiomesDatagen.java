package com.github.minecraftschurlimods.bibliobiomes;

import com.github.minecraftschurlimods.bibliocraft.api.BibliocraftApi;
import com.github.minecraftschurlimods.bibliocraft.api.datagen.BibliocraftDatagenHelper;
import com.github.minecraftschurlimods.bibliocraft.api.datagen.NonClearingBlockTagsProvider;
import com.github.minecraftschurlimods.bibliocraft.api.datagen.NonClearingItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Bibliobiomes.MOD_ID)
public final class BibliobiomesDatagen {
    @SubscribeEvent
    private static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        LanguageProvider language = generator.addProvider(event.includeClient(), new LanguageProvider(generator.getPackOutput(), Bibliobiomes.MOD_ID, "en_us") {
            @Override
            protected void addTranslations() {}
        });
        NonClearingBlockTagsProvider blockTags = generator.addProvider(event.includeServer(), new NonClearingBlockTagsProvider(output, lookupProvider, Bibliobiomes.MOD_ID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {}
        });
        NonClearingItemTagsProvider itemTags = generator.addProvider(event.includeServer(), new NonClearingItemTagsProvider(output, lookupProvider, blockTags.contentsGetter(), Bibliobiomes.MOD_ID, existingFileHelper) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {}
        });
        BibliocraftDatagenHelper helper = BibliocraftApi.getDatagenHelper();
        helper.addWoodTypesToGenerateByModid("biomesoplenty");
        helper.addWoodTypesToGenerateByModid("biomeswevegone");
        helper.addWoodTypesToGenerateByModid("regions_unexplored");
        helper.generateAll(Bibliobiomes.MOD_ID, event, language, blockTags, itemTags);
    }
}
