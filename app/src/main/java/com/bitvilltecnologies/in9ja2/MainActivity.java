package com.bitvilltecnologies.in9ja2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_TIME = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);

        final MediaPlayer intro = MediaPlayer.create(this,R.raw.intro);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent splash = new Intent(MainActivity.this,HOME.class);


                startActivity(splash);
                finish();



            }


        },SPLASH_TIME) ; intro.stop();


    }


}
