package com.blocker.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

import com.blocker.R;

public class GameView extends View {
    private Bitmap bmp;

    public GameView(Context context) {
        super(context);
        bmp = BitmapFactory.decodeResource(getResources(), R.drawable.down1);
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.CYAN);
        canvas.drawBitmap(bmp, 10,10, null);
    }
}
