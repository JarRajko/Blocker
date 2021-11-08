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
    private Point playerPositionOnMap = new Point(5,5);

    private int testCounter = 0;

    public Player(Resources resources) {
        inventory = new Inventory();
        facing = Direction.NORTH;
        position = new Point(0,0);
        strength = 1;
        agility = 1;
        playerTexture = BitmapFactory.decodeResource(resources, R.drawable.player_down_1);
    }

    public void moveUp() {
        position.y--;
    }

    public void moveDown() {
        position.y++;
    }

    public void moveLeft() {
        position.x--;
    }

    public void moveRight() {
        position.x++;
    }

    public int getPlayerTextureId() {
        return R.drawable.player_down_1;
    }

    public Point getPlayerPosition() {
        return position;
    }
}
