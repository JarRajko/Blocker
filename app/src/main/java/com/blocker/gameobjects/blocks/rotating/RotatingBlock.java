package com.blocker.gameobjects.blocks.rotating;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;

import com.blocker.R;
import com.blocker.gameobjects.blocks.Block;
import com.blocker.world.Direction;

public abstract class RotatingBlock extends Block {
    private int northFacing;
    private int eastFacing;
    private int southFacing;
    private int westFacing;
    private Direction facing;

    public RotatingBlock(Color minimapColor, Resources resources, Direction facing, int[] textures) {
        super(minimapColor, false, R.drawable.missing_texture);
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
                super.setTexture_id(northFacing);
                break;
            case EAST:
                super.setTexture_id(eastFacing);
                break;
            case SOUTH:
                super.setTexture_id(southFacing);
                break;
            case WEST:
                super.setTexture_id(westFacing);
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
