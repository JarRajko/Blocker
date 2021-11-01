package com.blocker.gameobjects.blocks.floor;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import com.blocker.R;
import com.blocker.gameobjects.blocks.Block;

import java.util.Random;

public abstract class Floor extends Block { //TODO unabstract

    public Floor(Color minimapColor, Resources resources) {
        super(minimapColor, false, resources);
    }


    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public boolean isAccesible() {
        return true;
    }

}
