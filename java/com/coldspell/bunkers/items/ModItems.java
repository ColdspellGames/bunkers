package com.coldspell.bunkers.items;

import com.coldspell.bunkers.BunkersMod;
import com.coldspell.bunkers.blocks.ModBlocks;
import com.coldspell.bunkers.items.items.ExplosiveResistantBlockItem;
import com.coldspell.bunkers.items.items.BunkiteArmorItem;
import com.coldspell.bunkers.items.items.FracturedBlockItem;
import com.coldspell.bunkers.items.items.UnbreakableBlockItem;
import com.coldspell.bunkers.items.items.enums.ModArmorMaterials;
import com.coldspell.bunkers.items.items.enums.ModTiers;
import com.coldspell.bunkers.util.BunkersCreativeTab;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BunkersMod.MOD_ID);

    //Items
    public static final RegistryObject<Item> BUNKITE_UPGRADE_SMITHING_TEMPLATE = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_upgrade_smithing_template", () -> new Item(new Item.Properties().stacksTo(64).fireResistant())));
    public static final RegistryObject<Item> BUNKITE_INGOT = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_ingot", () -> new Item(new Item.Properties().stacksTo(64).fireResistant())));
    public static final RegistryObject<Item> BUNKITE_SCRAPS = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_scraps", () -> new Item(new Item.Properties().stacksTo(64).fireResistant())));
    public static final RegistryObject<Item> STYLIZED_DUST = BunkersCreativeTab.addToTab(ITEMS.register("stylized_dust", () -> new Item(new Item.Properties().stacksTo(64).fireResistant())));

    //Tools
    public static final RegistryObject<Item> BUNKITE_SWORD = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_sword",
            () -> new SwordItem(ModTiers.BUNKITE, 3, -2.4F, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> BUNKITE_SHOVEL = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_shovel",
            () -> new ShovelItem(ModTiers.BUNKITE, 1.5F, -3.0F, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> BUNKITE_PICKAXE = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_pickaxe",
            () -> new PickaxeItem(ModTiers.BUNKITE, 1, -2.8F, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> BUNKITE_AXE = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_axe",
            () -> new AxeItem(ModTiers.BUNKITE, 5.0F, -3.0F, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> BUNKITE_HOE = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_hoe",
            () -> new HoeItem(ModTiers.BUNKITE, -4, 0.0F, new Item.Properties().fireResistant())));

    //Armor
    public static final RegistryObject<Item> BUNKITE_HELMET = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_helmet",
            () -> new BunkiteArmorItem(ModArmorMaterials.BUNKITE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> BUNKITE_CHESTPLATE = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_chestplate",
            () -> new BunkiteArmorItem(ModArmorMaterials.BUNKITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> BUNKITE_LEGGINGS = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_leggings",
            () -> new BunkiteArmorItem(ModArmorMaterials.BUNKITE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant())));
    public static final RegistryObject<Item> BUNKITE_BOOTS = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_boots",
            () -> new BunkiteArmorItem(ModArmorMaterials.BUNKITE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant())));


    //Block Items
    public static final RegistryObject<ExplosiveResistantBlockItem> BUNKITE_ROD_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_rod", () -> new ExplosiveResistantBlockItem(ModBlocks.BUNKITE_ROD.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> BUNKITE_LAMP_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_lamp", () -> new ExplosiveResistantBlockItem(ModBlocks.BUNKITE_LAMP.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<UnbreakableBlockItem> STYLIZED_PLATED_BUNKITE_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("stylized_plated_bunkite", () -> new UnbreakableBlockItem(ModBlocks.STYLIZED_PLATED_BUNKITE_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> STYLIZED_BUNKITE_PUSH_BLOCK_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("stylized_bunkite_push_block", () -> new ExplosiveResistantBlockItem(ModBlocks.STYLIZED_BUNKITE_PUSH_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> STYLIZED_BUNKITE_DOOR_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("stylized_bunkite_door", () -> new ExplosiveResistantBlockItem(ModBlocks.STYLIZED_BUNKITE_DOOR.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> STYLIZED_BUNKITE_TRAPDOOR_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("stylized_bunkite_trapdoor", () -> new ExplosiveResistantBlockItem(ModBlocks.STYLIZED_BUNKITE_TRAPDOOR.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> STYLIZED_BUNKITE_PRESSURE_PLATE_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("stylized_bunkite_pressure_plate", () -> new ExplosiveResistantBlockItem(ModBlocks.STYLIZED_BUNKITE_PRESSURE_PLATE.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> STYLIZED_BUNKITE_LADDER_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("stylized_bunkite_ladder", () -> new ExplosiveResistantBlockItem(ModBlocks.STYLIZED_BUNKITE_LADDER.get(), new Item.Properties().fireResistant())));


    public static final RegistryObject<ExplosiveResistantBlockItem> BUNKITE_DOOR_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_door", () -> new ExplosiveResistantBlockItem(ModBlocks.BUNKITE_DOOR.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> BUNKITE_TRAPDOOR_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_trapdoor", () -> new ExplosiveResistantBlockItem(ModBlocks.BUNKITE_TRAPDOOR.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> BUNKITE_PRESSURE_PLATE_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("bunkite_pressure_plate", () -> new ExplosiveResistantBlockItem(ModBlocks.BUNKITE_PRESSURE_PLATE.get(), new Item.Properties().fireResistant())));

    public static final RegistryObject<UnbreakableBlockItem> PLATED_BUNKITE_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("plated_bunkite", () -> new UnbreakableBlockItem(ModBlocks.PLATED_BUNKITE_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<UnbreakableBlockItem> PLATED_BUNKITE_STAIRS_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("plated_bunkite_stairs", () -> new UnbreakableBlockItem(ModBlocks.PLATED_BUNKITE_STAIRS_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<UnbreakableBlockItem> PLATED_BUNKITE_SLAB_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("plated_bunkite_slab", () -> new UnbreakableBlockItem(ModBlocks.PLATED_BUNKITE_SLAB_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<UnbreakableBlockItem> PLATED_BUNKITE_WALL_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("plated_bunkite_wall", () -> new UnbreakableBlockItem(ModBlocks.PLATED_BUNKITE_WALL_BLOCK.get(), new Item.Properties().fireResistant())));

    public static final RegistryObject<FracturedBlockItem> FRACTURED_PLATED_BUNKITE_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("fractured_plated_bunkite", () -> new FracturedBlockItem(ModBlocks.FRACTURED_PLATED_BUNKITE_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<FracturedBlockItem> FRACTURED_PLATED_BUNKITE_STAIRS_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("fractured_plated_bunkite_stairs", () -> new FracturedBlockItem(ModBlocks.FRACTURED_PLATED_BUNKITE_STAIRS_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<FracturedBlockItem> FRACTURED_PLATED_BUNKITE_SLAB_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("fractured_plated_bunkite_slab", () -> new FracturedBlockItem(ModBlocks.FRACTURED_PLATED_BUNKITE_SLAB_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<FracturedBlockItem> FRACTURED_PLATED_BUNKITE_WALL_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("fractured_plated_bunkite_wall", () -> new FracturedBlockItem(ModBlocks.FRACTURED_PLATED_BUNKITE_WALL_BLOCK.get(), new Item.Properties().fireResistant())));

    public static final RegistryObject<ExplosiveResistantBlockItem> STYLIZED_PLATED_BUNKITE_REPLICA_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("stylized_plated_bunkite_replica", () -> new ExplosiveResistantBlockItem(ModBlocks.STYLIZED_PLATED_BUNKITE_REPLICA_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> PLATED_BUNKITE_REPLICA_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("plated_bunkite_replica", () -> new ExplosiveResistantBlockItem(ModBlocks.PLATED_BUNKITE_REPLICA_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> PLATED_BUNKITE_STAIRS_REPLICA_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("plated_bunkite_stairs_replica", () -> new ExplosiveResistantBlockItem(ModBlocks.PLATED_BUNKITE_REPLICA_STAIRS_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> PLATED_BUNKITE_SLAB_REPLICA_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("plated_bunkite_slab_replica", () -> new ExplosiveResistantBlockItem(ModBlocks.PLATED_BUNKITE_REPLICA_SLAB_BLOCK.get(), new Item.Properties().fireResistant())));
    public static final RegistryObject<ExplosiveResistantBlockItem> PLATED_BUNKITE_WALL_REPLICA_ITEM = BunkersCreativeTab.addToTab(ITEMS.register("plated_bunkite_wall_replica", () -> new ExplosiveResistantBlockItem(ModBlocks.PLATED_BUNKITE_REPLICA_WALL_BLOCK.get(), new Item.Properties().fireResistant())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
