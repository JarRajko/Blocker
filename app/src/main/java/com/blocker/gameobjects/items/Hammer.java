package com.blocker.gameobjects.items;

import android.content.res.Resources;
import android.graphics.Color;
import com.blocker.gameobjects.items.Item;
public class Hammer extends Item {
    public Hammer(Resources resources) {
        super(Color.valueOf(175,100,20), true, true, resources);
    }
}
