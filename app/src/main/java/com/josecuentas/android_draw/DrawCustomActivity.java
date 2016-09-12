package com.josecuentas.android_draw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.josecuentas.android_draw.widget.CustomPaintView;

/**
 * Created by jcuentas on 12/09/16.
 * http://v4all123.blogspot.pe/2013/11/simple-drawing-example-in-android.html
 */
public class DrawCustomActivity extends AppCompatActivity {
    CustomPaintView pviContainer;
    @Override protected void onCreate(
            @Nullable
            Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawcustom);
        pviContainer = (CustomPaintView) findViewById(R.id.pviContainer);

    }
}
