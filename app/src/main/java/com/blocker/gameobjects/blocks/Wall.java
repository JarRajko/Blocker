package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Wall extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Wall() {
        super(Color.valueOf(0,0,0), false, false, false);
    }
}
