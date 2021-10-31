package com.blocker.gameobjects.blocks.activable;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.RotatingBlock;

public class Turniket extends RotatingBlock {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Turniket() {
        super(Color.valueOf(200,25,25), false, false, false, 200, 25, 25);
    }
}
