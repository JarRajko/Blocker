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

import com.blocker.R;
import com.blocker.gameobjects.MyObject;
import com.blocker.gameobjects.blocks.Block;
import com.blocker.gameobjects.blocks.Box;
import com.blocker.gameobjects.blocks.activable.Gate;
import com.blocker.gameobjects.blocks.floor.Grass;
import com.blocker.map.GameMap;
import com.blocker.map.MapGenerator;
import com.blocker.player.Player;

import java.util.HashMap;
import java.util.Observer;

public class Game extends SurfaceView implements Runnable {

    private Thread thread;
    private boolean isPlaying;
    private Paint paint;
    private Player player;
    private GameMap gameMap; //TODO Current map asi?
    private MapGenerator generator;
    private int x = 5;
    private int y = 5;
    private boolean updated = true; //dirty flag
    private Camera camera;
    private HashMap<Integer, Bitmap> objectResources = new HashMap<>();

    public static int DEFAULT_TEXTURE_SIZE = 32;


    @RequiresApi(api = Build.VERSION_CODES.O)
    public Game(Context context) {
        super(context);
        camera = new Camera();
        initResources();
        paint = new Paint();
        player = new Player(getResources());
        generator = new MapGenerator(getResources());
        gameMap = generator.getTestMap();
        camera.lockCamera(true);
        update();
    }

    @Override
    public void run() {
        while (isPlaying) {
            update();
            draw();
            sleep();
        }
    }


    private void update() {
        camera.update(player);
    }
/*
    private void draw() {
        if (updated) {
            if (getHolder().getSurface().isValid()) {
                if (cameraLocked) {
                    drawLocked();
                } else {
                    drawUnlocked();
                }
            }
        }
    }

    private void drawLocked() {
            Canvas canvas = getHolder().lockCanvas();

            drawBlocks(canvas);
            drawPlayer(canvas);


            getHolder().unlockCanvasAndPost(canvas);
            if(updatesOld == 0) updated = false;
    }

    private void drawUnlocked() {
            Canvas canvas = getHolder().lockCanvas();

            drawBlocks(canvas);
            drawPlayer(canvas);


            getHolder().unlockCanvasAndPost(canvas);
            if(updatesOld == 0) updated = false;
    }
*/

    public void draw() {
        if (updated) {
            if (getHolder().getSurface().isValid()) {
                Canvas canvas = getHolder().lockCanvas();

                drawBlocks(canvas);
                drawPlayer(canvas);


                getHolder().unlockCanvasAndPost(canvas);
                updated = false;
            }
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
        //canvas.drawColor(Color.RED);
        int width = gameMap.getSize().x;
        int height = gameMap.getSize().y;

        int blockCounter = 0;

        Outer:
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Block blockToDraw = (Block) gameMap.getObjectFromMap(new Point(x,y));

                if(camera.isLocked()) {
                    x += camera.getPosition().x;
                    y += camera.getPosition().y;
                }

                int offsetX = 1; //space between bitmaps in pixels
                int offsetY = 1;

                int xCoordinate = (x * (DEFAULT_TEXTURE_SIZE + offsetX)) + (x * 56);
                int yCoordinate = (y * (DEFAULT_TEXTURE_SIZE + offsetY)) + (y * 56);
                //I don't understand the number formula, why 56 and why x/y * 56 but it works as intended here

                if(xCoordinate <= canvas.getWidth() && yCoordinate <= canvas.getHeight()) { //if image is on screen draw it
                    Bitmap bmp = objectResources.get(blockToDraw.getTexture_id()); //BitmapFactory.decodeResource(getResources(), blockToDraw.getTexture_id());

                    try {
                        canvas.drawBitmap(bmp, xCoordinate, yCoordinate, null);
                        blockCounter++;
                        //Log.e("","Blocks drawn " + blockCounter);
                    } catch (Exception e) {
                        Log.e("Check the line 193 ","Instance of " + blockToDraw);
                        e.printStackTrace();
                        break Outer;
                    }


                } else break;
            }
        }
    }

    private void drawPlayer(Canvas canvas) {
        int id = player.getPlayerTextureId();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), id);
        canvas.drawBitmap(bitmap,player.getPlayerPosition().x * 32, player.getPlayerPosition().y * 32, null); //TODO FIX
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                player.moveDown();
                updated = true;
                break;
        }

        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.O) //TODO add every instance of MyObject
    private void initResources() { //requires initialization for every instance of MyBlock
        Grass grass = new Grass();
        Box box = new Box();
        //RockyFloor rockyFloor = new RockyFloor();

        objectResources.put(R.drawable.box_1, BitmapFactory.decodeResource(getResources(), R.drawable.box_1));
        objectResources.put(R.drawable.grass_1 ,BitmapFactory.decodeResource(getResources(), R.drawable.grass_1));
        objectResources.put(R.drawable.grass_2 ,BitmapFactory.decodeResource(getResources(), R.drawable.grass_2));
        objectResources.put(R.drawable.grass_3 ,BitmapFactory.decodeResource(getResources(), R.drawable.grass_3));
        objectResources.put(R.drawable.grass_4 ,BitmapFactory.decodeResource(getResources(), R.drawable.grass_4));
    }

}