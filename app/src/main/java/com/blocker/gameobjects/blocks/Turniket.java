package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Turniket extends RotatingBlock {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Turniket() {
        super(Color.valueOf(200,25,25), false, false, false, 200, 25, 25);
    }
}
