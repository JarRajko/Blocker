package com.blocker.gameobjects.items;

import android.content.res.Resources;
import android.graphics.Color;
import com.blocker.gameobjects.items.Item;
public class AntiChickenLeg extends Item {
    public AntiChickenLeg(Resources resources) {
        super(Color.valueOf(30,130,240), true, true, resources);
    }
}
