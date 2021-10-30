package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Gravel extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Gravel() {
        super(Color.valueOf(146,142,133), false, false, true);
    }
}
