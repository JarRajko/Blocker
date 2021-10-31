package com.blocker.gameobjects.blocks.activable;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.Block;

public class Sign extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Sign() {
        super(Color.valueOf(250,190,125), true, false, false);
    }
}
