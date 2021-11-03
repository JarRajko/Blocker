/*package com.blocker.gameobjects.blocks;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;

public class Brick extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Brick(Resources resources) {
        super(Color.valueOf(178,34,34), false, resources);
        super.setTexture(BitmapFactory.decodeResource(resources, R.drawable.brick_1));
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
*/