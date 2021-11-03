package com.blocker.gameobjects.blocks.rotating;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.R;
import com.blocker.gameobjects.blocks.Block;
import com.blocker.world.Direction;

public class AccessBlock extends RotatingBlock {

    public AccessBlock(Resources resources, Direction facing) {
        super(Color.valueOf(255,100,100), resources, facing, new int[]{
                 R.drawable.accessblock_north_1,
                 R.drawable.accessblock_east_1,
                R.drawable.accessblock_south_1,
                R.drawable.accessblock_west_1});
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
