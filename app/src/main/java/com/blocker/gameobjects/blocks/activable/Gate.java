package com.blocker.gameobjects.blocks.activable;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;
import com.blocker.gameobjects.blocks.Block;
import com.blocker.player.Player;

public class Gate extends Block implements IActivable { //TODO
    private boolean locked = true;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Gate() {
        super(Color.valueOf(150,150,150), true, R.drawable.gate_closed_1);
    }

    public void unlock() { //TODO
        locked = false;
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
    public boolean isAccessible() { //TODO
        return false;
    }

}
