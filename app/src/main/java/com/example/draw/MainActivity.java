package com.example.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaintView paintView=new PaintView(this);
        setContentView(paintView);
       /// setContentView(R.layout.activity_main);
    }
}