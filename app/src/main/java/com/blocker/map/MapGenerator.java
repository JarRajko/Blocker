package com.blocker.map;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.Box;
import com.blocker.gameobjects.blocks.floor.Grass;

import java.util.Random;

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
        GameMap defaultTestMap = new GameMap(100,100); //24 on 13 is what can fit test device, last row and line are cropped
        Random rand = new Random();
        for (int x = 0; x < defaultTestMap.getSize().x; x++) {

            for (int y = 0; y < defaultTestMap.getSize().y; y++) {
                int u = rand.nextInt(5);
                    if (u == 3) defaultTestMap.addToMap(new Box(),new Point(x,y));
                    else defaultTestMap.addToMap(new Grass(),new Point(x,y));
            }
        }
        return defaultTestMap;
    }
}
