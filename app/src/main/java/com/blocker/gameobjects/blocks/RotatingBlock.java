package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.world.Direction;

public class RotatingBlock extends Block {

    private Direction facing;
    private int redColor;
    private int greenColor;
    private int blueColor;

    public RotatingBlock(Color minimapColor, boolean transparent, boolean pushable, boolean accesible, int redColor, int greenColor, int blueColor) {
        super(minimapColor, transparent, pushable, accesible);
    }

    /**
     * Changes facing direction and also changes minimap color according to the facing position.
     */
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void changeDirection() {
        facing = Direction.rotateClockWise(facing);
        if (redColor > greenColor && redColor > blueColor) { //The main color does not change it's value, highest value color is main color
            greenColor = getColorShade(facing);
            blueColor = getColorShade(facing);
        } else if (blueColor > greenColor && blueColor > redColor) {
            greenColor = getColorShade(facing);
            redColor = getColorShade(facing);
        } else {
            blueColor = getColorShade(facing);
            redColor = getColorShade(facing);
        }
        super.changeColor(Color.valueOf(redColor,greenColor,blueColor));
    }

    public void setFacing(Direction facing) {
        this.facing = facing;
    }

    /**
     * Method returns shade of rgb color part to be shown on minimap
     * with fixed values.
     * @param direction for fixed values
     * @return
     */
    private int getColorShade(Direction direction) {
        if (direction == Direction.NORTH) return 25;
        else if (direction == Direction.WEST) return 50;
        else if (direction == Direction.SOUTH) return 75;
        else return 100;
    }
}
