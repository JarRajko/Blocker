package com.blocker.gameobjects.blocks;

import android.graphics.Color;
import com.blocker.gameobjects.MyObject;

public abstract class Block extends MyObject {

    private boolean pushable;
    private boolean accesible;

    public Block(Color minimapColor, boolean transparent, boolean pushable, boolean accesible) {
        super(minimapColor, transparent);
    }

    public boolean isPushable() {
        return pushable;
    }

    public boolean isAccesible() {
        return accesible;
    }
}
