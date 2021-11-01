package com.blocker.gameobjects.items;

import android.content.res.Resources;
import android.graphics.Color;
import com.blocker.gameobjects.items.Item;
public class AntiHammer extends Item {
    public AntiHammer(Resources resources) {
        super(Color.valueOf(80,155,235), true, true, resources);
    }
}
