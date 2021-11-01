package com.blocker.gameobjects.blocks.floor;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import com.blocker.R;
import com.blocker.gameobjects.blocks.Block;

public class RockyFloor extends Floor {
    public RockyFloor(Resources resources) {
        super(Color.valueOf(200,200,200),  resources);
        Bitmap[] bitmap = {BitmapFactory.decodeResource(resources, R.drawable.rocky_floor_1),
                BitmapFactory.decodeResource(resources, R.drawable.rocky_floor_2),
                BitmapFactory.decodeResource(resources, R.drawable.rocky_floor_3),
                BitmapFactory.decodeResource(resources, R.drawable.rocky_floor_4)};
        super.setTexture(bitmap);
    }
}
