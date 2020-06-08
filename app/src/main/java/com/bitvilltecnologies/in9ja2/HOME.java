package com.bitvilltecnologies.in9ja2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HOME extends AppCompatActivity {



    private Button mPlay_bnt;
    private Button mQuit;
    private Switch soundselect,sfx;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        final MediaPlayer intro = MediaPlayer.create(this,R.raw.gamesong);






        mPlay_bnt=(Button)findViewById(R.id.playbnt);
        mQuit=(Button)findViewById(R.id.Exit_bnt);
        soundselect=(Switch) findViewById(R.id.switch1);
        sfx=(Switch)findViewById(R.id.switch2);





        mPlay_bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HOME.this,MainHome.class);
                startActivity(intent);
            }
        });

        mQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

       soundselect.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


               if(isChecked){
                   intro.start();
                  Toast.makeText(HOME.this,"swicth ON",Toast.LENGTH_LONG);
               }else{
                   intro.pause();
                   Toast.makeText(HOME.this,"switch off",Toast.LENGTH_LONG);
               }


           }
       });

    }




}
