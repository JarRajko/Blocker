package com.blocker.player;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;

import com.blocker.R;
import com.blocker.world.Direction;

public class Player {

    private Direction facing;
    private Point position;
    private int strength;
    private int agility;
    private Bitmap bmp;

    public Player(Resources resources) {
        facing = Direction.NORTH;
        position = new Point(0,0);
        strength = 1;
        agility = 1;
        bmp = BitmapFactory.decodeResource(resources, R.drawable.down1);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawBitmap(bmp, position.x,position.y, null); //TODO center to middle
    }

    public void update() {
        position.x = 100;
    }
}
