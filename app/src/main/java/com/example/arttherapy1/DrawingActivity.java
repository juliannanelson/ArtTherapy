package com.example.arttherapy1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrawingActivity extends AppCompatActivity {

    DrawingTool drawingTool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawingTool = new DrawingTool(this,null);
        setContentView(drawingTool);
    }
}
