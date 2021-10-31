package com.blocker.gameobjects.blocks.activable;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.Block;

public class Gate extends Block { //TODO
    private boolean locked = true;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Gate() {
        super(Color.valueOf(150,150,150), true, false, false);
    }

    public void unlock() { //TODO
        locked = true;
    }
}
