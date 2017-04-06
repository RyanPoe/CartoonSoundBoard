package com.example.android.cartoonsoundboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import java.util.Random;
import java.util.RandomAccess;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void playLorax(View view){
            int low = 0;
            int high = 2;
            Random rand = new Random();
            int n = rand.nextInt(high-low) + low;
            int[] sound={R.raw.lorax1, R.raw.lorax2, R.raw.lorax3};

            mp = MediaPlayer.create(this, sound[n]);
            mp.start();
        }


    public void playShrek(View view){
        int low = 0;
        int high = 2;
        Random rand = new Random();
        int n = rand.nextInt(high-low) + low;
        int[] sound={R.raw.shrek1, R.raw.shrek2, R.raw.shrek3};

        mp = MediaPlayer.create(this, sound[n]);
        mp.start();
    }


    public void playBee(View view){
        int low = 0;
        int high = 2;
        Random rand = new Random();
        int n = rand.nextInt(high-low) + low;
        int[] sound={R.raw.beemovie1, R.raw.beemovie2, R.raw.beemovie3};

        mp = MediaPlayer.create(this, sound[n]);
        mp.start();
        }
    }
