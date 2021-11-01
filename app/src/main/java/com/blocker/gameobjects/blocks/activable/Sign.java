package com.blocker.gameobjects.blocks.activable;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;
import com.blocker.gameobjects.blocks.Block;
import com.blocker.player.Player;

public class Sign extends Block implements IActivable {

    private Resources resources;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Sign(Resources resources) {
        super(Color.valueOf(250,190,125), true, resources);
        this.resources = resources; //Parameter resources due to intention to change icon later on
    }

    @Override
    public boolean activate(Player player) {
        read();
        return true;
    }

    private void read() {
        this.setTexture(BitmapFactory.decodeResource(resources, R.drawable.sign_seen_1));
    }

    @Override
    public boolean isPushable() { //TODO maybe?....
        return false;
    }

    @Override
    public boolean isAccesible() {
        return false;
    }
}
