/*package com.blocker.gameobjects.blocks;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;

public class Wall extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Wall(Resources resources) {
        super(Color.valueOf(0,0,0), false, resources);
        super.setTexture(BitmapFactory.decodeResource(resources, R.drawable.wall_1));
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public boolean isAccessible() {
        return false;
    }
}
*/