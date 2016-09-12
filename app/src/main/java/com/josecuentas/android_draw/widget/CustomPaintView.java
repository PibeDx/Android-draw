package com.josecuentas.android_draw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jcuentas on 12/09/16.
 * http://v4all123.blogspot.pe/2013/11/simple-drawing-example-in-android.html
 */
public class CustomPaintView extends View {

    private Path path;
    private Paint paint;

    public CustomPaintView(Context context) {
        super(context);
        init();
    }

    public CustomPaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomPaintView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        path = new Path();
        paint = new Paint();
        paint.setDither(true);
        paint.setColor(0xFFFFFF00);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(3);
        this.setBackgroundColor(Color.BLACK);
    }

    @Override public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            path.moveTo(event.getX(), event.getY());
            path.lineTo(event.getX(),event.getY());
        }else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            path.lineTo(event.getX(),event.getY());
        }
        invalidate();
        return true;
    }

    @Override protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);
    }
}
