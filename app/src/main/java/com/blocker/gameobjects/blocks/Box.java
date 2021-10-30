package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Box extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Box() {
        super(Color.valueOf(205,160,100), false, false, false);
    }
}
