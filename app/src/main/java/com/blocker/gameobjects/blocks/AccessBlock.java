package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.world.Direction;

public class AccessBlock extends Block {

    private Direction facing;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public AccessBlock(Direction facing) {
        super(Color.valueOf(0,0,0), false, false, false);
        if (facing == Direction.NORTH) super.changeColor(Color.valueOf(255,100,100));
        else if (facing == Direction.WEST) super.changeColor(Color.valueOf(100,255,100));
        else if (facing == Direction.NORTH) super.changeColor(Color.valueOf(100,100,255));
        else super.changeColor(Color.valueOf(255,100,255));
    }
}
