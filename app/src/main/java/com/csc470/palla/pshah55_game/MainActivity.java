package com.csc470.palla.pshah55_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void play(View v)
    {
        Intent i=new Intent(this,LogicMain.class);
        startActivity(i);
    }

    public void highscore(View v)
    {
        Intent i=new Intent(this,ScoreLogic.class);
        startActivity(i);
    }

    public void setting(View v)
    {
        Intent i=new Intent(this,Setting.class);
        startActivity(i);
    }

    public void exit(View v)
    {
        System.exit(0);
    }






}
