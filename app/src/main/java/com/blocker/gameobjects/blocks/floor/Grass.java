package com.blocker.gameobjects.blocks.floor;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;
import com.blocker.gameobjects.blocks.Block;

import java.util.Random;

public class Grass extends Floor {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Grass(Resources resources) {
        super(Color.valueOf(135,220,50), resources);
        Bitmap[] bitmap = {BitmapFactory.decodeResource(resources, R.drawable.grass_1),
                BitmapFactory.decodeResource(resources, R.drawable.grass_2),
                BitmapFactory.decodeResource(resources, R.drawable.grass_3),
                BitmapFactory.decodeResource(resources, R.drawable.grass_4)};
        super.setTexture(bitmap);
    }


}
