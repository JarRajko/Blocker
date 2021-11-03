package com.blocker.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.util.Log;
import android.view.View;

import androidx.annotation.RequiresApi;

import com.blocker.gameobjects.blocks.Block;
import com.blocker.map.GameMap;
import com.blocker.map.MapGenerator;
import com.blocker.player.Player;

public class Game extends View {
    private Player player;
    private Thread gameLoop;
    private GameMap gameMap; //TODO Current map asi?
    private MapGenerator generator;
    public static int DEFAULT_TEXTURE_SIZE = 32;


    @RequiresApi(api = Build.VERSION_CODES.O)
    public Game(Context context) {
        super(context);
        player = new Player(getResources());
        gameLoop = new Thread(new GameLoop(this));
        generator = new MapGenerator(getResources());
        //Log.e("Debug log: " , "Player: " + player + "\ngame loop " + gameLoop + "\n game map " + gameMap + "\n map generator " + generator);
        gameMap = generator.getTestMap();
        gameLoop.start();

    }

    @SuppressLint("DrawAllocation")
    @Override
    protected void onDraw(Canvas canvas) {
        drawBlocks(canvas);
        player.onDraw(canvas);
        //gameMap.onDraw(canvas);

    }

    public void update() {
        player.update();
    }

    private void drawBlocks(Canvas canvas) {
        //canvas.drawColor(Color.RED);
        int width = gameMap.getSize().x;
        int height = gameMap.getSize().y;

        Log.e("Map's width: ","" + width);
        Log.e("Map's height: ","" + height);

        Log.e("Canvas's Height: ","" + canvas.getHeight());
        Log.e("Canvas's Width : ","" + canvas.getWidth());

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


}