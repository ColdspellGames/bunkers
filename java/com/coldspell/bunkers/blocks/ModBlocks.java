package com.coldspell.bunkers.blocks;

import com.coldspell.bunkers.BunkersMod;
import com.coldspell.bunkers.blocks.blocks.BunkiteLadderBlock;
import com.coldspell.bunkers.blocks.blocks.BunkitePushBlock;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BunkersMod.MOD_ID);

    public static final RegistryObject<Block> PLATED_BUNKITE_BLOCK = BLOCKS.register("plated_bunkite",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(-1.0F, 1200.0F)));
    public static final RegistryObject<Block> PLATED_BUNKITE_STAIRS_BLOCK = BLOCKS.register("plated_bunkite_stairs",
            () -> new StairBlock(PLATED_BUNKITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PLATED_BUNKITE_BLOCK.get())));
    public static final RegistryObject<Block> PLATED_BUNKITE_SLAB_BLOCK = BLOCKS.register("plated_bunkite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(PLATED_BUNKITE_BLOCK.get())));
    public static final RegistryObject<Block> PLATED_BUNKITE_WALL_BLOCK = BLOCKS.register("plated_bunkite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(PLATED_BUNKITE_BLOCK.get())));

    public static final RegistryObject<Block> PLATED_BUNKITE_REPLICA_BLOCK = BLOCKS.register("plated_bunkite_replica",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.0F, 1200.0F)));
    public static final RegistryObject<Block> PLATED_BUNKITE_REPLICA_STAIRS_BLOCK = BLOCKS.register("plated_bunkite_stairs_replica",
            () -> new StairBlock(PLATED_BUNKITE_REPLICA_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(PLATED_BUNKITE_REPLICA_BLOCK.get())));
    public static final RegistryObject<Block> PLATED_BUNKITE_REPLICA_SLAB_BLOCK = BLOCKS.register("plated_bunkite_slab_replica",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(PLATED_BUNKITE_REPLICA_BLOCK.get())));
    public static final RegistryObject<Block> PLATED_BUNKITE_REPLICA_WALL_BLOCK = BLOCKS.register("plated_bunkite_wall_replica",
            () -> new WallBlock(BlockBehaviour.Properties.copy(PLATED_BUNKITE_REPLICA_BLOCK.get())));
    public static final RegistryObject<Block> STYLIZED_PLATED_BUNKITE_REPLICA_BLOCK = BLOCKS.register("stylized_plated_bunkite_replica",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(1.0F, 1200.0F).noOcclusion().pushReaction(PushReaction.DESTROY).lightLevel((p_152686_) -> {
                return 14;
            })));

    public static final RegistryObject<Block> FRACTURED_PLATED_BUNKITE_BLOCK = BLOCKS.register("fractured_plated_bunkite",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(-1.0F, 0F)));
    public static final RegistryObject<Block> FRACTURED_PLATED_BUNKITE_STAIRS_BLOCK = BLOCKS.register("fractured_plated_bunkite_stairs",
            () -> new StairBlock(FRACTURED_PLATED_BUNKITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(FRACTURED_PLATED_BUNKITE_BLOCK.get())));
    public static final RegistryObject<Block> FRACTURED_PLATED_BUNKITE_SLAB_BLOCK = BLOCKS.register("fractured_plated_bunkite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(FRACTURED_PLATED_BUNKITE_BLOCK.get())));
    public static final RegistryObject<Block> FRACTURED_PLATED_BUNKITE_WALL_BLOCK = BLOCKS.register("fractured_plated_bunkite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(FRACTURED_PLATED_BUNKITE_BLOCK.get())));

    public static final RegistryObject<Block> BUNKITE_ROD = BLOCKS.register("bunkite_rod",
            () -> new EndRodBlock(BlockBehaviour.Properties.of().forceSolidOff().strength(1.0F, 1200.0F).lightLevel((p_152686_) -> {
                return 14;
            }).sound(SoundType.GLASS).noOcclusion()));
    public static final RegistryObject<Block> BUNKITE_LAMP = BLOCKS.register("bunkite_lamp",
            () -> new Block(BlockBehaviour.Properties.copy(BUNKITE_ROD.get())));


    public static final RegistryObject<Block> BUNKITE_DOOR = BLOCKS.register("bunkite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(25.0F, 1200.0F).noOcclusion(), BlockSetType.STONE));
    public static final RegistryObject<Block> BUNKITE_TRAPDOOR = BLOCKS.register("bunkite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(BUNKITE_DOOR.get()), BlockSetType.STONE));
    public static final RegistryObject<Block> BUNKITE_PRESSURE_PLATE = BLOCKS.register("bunkite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(BUNKITE_DOOR.get()), BlockSetType.STONE));

    public static final RegistryObject<Block> STYLIZED_PLATED_BUNKITE_BLOCK = BLOCKS.register("stylized_plated_bunkite",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(-1.0F, 1200.0F).noOcclusion().pushReaction(PushReaction.DESTROY).lightLevel((p_152686_) -> {
                return 14;
            })));
    public static final RegistryObject<Block> STYLIZED_BUNKITE_PUSH_BLOCK = BLOCKS.register("stylized_bunkite_push_block",
            () -> new BunkitePushBlock(BlockBehaviour.Properties.of().forceSolidOff().strength(25.0F, 1200.0F).sound(SoundType.LADDER).noOcclusion().pushReaction(PushReaction.DESTROY).lightLevel((p_152686_) -> {
                return 14;
            })));
    public static final RegistryObject<Block> STYLIZED_BUNKITE_DOOR = BLOCKS.register("stylized_bunkite_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(25.0f, 1200.0F).noOcclusion().pushReaction(PushReaction.DESTROY).lightLevel((p_152686_) -> {
                return 14;
            }), BlockSetType.STONE));
    public static final RegistryObject<Block> STYLIZED_BUNKITE_TRAPDOOR = BLOCKS.register("stylized_bunkite_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(25.0f, 1200.0F).noOcclusion().pushReaction(PushReaction.DESTROY).lightLevel((p_152686_) -> {
                return 14;
            }), BlockSetType.STONE));

    public static final RegistryObject<Block> STYLIZED_BUNKITE_PRESSURE_PLATE = BLOCKS.register("stylized_bunkite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(25.0f, 1200.0F).noOcclusion().pushReaction(PushReaction.DESTROY).lightLevel((p_152686_) -> {
                return 14;
            }), BlockSetType.STONE));
    public static final RegistryObject<Block> STYLIZED_BUNKITE_LADDER = BLOCKS.register("stylized_bunkite_ladder",
            () -> new BunkiteLadderBlock(BlockBehaviour.Properties.of().forceSolidOff().strength(0.4F, 1200.0F).sound(SoundType.LADDER).noOcclusion().pushReaction(PushReaction.DESTROY).lightLevel((p_152686_) -> {
                return 14;
            })));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
