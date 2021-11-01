package com.blocker.map;

import android.graphics.Canvas;
import android.graphics.Point;

import com.blocker.gameobjects.MyObject;

import java.util.ArrayList;

public class GameMap {
    ArrayList<MyObject> map = new ArrayList<>();

    public void addToMap(MyObject object, Point point) {

    }

    public void removeFromMap(Point point) { //TODO

    }

    /**
     * Function returns the object from the map array on given coordinates
     * @param point from which map array object should be accessed
     * @return MyObject from the map array
     */
    public MyObject getObjectFromMap(Point point) { //TODO
        return null;
    }

    public void update() {

    }

    public void onDraw(Canvas canvas) {

    }
}
