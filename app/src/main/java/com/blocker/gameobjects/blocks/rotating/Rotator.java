package com.blocker.gameobjects.blocks.rotating;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;
import com.blocker.gameobjects.blocks.rotating.RotatingBlock;
import com.blocker.world.Direction;

/**
 * Rotator rotates after player moves trough this block
 */
public class Rotator extends RotatingBlock {


    public Rotator(Resources resources, Direction facing) {
        super(Color.valueOf(255,100,80), resources, facing, new Bitmap[]{
                BitmapFactory.decodeResource(resources, R.drawable.rotator_north_1),
                BitmapFactory.decodeResource(resources, R.drawable.rotator_east_1),
                BitmapFactory.decodeResource(resources, R.drawable.rotator_south_1),
                BitmapFactory.decodeResource(resources, R.drawable.rotator_west_1)});
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
