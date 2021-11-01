package com.blocker.map;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.floor.Grass;

public class MapGenerator { //NOTE game could have more maps
    Resources resources;

    /*public MapGenerator(GameMap gameMap, Resources resources) {
        this.gameMap = gameMap;
        generateDefaultTestMap(resources);
    }*/

    public MapGenerator(Resources resources) {
        this.resources = resources;
    }


    public GameMap getTestMap() {
        GameMap defaultTestMap = new GameMap();
        for (int x = -250; x < 250; x++) {
            for (int y = -250; y < 250; y++) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    defaultTestMap.addToMap(new Grass(resources),new Point(x,y));
                }
            }
        }
        return defaultTestMap;
    }
}
