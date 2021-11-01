package com.blocker.gameobjects.blocks.activable;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.Block;
import com.blocker.player.Player;

public class Gate extends Block implements IActivable { //TODO
    private boolean locked = true;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Gate(Resources resources) {
        super(Color.valueOf(150,150,150), true, resources);
    }

    public void unlock() { //TODO
        locked = true;
    }

    @Override
    public boolean activate(Player player) {
        return false;
    }

    @Override
    public boolean isPushable() { //TODO
        return false;
    }

    @Override
    public boolean isAccesible() { //TODO
        return false;
    }
}
