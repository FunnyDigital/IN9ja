package com.bitvilltecnologies.in9ja2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {

    TextView mscore;

    Button mRetry;
    Button share;






    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        mscore=(TextView)findViewById(R.id.score);
        TextView mGrade = (TextView) findViewById(R.id.remak);
        mRetry=(Button)findViewById(R.id.retry1);
        share=(Button)findViewById(R.id.sharebnt);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalscore.");


        if(score>=80 && score<=200){
            mGrade.setText("Oga Expert");

        }
        else if (score >= 70 && score <= 79) {
            mGrade.setText(" As you the try Expert");
        }
        else if (score >= 60 && score <= 69) {
            mGrade.setText("take Professional");
        }
        else if (score >= 50 && score <= 59) {
            mGrade.setText (" hmm Semi-Pro");
        }
        else if (score >= 40 && score <= 49) {
            mGrade.setText("ok hoo Normal");
        }
        else if (score >= 30 && score <= 39) {
            mGrade.setText(" and you are a proud nigerian Novice");
        }
        else if (score >= 20 && score <= 29) {
            mGrade.setText("Oga pack Beginner");
        }
        else if(score >= -500 && score <=10){
            mGrade.setText("You are a MuMu Man, just look at you,you are not In9ja ");
        }



        mscore.setText("your score "+score+"₦"+ " out of "+"200₦" );
       // mscore.setText("your score "+score+ " out of "+QuestionLibrary.mQuestions.length );



        mRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Result.this,MainHome.class);
                startActivity(intent);




            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Result.this ,"COMMING SOON",Toast.LENGTH_LONG).show();
            }
        });






    }

}
