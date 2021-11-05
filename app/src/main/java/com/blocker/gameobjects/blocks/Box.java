package com.blocker.gameobjects.blocks;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;

public class Box extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Box() {
        super(Color.valueOf(205,160,100), false, R.drawable.box_1 );
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
