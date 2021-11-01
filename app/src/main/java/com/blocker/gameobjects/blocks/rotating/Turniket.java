package com.blocker.gameobjects.blocks.rotating;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import com.blocker.R;
import com.blocker.gameobjects.blocks.rotating.RotatingBlock;
import com.blocker.world.Direction;

/**
 * All turnikets blocks rotates after player makes *agility* moves on this type of block
 */
public class Turniket extends RotatingBlock {


    public Turniket(Resources resources, Direction facing) {
        super(Color.valueOf(75,150,35), resources, facing, new Bitmap[]{
                BitmapFactory.decodeResource(resources, R.drawable.turniket_north_1),
                BitmapFactory.decodeResource(resources, R.drawable.turniket_east_1),
                BitmapFactory.decodeResource(resources, R.drawable.turniket_south_1),
                BitmapFactory.decodeResource(resources, R.drawable.turniket_west_1)});
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
