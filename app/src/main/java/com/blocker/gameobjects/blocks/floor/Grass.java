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

    private int[] textures = {R.drawable.grass_1,
            R.drawable.grass_2,
            R.drawable.grass_3,
            R.drawable.grass_4};

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Grass() {
        super(Color.valueOf(135,220,50), R.drawable.missing_texture);
        Random rand = new Random();
        super.setTexture_id(textures[rand.nextInt(textures.length)]);
    }

    public Grass(int grassType) {
        super(Color.valueOf(135,220,50), R.drawable.missing_texture);
        super.setTexture_id(textures[grassType]);
    }


}
