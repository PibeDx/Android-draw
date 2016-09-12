package com.josecuentas.android_draw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by jcuentas on 12/09/16.
 */
public class DrawView  extends View{
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
        paint.setColor(Color.BLACK);
    }

    @Override protected void onDraw(Canvas canvas) {
        canvas.drawLine(0, 0, 220, 220, paint);
        canvas.drawLine(220, 0, 0, 220, paint);
    }
}
