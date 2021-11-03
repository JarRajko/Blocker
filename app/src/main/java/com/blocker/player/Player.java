package com.blocker.player;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Log;

import com.blocker.R;
import com.blocker.world.Direction;

public class Player {

    private Direction facing;
    private Point position;
    private int strength;
    private int agility;
    private Bitmap playerTexture;
    private Inventory inventory;

    public Player(Resources resources) {
        inventory = new Inventory();
        facing = Direction.NORTH;
        position = new Point(50,50);
        strength = 1;
        agility = 1;
        playerTexture = BitmapFactory.decodeResource(resources, R.drawable.player_down_1);
    }

    public void onDraw(Canvas canvas) {
        //System.out.println("Width is " + canvas.getWidth() + " and height is " + canvas.getHeight());
        canvas.drawBitmap(playerTexture, position.x,position.y, null); //TODO center to middle
    }

    public void update() { //TODO controls that move player
        position.y = 0;
    }
}
