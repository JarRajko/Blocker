package com.blocker.gameobjects;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;

import com.blocker.R;

public abstract class MyObject {
    private Color minimapColor;
    private boolean transparent;
    protected int texture_id;

    public MyObject(Color minimapColor, boolean transparent, int texture_id) {
        this.minimapColor = minimapColor;
        this.transparent = transparent;
        this.texture_id = R.drawable.missing_texture;
    }

    public Color getMinimapColor() {
        return minimapColor;
    }

    public boolean isTransparent() {
        return transparent;
    }

    public int getTexture_id() {
        return texture_id;
    }

    public void setTexture_id(int texture_id) {
        this.texture_id = texture_id;
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
