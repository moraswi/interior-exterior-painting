package com.cvb.interiorexteriorpainting;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class pictures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        ImageView background = findViewById(R.id.background);
        AnimationDrawable animationDrawable = (AnimationDrawable) background.getDrawable();
        animationDrawable.start();
    }
}