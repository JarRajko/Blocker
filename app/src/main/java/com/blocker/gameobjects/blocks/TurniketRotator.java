package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class TurniketRotator extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public TurniketRotator() {
        super(Color.valueOf(130,150,100), false, false, false);
    }
}
