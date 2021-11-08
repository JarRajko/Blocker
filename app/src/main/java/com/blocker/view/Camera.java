package com.blocker.view;

import android.graphics.Point;

import com.blocker.player.Player;

public class Camera {

    private boolean locked;
    private Point position;

    public void update(Player player) {
        if (locked) position = player.getPlayerPosition();
    }

    public void lockCamera(boolean lock) {
        locked = lock;
    }

    public Point getPosition() {
        return position;
    }

    public boolean isLocked() {
        return locked;
    }
}
