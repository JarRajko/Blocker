package com.blocker.view;

import android.graphics.Canvas;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;

import androidx.annotation.RequiresApi;

import java.time.Instant;

// Author Peter Strycek
public class GameLoop implements Runnable  {
    private final Game game;
    private boolean isRunning;
    private int counter = 0;
    private static final int updateCap = 60;

    public GameLoop(Game game) {
        this.game = game;
        isRunning = true;
    }

    public void startLoop() {
        isRunning = true;
    }

    @Override
    public void run() {

        long startTime = System.nanoTime();
        long updateStartTime = System.nanoTime();
        float lag = 0.0f;
        //Game Loop
        while(isRunning) {
            try {
                float msPerUpdate = (1000.0f / updateCap);
                long time = System.nanoTime();
                float updateTime = (float) ((time - updateStartTime) / 1e6);
                updateStartTime = time;
                lag += (float) updateTime;
                while (lag >= (float) msPerUpdate) {
                    //game.update();
                    counter++;
                    lag -= (float) msPerUpdate;
                }

                if ((float) time - (float) startTime >= 1000000000) {
                    //System.out.println("UPS: " +  counter);
                    counter = 0;
                    startTime = time;
                }
                try {
                    Thread.sleep(Math.max((long) (msPerUpdate - updateTime), 0));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            }

        }
    }
}
