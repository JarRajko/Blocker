package com.blocker.map;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.floor.Grass;

public class MapGenerator { //NOTE game could have more maps
    private Resources resources; //TODO remove ?

    /*public MapGenerator(GameMap gameMap, Resources resources) {
        this.gameMap = gameMap;
        generateDefaultTestMap(resources);
    }*/

    public MapGenerator(Resources resources) {
        this.resources = resources;
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public GameMap getTestMap() {
        GameMap defaultTestMap = new GameMap(500,500); //24 on 13 is what can fit test device, last row and line are cropped
        Log.e("Debug log: " , "method start");
        for (int x = -250; x < 251; x++) {
            //Log.e("Debug log: " , "x = " + x);
            for (int y = -250; y < 251; y++) {
                    defaultTestMap.addToMap(new Grass(),new Point(x,y));
            }
        }
        Log.e("Debug log: " , "Returning game map instance " + defaultTestMap);
        return defaultTestMap;
    }
}
