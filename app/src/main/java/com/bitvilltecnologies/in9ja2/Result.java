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
    TextView mGrade;
    Button mRetry;
    Button share;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        mGrade=(TextView)findViewById(R.id.remak);
        mscore=(TextView)findViewById(R.id.score);
        mRetry=(Button)findViewById(R.id.retry1);
        share=(Button)findViewById(R.id.sharebnt);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalscore.");
        mscore.setText("your score "+score+ " out of "+QuestionLibrary.mQuestions.length );

        if (score >=800 && score<=2000){
            mGrade.setText("100%");
        }else if (score >= 500 &&  score <= 700){
            mGrade.setText("60%");
        }else if (score >= 200 &&  score <= 400){
            mGrade.setText("20%");
        }






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
