package com.example.wall720.quiz6siege;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PlayZone extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;
    TextView score,questions;
    ImageView maps;
    private Questions mQuestions = new Questions();
    private String mAnswers;
    private int mScore = 0;
    private int mQuestionslength = mQuestions.mQuestions.length;
    Random r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_zone);

        init();
        onClickListeners();

    }

    public void init(){

        r = new Random();

        answer1 = (Button) findViewById(R.id.btn_answer1);
        answer2 = (Button) findViewById(R.id.btn_answer2);
        answer3 = (Button) findViewById(R.id.btn_answer3);
        answer4 = (Button) findViewById(R.id.btn_answer4);

        score = (TextView) findViewById(R.id.tv_score);
        questions = (TextView) findViewById(R.id.tv_questions);


        updateQuestion(r.nextInt(mQuestionslength));

        score.setText("Pontszám: " + mScore);
    }

    public void onClickListeners(){

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswers){
                    mScore++;
                    score.setText("Pontszám: " + mScore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else{
                    gameOver();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswers){
                    mScore++;
                    score.setText("Pontszám: " + mScore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else{
                    gameOver();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == mAnswers){
                    mScore++;
                    score.setText("Pontszám: " + mScore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else{
                    gameOver();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText() == mAnswers){
                    mScore++;
                    score.setText("Pontszám: " + mScore);
                    updateQuestion(r.nextInt(mQuestionslength));
                }
                else{
                    gameOver();
                }
            }
        });
    }
    private void updateQuestion(int num){
        questions.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswers = mQuestions.getCorrectAnswers(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(PlayZone.this);
        alertdialogbuilder.setMessage("Game Over! Pontszáma: " + mScore)
                .setCancelable(false)
                .setPositiveButton("Új játék",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), PlayZone.class));
                            }
                        })
                .setNegativeButton("Kilépés",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent goMenu = new Intent(PlayZone.this, MenuQuiz.class);
                                startActivity(goMenu);
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertdialogbuilder.create();
        alertDialog.show();
    }


}

