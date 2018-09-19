package com.example.wall720.quiz6siege;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuQuiz extends AppCompatActivity {

    Button play, exit;
    AlertDialog.Builder wantToQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_quiz);
        init();
        onClickListener();

    }


    public void init(){
        play = (Button)findViewById(R.id.btn_play);
        exit = (Button)findViewById(R.id.btn_exit);
    }


    public void onClickListener(){
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goPlay = new Intent(MenuQuiz.this, PlayZone.class);
                startActivity(goPlay);
                finish();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Quit();
            }
        });
    }

    public void Quit(){
        this.wantToQuit = new AlertDialog.Builder(MenuQuiz.this);
        this.wantToQuit.setMessage("Biztosan kilép?");

        this.wantToQuit.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        this.wantToQuit.setNegativeButton("Nem", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        this.wantToQuit.setCancelable(false);
        this.wantToQuit.create();
        this.wantToQuit.show();
    }


}
