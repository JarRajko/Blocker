package com.blocker.gameobjects.blocks.floor;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.Block;

public class Grass extends Block implements IFloor {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Grass() {
        super(Color.valueOf(135,220,50), false, false, true);
    }

    @Override
    public boolean isFloor() {
        return true;
    }
}
