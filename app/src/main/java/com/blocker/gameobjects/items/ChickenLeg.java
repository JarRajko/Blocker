package com.blocker.gameobjects.items;

import android.content.res.Resources;
import android.graphics.Color;
import com.blocker.gameobjects.items.Item;
public class ChickenLeg extends Item {
    public ChickenLeg(Resources resources) {
        super(Color.valueOf(225,125,15), true, true, resources);
    }
}
