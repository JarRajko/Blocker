package com.blocker.map;

import android.graphics.Point;

import com.blocker.gameobjects.MyObject;

public class GameMap {
    private final int width = 3000; //x
    private final int height = 3000;//y
    MyObject[][] map = new MyObject[width][height];

    /**
     * Function adds Object of type MyObject to the map array.
     * @param Type of object to be added to map array.
     * @param point in map array for the object to be added to.
     */
    public void addToMap(MyObject object, Point point) {
        map[point.x][point.y] = object;
    }

    public void removeFromMap(Point point) { //TODO

    }

    /**
     * Function returns the object from the map array on given coordinates
     * @param point from which map array object should be accessed
     * @return MyObject from the map array
     */
    public MyObject getObjectFromMap(Point point) {
        return map[point.x][point.y];
    }
}
