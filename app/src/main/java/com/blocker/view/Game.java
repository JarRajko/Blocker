package com.blocker.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

import com.blocker.R;
import com.blocker.player.Player;

public class Game extends View {
    private Player player;
    private Thread gameLoop;

    public Game(Context context) {
        super(context);
        player = new Player(getResources());
        gameLoop = new Thread(new GameLoop(this));
        gameLoop.start();
    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.CYAN);
        player.onDraw(canvas);
    }

    public void update() {
        player.update();
    }
}