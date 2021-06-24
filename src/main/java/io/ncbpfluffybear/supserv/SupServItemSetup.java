package io.ncbpfluffybear.supserv;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.ncbpfluffybear.supserv.items.LavaSponge;
import io.ncbpfluffybear.supserv.items.WateringCan;
import io.ncbpfluffybear.supserv.objects.NonInteractableItem;
import io.ncbpfluffybear.supserv.utils.Utils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class SupServItemSetup {

    private SupServItemSetup() {}

    public static void setup(@Nonnull SupServPlugin plugin) {

        new LavaSponge(SupServItems.SUPSERV_CATEGORY, SupServItems.LAVA_SPONGE, RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, new ItemStack(Material.BROWN_WOOL), null,
                new ItemStack(Material.BROWN_WOOL), new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.BROWN_WOOL),
                null, new ItemStack(Material.BROWN_WOOL), null
            }, new SlimefunItemStack(SupServItems.LAVA_SPONGE, 8)
        ).register(plugin);

        new NonInteractableItem(SupServItems.SUPSERV_CATEGORY, SupServItems.CHIPPED_WITHER_SKELETON_SKULL,
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[] {
                SlimefunItems.COMPRESSED_CARBON, SlimefunItems.COMPRESSED_CARBON, SlimefunItems.COMPRESSED_CARBON,
                SlimefunItems.COMPRESSED_CARBON, new ItemStack(Material.SKELETON_SKULL),
                SlimefunItems.COMPRESSED_CARBON,
                SlimefunItems.COMPRESSED_CARBON, SlimefunItems.COMPRESSED_CARBON, SlimefunItems.COMPRESSED_CARBON
            }).register(plugin);

        new NonInteractableItem(SupServItems.SUPSERV_CATEGORY, SupServItems.FRAGMENTED_WITHER_SKELETON_SKULL,
            RecipeType.MAGIC_WORKBENCH,
            Utils.build3x3Recipe(SupServItems.CHIPPED_WITHER_SKELETON_SKULL)
        ).register(plugin);

        new NonInteractableItem(SupServItems.SUPSERV_CATEGORY, SupServItems.WITHER_SKELETON_SKULL,
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[] {
                SupServItems.FRAGMENTED_WITHER_SKELETON_SKULL,
                SupServItems.FRAGMENTED_WITHER_SKELETON_SKULL, null,
                SupServItems.FRAGMENTED_WITHER_SKELETON_SKULL, SupServItems.FRAGMENTED_WITHER_SKELETON_SKULL, null,
                null, null, null
            }, new ItemStack(Material.WITHER_SKELETON_SKULL)
        ).register(plugin);

        new NonInteractableItem(SupServItems.SUPSERV_CATEGORY, SupServItems.CONDENSED_NETHER_STAR_BLOCK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            Utils.build3x3Recipe(new ItemStack(Material.NETHER_STAR))
        ).register(plugin);

        new NonInteractableItem(SupServItems.SUPSERV_CATEGORY, SupServItems.INGOT_OF_AFTERLIFE,
            RecipeType.MAGIC_WORKBENCH,
            Utils.build3x3Recipe(SlimefunItems.ESSENCE_OF_AFTERLIFE)
        ).register(plugin);

        new NonInteractableItem(SupServItems.SUPSERV_CATEGORY, SupServItems.DRAGON_ESSENCE, RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SlimefunItems.ENDER_LUMP_3, new ItemStack(Material.DRAGON_BREATH), SlimefunItems.ENDER_LUMP_3,
                new ItemStack(Material.DRAGON_BREATH), new ItemStack(Material.NETHER_STAR), new ItemStack(Material.DRAGON_BREATH),
                SlimefunItems.ENDER_LUMP_3, new ItemStack(Material.DRAGON_BREATH), SlimefunItems.ENDER_LUMP_3}
        ).register(plugin);

        new NonInteractableItem(SupServItems.SUPSERV_CATEGORY, SupServItems.DRAGON_EGG,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[] {
                SupServItems.INGOT_OF_AFTERLIFE, SupServItems.DRAGON_ESSENCE, SupServItems.INGOT_OF_AFTERLIFE,
                SupServItems.DRAGON_ESSENCE, SupServItems.CONDENSED_NETHER_STAR_BLOCK, SupServItems.DRAGON_ESSENCE,
                SupServItems.INGOT_OF_AFTERLIFE, SupServItems.DRAGON_ESSENCE, SupServItems.INGOT_OF_AFTERLIFE
            }, new ItemStack(Material.DRAGON_EGG)
        ).register(plugin);
        // Tools
        new WateringCan(SupServItems.SUPSERV_CATEGORY, SupServItems.WATERING_CAN,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.STONE), null, new ItemStack(Material.STONE),
                new ItemStack(Material.STONE), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.STONE),
                null, new ItemStack(Material.STONE), null
        }, WateringCan.canType.STONE).register(plugin);

        new WateringCan(SupServItems.SUPSERV_CATEGORY, SupServItems.WATERING_CAN_IRON,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.IRON_INGOT), null, new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.IRON_INGOT), SupServItems.WATERING_CAN, new ItemStack(Material.IRON_INGOT),
                null, new ItemStack(Material.IRON_INGOT), null
        }, WateringCan.canType.IRON ).register(plugin);

        new WateringCan(SupServItems.SUPSERV_CATEGORY, SupServItems.WATERING_CAN_GOLD,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.GOLD_16K, null, SlimefunItems.GOLD_16K,
                SlimefunItems.GOLD_16K, SupServItems.WATERING_CAN_IRON, SlimefunItems.GOLD_16K,
                null, SlimefunItems.GOLD_16K, null
        }, WateringCan.canType.GOLD).register(plugin);

        new WateringCan(SupServItems.SUPSERV_CATEGORY, SupServItems.WATERING_CAN_DIAMOND,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.SYNTHETIC_DIAMOND, null, SlimefunItems.SYNTHETIC_DIAMOND,
                SlimefunItems.SYNTHETIC_DIAMOND, SupServItems.WATERING_CAN_GOLD, SlimefunItems.SYNTHETIC_DIAMOND,
                null, SlimefunItems.SYNTHETIC_DIAMOND, null
        }, WateringCan.canType.DIAMOND).register(plugin);

        new WateringCan(SupServItems.SUPSERV_CATEGORY, SupServItems.WATERING_CAN_EMERALD,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SlimefunItems.SYNTHETIC_EMERALD, null, SlimefunItems.SYNTHETIC_EMERALD,
                SlimefunItems.SYNTHETIC_EMERALD, SupServItems.WATERING_CAN_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD,
                null, SlimefunItems.SYNTHETIC_EMERALD, null
        }, WateringCan.canType.EMERALD).register(plugin);

        new WateringCan(SupServItems.SUPSERV_CATEGORY, SupServItems.WATERING_CAN_NETHERITE,
                RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                null, null, null,
                null, SupServItems.WATERING_CAN_EMERALD, new ItemStack(Material.NETHERITE_INGOT),
                null, null, null
        }, WateringCan.canType.NETHERITE).register(plugin);


    }

}
