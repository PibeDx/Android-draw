package com.josecuentas.android_draw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.josecuentas.android_draw.widget.PaintView;

public class DrawActivity extends AppCompatActivity {

    PaintView paintView;
    Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager
                .LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_draw);

        ui();
        paintView.requestFocus();
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                paintView.clearView();
            }
        });
    }

    private void ui() {
        paintView = (PaintView)findViewById(R.id.dviContainer);
        btnClear = (Button) findViewById(R.id.btnClear);
    }
}
