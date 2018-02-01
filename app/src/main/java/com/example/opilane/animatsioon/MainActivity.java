package com.example.opilane.animatsioon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView banaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        banaan=findViewById(R.id.banaan);
    }

    public void zoom(View view) {
        ImageView image = (ImageView) findViewById(R.id.banaan);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        image.startAnimation(animation);
    }

    public void clockwise(View view) {
        ImageView image = (ImageView) findViewById(R.id.banaan);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        image.startAnimation(animation);
    }

    public void Blink(View view) {
        ImageView image = (ImageView) findViewById(R.id.banaan);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(animation);
    }

    public void Slide(View view) {
       ImageView image = (ImageView) findViewById(R.id.banaan);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        image.startAnimation(animation);
    }

    public void Fade(View view) {
        ImageView image = (ImageView) findViewById(R.id.banaan);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animation);}


    public void move (View view) {
        ImageView image = (ImageView) findViewById(R.id.banaan);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(animation);
    }
}
