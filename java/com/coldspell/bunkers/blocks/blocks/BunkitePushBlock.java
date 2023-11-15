package com.coldspell.bunkers.blocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.entity.EntityTickList;
import net.minecraftforge.event.entity.living.LivingEvent;

public class BunkitePushBlock extends DirectionalBlock {

    public BunkitePushBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.SOUTH));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55125_) {
        p_55125_.add(FACING);
    }

    public BlockState rotate(BlockState p_55115_, Rotation p_55116_) {
        return p_55115_.setValue(FACING, p_55116_.rotate(p_55115_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_55112_, Mirror p_55113_) {
        return p_55112_.rotate(p_55113_.getRotation(p_55112_.getValue(FACING)));
    }


    public BlockState getStateForPlacement(BlockPlaceContext p_55087_) {
        return this.defaultBlockState().setValue(FACING, p_55087_.getNearestLookingDirection().getOpposite());
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        this.mover(blockState,entity);
        super.stepOn(level, blockPos, blockState, entity);
    }

    public void mover(BlockState blockState, Entity entity) {
        if (entity instanceof LivingEntity || entity instanceof ItemEntity) {
            double bounce = 0.85D;
            double bounceSlide = 0.85D;
            double slide = 0.2D;

            double x = entity.getDeltaMovement().x;
            double y = entity.getDeltaMovement().y;
            double z = entity.getDeltaMovement().z;

            if (blockState.getValue(FACING) == Direction.UP) {
                entity.setDeltaMovement(x * bounceSlide, y + bounce, z * bounceSlide);
            } else if (blockState.getValue(FACING) == Direction.NORTH) {
                entity.setDeltaMovement(x, y, z - slide);
            } else if (blockState.getValue(FACING) == Direction.SOUTH) {
                entity.setDeltaMovement(x, y, z + slide);
            } else if (blockState.getValue(FACING) == Direction.EAST) {
                entity.setDeltaMovement(x + slide, y, z);
            } else if (blockState.getValue(FACING) == Direction.WEST) {
                entity.setDeltaMovement(x - slide, y , z);
            }
            if (entity instanceof ItemEntity item) {
                item.setExtendedLifetime();
            }
        }
    }
}