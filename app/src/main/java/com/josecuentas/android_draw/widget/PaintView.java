package com.josecuentas.android_draw.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jcuentas on 12/09/16.
 * http://stackoverflow.com/a/9195858/3738212
 */

public class PaintView extends View implements View.OnTouchListener {

    public static final String TAG = "PaintView";

    List<Point> points = new ArrayList<>();
    Paint paint = new Paint();
    Canvas mCanvas = null;

    public PaintView(Context context) {
        super(context);
        init();
    }

    public PaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PaintView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setFocusable(true);
        setFocusableInTouchMode(true);

        this.setOnTouchListener(this);

        paint.setAntiAlias(true);
    }

    @Override protected void onDraw(Canvas canvas) {
        mCanvas = canvas;
        if (!points.isEmpty()) {
            int length = points.size();
            Point point = points.get(length-1);
//        for (Point point : points) {
            canvas.drawCircle(point.x, point.y, 50, paint);
//        }
        }


    }

    @Override public boolean onTouch(View view, MotionEvent motionEvent) {
        Point point = new Point();
        point.x = (int) motionEvent.getX();
        point.y = (int) motionEvent.getY();
        points.add(point);
        invalidate();
        Log.d(TAG, "point: " + point);
        return true;
    }


    public void clearView(){
//        mCanvas.drawColor(Color.BLACK);
        points = new ArrayList<>();
    }

    class Point {
        float x, y;

        @Override public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
