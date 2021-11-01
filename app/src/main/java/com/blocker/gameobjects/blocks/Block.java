package com.blocker.gameobjects.blocks;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.MyObject;
import com.blocker.gameobjects.blocks.activable.IActivable;
import com.blocker.gameobjects.blocks.rotating.RotatingBlock;
import com.blocker.player.Player;
import com.blocker.world.Direction;

import java.util.Random;

public abstract class Block extends MyObject {

    private boolean pushable;
    private boolean accesible;

    public Block(Color minimapColor, boolean transparent, Resources resources) {
        super(minimapColor, transparent,resources);
    }

    public void setTexture(Bitmap[] textures) {
        Random rand = new Random();
        this.texture = textures[rand.nextInt(textures.length)];
    }

    public abstract boolean isPushable(); //TODO add parameters map and player or sth maybe new class

    public abstract boolean isAccesible(); //TODO add parameters map and player or sth maybe new class



}
