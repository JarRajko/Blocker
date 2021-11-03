package com.blocker.map;

import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Log;
import android.util.Pair;

import com.blocker.gameobjects.MyObject;
import com.blocker.gameobjects.blocks.Block;
import com.blocker.gameobjects.blocks.floor.Floor;

import java.util.ArrayList;

public class GameMap {
    private ArrayList<Pair<MyObject,Point>> map = new ArrayList<>();
    private int mapWidth; //width  in blocks i.e grid each block is 32x32 pixels
    private int mapHeight; //height ------------------||---------------------

    public GameMap(int mapWidth, int mapHeight) {
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
    }

    public void addToMap(MyObject object, Point point) {
        map.add(new Pair(object,point));
    }

    public boolean removeFromMap(Point point) { //TODO
        return true;
    }

    /**
     * Function returns the object from the map array on given coordinates
     * @param point from which map array object should be accessed
     * @return MyObject from the map array
     */
    public MyObject getObjectFromMap(Point point) {
        for (int i = 0; i < map.size(); i++) {
            if ( (map.get(i).second.x == point.x) && (map.get(i).second.y == point.y) ) return map.get(i).first;
        }
        return null;
    }


    public Point getSize() {
        return new Point(mapWidth,mapHeight);
    }

}
