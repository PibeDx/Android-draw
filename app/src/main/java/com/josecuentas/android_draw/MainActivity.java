package com.josecuentas.android_draw;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.josecuentas.android_draw.widget.DrawView;
import com.josecuentas.android_draw.widget.PaintView;

public class MainActivity extends AppCompatActivity {
    DrawView drawView;
    Button button;

    PaintView paintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        drawView = new DrawView(this);
        drawView.setBackgroundColor(Color.WHITE);
        button = new Button(this);
        button.setText("TEST");


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager
                .LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        paintView = new PaintView(this);
        setContentView(paintView);
        paintView.requestFocus();
    }
}
