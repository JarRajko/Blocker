package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Brick extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Brick() {
        super(Color.valueOf(178,34,34), false, false, false);
    }
}
