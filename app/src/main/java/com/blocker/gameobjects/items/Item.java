package com.blocker.gameobjects.items;

import android.content.res.Resources;
import android.graphics.Color;

import com.blocker.gameobjects.MyObject;
import com.blocker.gameobjects.items.Item;

public abstract class Item extends MyObject {

    private boolean pickable;

    public Item(Color minimapColor, boolean isTransparent, boolean pickable, int texture_id) {
        super(minimapColor, isTransparent, texture_id);
        this.pickable = pickable;
    }

    /**
     * Method to change pickable property of item.
     * @param pickable set the pickability of the object, true for pickable false for unpickable
     */
    public void setPickable(boolean pickable) {
        this.pickable = pickable;
    }

    public boolean isPickable() {
        return pickable;
    }
}
