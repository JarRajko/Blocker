package com.blocker.gameobjects.blocks;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;

import java.util.Random;

public class Gravel extends Block {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public Gravel(Resources resources) {
        super(Color.valueOf(146,142,133), false, resources);
        Bitmap[] textures = {BitmapFactory.decodeResource(resources, R.drawable.gravel_1),
                BitmapFactory.decodeResource(resources, R.drawable.gravel_2),
                BitmapFactory.decodeResource(resources, R.drawable.gravel_3),
                BitmapFactory.decodeResource(resources, R.drawable.gravel_4)};
        super.setTexture(textures);
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
