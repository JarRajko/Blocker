package com.blocker.gameobjects.blocks;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;

import com.blocker.gameobjects.MyObject;

import java.util.Random;

public abstract class Block extends MyObject {

    private boolean pushable;
    private boolean accesible;

    public Block(Color minimapColor, boolean transparent, int texture_id) {
        super(minimapColor, transparent, texture_id);
    }

   /* protected void setTexture(Bitmap[] textures) {
        Random rand = new Random();
        this.texture_id = textures[rand.nextInt(textures.length)];
    }*/

    public abstract boolean isPushable(); //TODO add parameters map and player or sth maybe new class

    public abstract boolean isAccessible(); //TODO add parameters map and player or sth maybe new class



}
