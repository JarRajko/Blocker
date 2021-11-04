package com.blocker.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.Block;
import com.blocker.map.GameMap;
import com.blocker.map.MapGenerator;
import com.blocker.player.Player;

public class Game extends SurfaceView implements Runnable {

    private Thread thread;
    private boolean isPlaying;
    private Paint paint;
    private Player player;
    private GameMap gameMap; //TODO Current map asi?
    private MapGenerator generator;
    private int x = 5;
    private int y = 5;
    private boolean updated = true;
    private int updatesOld = 0;
    private int updatesNew = -1;
    private boolean cameraLocked = false;
    public static int DEFAULT_TEXTURE_SIZE = 32;


    @RequiresApi(api = Build.VERSION_CODES.O)
    public Game(Context context) {
        super(context);
        paint = new Paint();
        player = new Player(getResources());
        generator = new MapGenerator(getResources());
        gameMap = generator.getTestMap();

    }

    @Override
    public void run() {
        while (isPlaying) {
            draw();
            update();
            sleep();
        }
    }


    private void update() {

    }

    private void draw() {
        if (getHolder().getSurface().isValid()) {
            if (cameraLocked) {
                drawLocked();
            } else {
                drawUnlocked();
            }
        }
    }

    private void drawLocked() {

    }

    private void drawUnlocked() {
        if(updated) {
            Canvas canvas = getHolder().lockCanvas();

            drawBlocks(canvas);
            drawPlayer(canvas);


            getHolder().unlockCanvasAndPost(canvas);
            if(updatesOld == 0) updated = false;
        }
    }

    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void resume() {
        isPlaying = true;
        thread = new Thread(this);
        thread.start();
    }

    public void pause() {

        try {
            isPlaying = false;
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void drawBlocks(Canvas canvas) {
        Log.e("","Called: " + updatesOld);
        //canvas.drawColor(Color.RED);
        int width = gameMap.getSize().x;
        int height = gameMap.getSize().y;

        Outer:
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Block blockToDraw = (Block) gameMap.getObjectFromMap(new Point(x,y));


                int offsetX = 0; //space between bitmaps in pixels
                int offsetY = 0;

                int xCoordinate = (x * (DEFAULT_TEXTURE_SIZE + offsetX)) + (x * 56);
                int yCoordinate = (y * (DEFAULT_TEXTURE_SIZE + offsetY)) + (y * 56);
                //I don't understand the number formula, why 56 and why x/y * 56 but it works as intended here

                if(xCoordinate <= canvas.getWidth() && yCoordinate <= canvas.getHeight()) { //if image is on screen draw it
                    Bitmap bmp = BitmapFactory.decodeResource(getResources(), blockToDraw.getTexture_id());
                    canvas.drawBitmap(bmp, xCoordinate, yCoordinate, null);
                } else break;
            }
        }
    }

    private void drawPlayer(Canvas canvas) {
        int id = player.getPlayerTextureId();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), id);
        canvas.drawBitmap(bitmap,player.getPlayerPosition().x , player.getPlayerPosition().y, null);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                updatesOld++;
                player.moveRight();
                updated = true;
                break;

        }

        return true;
    }



}