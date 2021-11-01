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

public class TurniketRotator extends RotatingBlock {


    public TurniketRotator(Resources resources, Direction facing) {
        super(Color.valueOf(100,200,50), resources, facing, new Bitmap[]{
                BitmapFactory.decodeResource(resources, R.drawable.turniketrotator_north_1),
                BitmapFactory.decodeResource(resources, R.drawable.turniketrotator_east_1),
                BitmapFactory.decodeResource(resources, R.drawable.turniketrotator_south_1),
                BitmapFactory.decodeResource(resources, R.drawable.turniketrotator_west_1)});
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
