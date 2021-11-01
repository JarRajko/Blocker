package com.blocker.gameobjects;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import com.blocker.R;

public abstract class MyObject {
    private Color minimapColor;
    private boolean transparent;
    protected Bitmap texture;

    public MyObject(Color minimapColor, boolean transparent, Resources resources) {
        this.minimapColor = minimapColor;
        this.transparent = transparent;
        this.texture = BitmapFactory.decodeResource(resources, R.drawable.missing_texture);
    }

    public Color getMinimapColor() {
        return minimapColor;
    }

    public boolean isTransparent() {
        return transparent;
    }

    public Bitmap getTexture() {
        return texture;
    }

    public void setTexture(Bitmap texture) {
        this.texture = texture;
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
