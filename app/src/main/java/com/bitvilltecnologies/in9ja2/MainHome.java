package com.bitvilltecnologies.in9ja2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainHome extends AppCompatActivity {

    private QuestionLibrary mQuestionlibrary = new QuestionLibrary();

    private TextView mScoreveiw;
    private TextView mQuestionview;
    private Button   mChoise1;
    private Button   mChoise2;
    private Button   mChoise3;
    private Button   mChoise4;
    private Button   mQuit5 ;

    private String mAnswer;
    private int mScore= 0;
    private int mQuestonnumber = 0;

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_home);



            toolbar = (Toolbar) findViewById(R.id.toolbar2);
            setSupportActionBar(toolbar);
            toolbar.inflateMenu(R.menu.main_menu);

        TextView mTitle = (TextView) toolbar.findViewById(R.id.score);

        mTitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        final MediaPlayer soundcorrect = MediaPlayer.create(this,R.raw.buttonclick);
        final MediaPlayer soundwroung=MediaPlayer.create(this,R.raw.wrong);


        mScoreveiw=(TextView)findViewById(R.id.score);
        mQuestionview=(TextView)findViewById(R.id.questiondis);
        mChoise1=(Button)findViewById(R.id.choice1);
        mChoise2=(Button)findViewById(R.id.choice2);
        mChoise3=(Button)findViewById(R.id.choice3);
        mChoise4=(Button)findViewById(R.id.choice4);
        //mQuit5=(Button)findViewById(R.id.quit1);

        UpdateQuestion();

        //listener for button one

        mChoise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mu logic here
                if (mChoise1.getText()==mAnswer){
                    mScore= mScore+10;
                    UpdateScore(mScore);

                    //optionall toste
                    Toast.makeText(MainHome.this,"CORRECT",Toast.LENGTH_LONG).show();


                    // perform a check to see if this is the last question of the game;
                    if(mQuestonnumber==QuestionLibrary.mQuestions.length) {
                        Intent intent = new Intent(MainHome.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore.",mScore);
                        intent.putExtras(bundle);
                        MainHome.this.finish();
                        startActivity(intent);





                    }else {
                        UpdateQuestion();
                    }
                    //end check

                    //for is correct answer sound
                    soundcorrect.start();

                }else {
                    mScore= mScore-10;
                    UpdateScore(mScore);

                    Toast.makeText(MainHome.this,"OGA PACK",Toast.LENGTH_LONG).show();




                    // perform a check to see if this is the last question of the game;
                    if (mQuestonnumber==QuestionLibrary.mQuestions.length) {
                        Intent intent = new Intent(MainHome.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore.",mScore);
                        intent.putExtras(bundle);
                        MainHome.this.finish();
                        startActivity(intent);





                    }else {
                        UpdateQuestion();
                    }
                    //end check
                    //for worng answer//




                }

            }
        });
        // end for buttton one



        //listener for button 2

        mChoise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mu logic here
                if (mChoise2.getText()==mAnswer){
                    mScore= mScore+10;
                    UpdateScore(mScore);
                    //optionall toste
                    Toast.makeText(MainHome.this,"CORRECT",Toast.LENGTH_LONG).show();

                    // perform a check to see if this is the last question of the game;
                    if (mQuestonnumber==QuestionLibrary.mQuestions.length) {
                        Intent intent = new Intent(MainHome.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore.",mScore);
                        intent.putExtras(bundle);
                        MainHome.this.finish();
                        startActivity(intent);





                    }else {
                        UpdateQuestion();
                    }
                    //for is correct answer sound
                    soundcorrect.start();
                    //end check

                }else {
                    mScore= mScore-10;
                    UpdateScore(mScore);

                    Toast.makeText(MainHome.this,"OGA PACK",Toast.LENGTH_LONG).show();


                    // perform a check to see if this is the last question of the game;
                    if (mQuestonnumber==QuestionLibrary.mQuestions.length) {
                        Intent intent = new Intent(MainHome.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore.",mScore);
                        intent.putExtras(bundle);
                        MainHome.this.finish();
                        startActivity(intent);





                    }else {
                        UpdateQuestion();
                    }
                    //end check
                    //for worng answer//

                }

            }


        });
        // end for buttton 2

        //listener for button 3

        mChoise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mu logic here
                if (mChoise3.getText()==mAnswer){
                    mScore= mScore+10;
                    UpdateScore(mScore);
                    //optionall toste
                    Toast.makeText(MainHome.this,"CORRECT",Toast.LENGTH_LONG).show();


                    // perform a check to see if this is the last question of the game;
                    if (mQuestonnumber==QuestionLibrary.mQuestions.length){
                        Intent intent = new Intent(MainHome.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore.",mScore);
                        intent.putExtras(bundle);
                        MainHome.this.finish();
                        startActivity(intent);





                    }else {
                        UpdateQuestion();
                    }
                    //end check
                    //for is correct answer sound
                    soundcorrect.start();



                }else {
                    mScore= mScore-10;
                    UpdateScore(mScore);

                    Toast.makeText(MainHome.this,"OGA PACK",Toast.LENGTH_LONG).show();


                    // perform a check to see if this is the last question of the game;
                    if (mQuestonnumber==QuestionLibrary.mQuestions.length) {
                        Intent intent = new Intent(MainHome.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore.",mScore);
                        intent.putExtras(bundle);
                        MainHome.this.finish();
                        startActivity(intent);





                    }else {
                        UpdateQuestion();
                    }
                    //end check
                    //for worng answer//

                }

            }
        });
        // end for buttton 3

        //listener for button 4

        mChoise4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mu logic here
                if (mChoise4.getText()==mAnswer){
                    mScore= mScore+10;
                    UpdateScore(mScore);

                    //optionall toste
                    Toast.makeText(MainHome.this,"CORRECT NAH SO",Toast.LENGTH_LONG).show();

                    // perform a check to see if this is the last question of the game;
                    if (mQuestonnumber==QuestionLibrary.mQuestions.length) {
                        Intent intent = new Intent(MainHome.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore.",mScore);
                        intent.putExtras(bundle);
                        MainHome.this.finish();
                        startActivity(intent);





                    }else {
                        UpdateQuestion();
                    }
                    //end check
                    //for is correct answer sound
                    soundcorrect.start();




                }else {
                    mScore= mScore-10;
                    UpdateScore(mScore);

                    Toast.makeText(MainHome.this,"OGA PACK ",Toast.LENGTH_LONG).show();

                    // perform a check to see if this is the last question of the game;
                    if(mQuestonnumber==QuestionLibrary.mQuestions.length){
                        Intent intent = new Intent(MainHome.this, Result.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalscore.",mScore);
                        intent.putExtras(bundle);
                        MainHome.this.finish();
                        startActivity(intent);





                    }else {
                        UpdateQuestion();
                    }
                    //end check
                    //for worng answer//

                }

            }
        });
        // end for buttton 4



        // for quit button

        /*mQuit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainHome.this,HOME.class);
                startActivity(intent);

            }
        });*/
    }





    private void UpdateQuestion(){
        mQuestionview.setText(mQuestionlibrary.getQuestions(mQuestonnumber));
        mChoise1.setText(mQuestionlibrary.getChoise1(mQuestonnumber));
        mChoise2.setText(mQuestionlibrary.getChoise2(mQuestonnumber));
        mChoise3.setText(mQuestionlibrary.getChoise3(mQuestonnumber));
        mChoise4.setText(mQuestionlibrary.getChoise4(mQuestonnumber));

        mAnswer=mQuestionlibrary.getAnswers(mQuestonnumber);
        mQuestonnumber++;





    }

    private void UpdateScore(int point){
        mScoreveiw.setText("₦"+mScore);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_add:
               // addSomething();
                return true;
            case R.id.action_settings:
               // startSettings();
                return true;
            case R.id.Exit_bnt:
                Intent intent =new Intent(MainHome.this,HOME.class);
                startActivity(intent);
            return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
