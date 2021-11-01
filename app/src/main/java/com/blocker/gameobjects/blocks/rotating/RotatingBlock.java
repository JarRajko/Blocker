package com.blocker.gameobjects.blocks.rotating;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;

import com.blocker.gameobjects.blocks.Block;
import com.blocker.world.Direction;

public abstract class RotatingBlock extends Block {
    private Bitmap northFacing;
    private Bitmap eastFacing;
    private Bitmap southFacing;
    private Bitmap westFacing;
    private Direction facing;

    public RotatingBlock(Color minimapColor, Resources resources, Direction facing, Bitmap[] textures) {
        super(minimapColor, false, resources);
        northFacing = textures[0];
        eastFacing = textures[1];
        southFacing = textures[2];
        westFacing = textures[3];
        this.facing = facing;
        updateTexture();
    }

    private void updateTexture() {
        switch (facing) {
            case NORTH:
                super.setTexture(northFacing);
                break;
            case EAST:
                super.setTexture(eastFacing);
                break;
            case SOUTH:
                super.setTexture(southFacing);
                break;
            case WEST:
                super.setTexture(westFacing);
                break;
        }
    }

    public Direction getFacing() {
        return facing;
    }

    public void rotateClockWise(Direction facing) {
        this.facing = Direction.rotateClockWise(facing);
        updateTexture();
    }

    public void rotateCounterClockWise(Direction facing) {
        this.facing = Direction.rotateCounterClockWise(facing);
        updateTexture();
    }

    public void rotateInOppositeDirection(Direction facing) {
        this.facing = Direction.rotateInOppositeDirection(facing);
        updateTexture();
    }
}
