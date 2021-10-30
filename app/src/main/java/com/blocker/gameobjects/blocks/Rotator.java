package com.blocker.gameobjects.blocks;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.world.Direction;

public class Rotator extends RotatingBlock {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Rotator(Color minimapColor, boolean transparent, boolean pushable, boolean accesible) {
        super(Color.valueOf(200,25,25), false, false, false,200,25,25);
        super.setFacing(Direction.NORTH);
    }



}
