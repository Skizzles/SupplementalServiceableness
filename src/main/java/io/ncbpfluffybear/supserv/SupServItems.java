package io.ncbpfluffybear.supserv;

import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class SupServItems {

    private SupServItems() {}

    // Category
    public static final Category SUPSERV_CATEGORY = new Category(new NamespacedKey(SupServPlugin.getInstance(),
        "supservcategory"),
        new CustomItem(Material.NETHERITE_BLOCK, "&aSupplementalServiceableness")
    );

    public static final SlimefunItemStack LAVA_SPONGE = new SlimefunItemStack("LAVA_SPONGE",
        Material.BROWN_DYE,
        "&6Lava Sponge",
        "",
        "&7A sponge that soaks up lava",
        "&eRight Click &7to remove a 3x3x3 area of lava",
        "&7Can not be reused",
        "",
        "&9Suggested by CrystalNeko"
    );

    public static final SlimefunItemStack CHIPPED_WITHER_SKELETON_SKULL = new SlimefunItemStack("CHIPPED_WITHER_SKELETON_SKULL",
        Material.MELON_SEEDS,
        "&7&lChipped Wither Skeleton Skull",
        "",
        "&7A very small piece of a wither skeleton skull",
        "",
        "&9Suggested by CrystalNeko"
    );

    public static final SlimefunItemStack FRAGMENTED_WITHER_SKELETON_SKULL = new SlimefunItemStack("FRAGMENTED_WITHER_SKELETON_SKULL",
        Material.FLINT,
        "&7&lFragmented Wither Skeleton Skull",
        "",
        "&7A small piece of a wither skeleton skull",
        "",
        "&9Suggested by CrystalNeko"
    );

    public static final SlimefunItemStack CONDENSED_NETHER_STAR_BLOCK = new SlimefunItemStack("CONDENSED_NETHER_STAR_BLOCK",
        Material.QUARTZ_BRICKS,
        "&f&lCondensed Nether Star Block",
        "",
        "&7Many &eNether Stars &7smashed together"
    );

    public static final SlimefunItemStack INGOT_OF_AFTERLIFE = new SlimefunItemStack("INGOT_OF_AFTERLIFE",
        Material.NETHER_BRICK,
        "&4Ingot of Afterlife",
        "",
        "&7Condensed &4Essence of Afterlife"
    );

    public static final SlimefunItemStack DRAGON_ESSENCE = new SlimefunItemStack("DRAGON_ESSENCE",
        Material.DRAGON_BREATH,
        "&4&lDragon Essence",
        "",
        "&7The essence of a &4&lDragon &7captured in a bottle"
    );

    public static final SlimefunItemStack WITHER_SKELETON_SKULL = new SlimefunItemStack("WITHER_SKELETON_SKULL",
        Material.WITHER_SKELETON_SKULL, null);

    public static final SlimefunItemStack DRAGON_EGG = new SlimefunItemStack("DRAGON_EGG",
        Material.DRAGON_EGG, null);

    public static final SlimefunItemStack WATERING_CAN = new SlimefunItemStack("SS_WATERING_CAN",
            new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
            "&bWatering Can",
            "",
            "&fWaters Plants",
            "",
            "&7> &eRight Click &7a water to fill your watering can",
            "&7> &eRight Click &7a plant to speed up growth.",
            "&7> &eRight Click &7a player to slow them down",
            "",
            "&aUses Left: &e0"
    );
    public static final SlimefunItemStack WATERING_CAN_IRON = new SlimefunItemStack("WATERING_CAN_IRON",
            new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
            "&bWatering Can [IRON]",
            "",
            "&fWaters Plants",
            "",
            "&7> &eRight Click &7a water to fill your watering can",
            "&7> &eRight Click &7a plant to speed up growth.",
            "&7> &eRight Click &7a player to slow them down",
            "",
            "&aUses Left: &e0"
    );

    //DUMMY ITEM FOR IRON WATERING CAN RECIPE USING THE WATERING CAN FROM FLUFFYMACHINES
    public static final SlimefunItemStack WATERING_CAN_IRON_FM = new SlimefunItemStack("WATERING_CAN_IRON_FM",
            new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
            "&bWatering Can [IRON]",
            "",
            "&fWaters Plants",
            "",
            "&7> &eRight Click &7a water to fill your watering can",
            "&7> &eRight Click &7a plant to speed up growth.",
            "&7> &eRight Click &7a player to slow them down",
            "",
            "&aUses Left: &e0"
    );
    public static final SlimefunItemStack WATERING_CAN_GOLD = new SlimefunItemStack("WATERING_CAN_GOLD",
            new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
            "&bWatering Can [GOLD]",
            "",
            "&fWaters Plants",
            "",
            "&7> &eRight Click &7a water to fill your watering can",
            "&7> &eRight Click &7a plant to speed up growth.",
            "&7> &eRight Click &7a player to slow them down",
            "",
            "&aUses Left: &e0"
    );
    public static final SlimefunItemStack WATERING_CAN_DIAMOND = new SlimefunItemStack("WATERING_CAN_DIAMOND",
            new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
            "&bWatering Can [DIAMOND]",
            "",
            "&fWaters Plants",
            "",
            "&7> &eRight Click &7a water to fill your watering can",
            "&7> &eRight Click &7a plant to speed up growth.",
            "&7> &eRight Click &7a player to slow them down",
            "",
            "&aUses Left: &e0"
    );
    public static final SlimefunItemStack WATERING_CAN_EMERALD = new SlimefunItemStack("WATERING_CAN_EMERALD",
            new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
            "&bWatering Can [EMERALD]",
            "",
            "&fWaters Plants",
            "",
            "&7> &eRight Click &7a water to fill your watering can",
            "&7> &eRight Click &7a plant to speed up growth.",
            "&7> &eRight Click &7a player to slow them down",
            "",
            "&aUses Left: &e0"
    );
    public static final SlimefunItemStack WATERING_CAN_NETHERITE = new SlimefunItemStack("WATERING_CAN_NETHERITE",
            new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
            "&bWatering Can [NETHERITE]",
            "",
            "&fWaters Plants",
            "",
            "&7> &eRight Click &7a water to fill your watering can",
            "&7> &eRight Click &7a plant to speed up growth.",
            "&7> &eRight Click &7a player to slow them down",
            "",
            "&aUses Left: &e0"
    );
}
