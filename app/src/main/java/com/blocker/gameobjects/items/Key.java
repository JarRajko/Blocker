package com.blocker.gameobjects.items;

import android.content.res.Resources;
import android.graphics.Color;
import com.blocker.gameobjects.items.Item;

public class Key extends Item {
    public Key(Resources resources) {
        super(Color.valueOf(230,220,85), true, true, resources);
    }
}
