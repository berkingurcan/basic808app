package com.example.mydrumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;
    private int pad;
    private int pad2;
    private int kick;
    private int chihat;
    private int ohihat;
    private int clap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        pad = sp.load(getApplicationContext(),R.raw.sopad,1);
        pad2 = sp.load(getApplicationContext(),R.raw.deepad,1);
        kick = sp.load(getApplicationContext(),R.raw.kick,1);
        chihat = sp.load(getApplicationContext(),R.raw.chihat,1);
        ohihat = sp.load(getApplicationContext(),R.raw.ohihat,1);
        clap = sp.load(getApplicationContext(),R.raw.clap,1);


    }

    public void playsound1 (View v){
        sp.play(pad,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound2 (View v){
        sp.play(pad2,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound3 (View v){
        sp.play(clap,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound4 (View v){
        sp.play(chihat,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound5 (View v){
        sp.play(kick,1.0f,1.0f,0,0,1.0f);
    }
    public void playsound6 (View v){
        sp.play(ohihat,1.0f,1.0f,0,0,1.0f);
    }
}