package com.blocker.gameobjects;

import android.graphics.Color;

public abstract class MyObject {
    private Color minimapColor;
    private boolean transparent;

    public MyObject(Color minimapColor, boolean transparent) {
        this.minimapColor = minimapColor;
        this.transparent = transparent;
    }

    public Color getMinimapColor() {
        return minimapColor;
    }

    public boolean isTransparent() {
        return transparent;
    }

    /**
     * Method that allows children classes to change minimap color, i.g rotator will change
     * minimap color according to it's current facing.
     * @param color to be changed.
     */
    protected void changeColor(Color color) {
        this.minimapColor = color;
    }
}
