package com.psj.psj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1); //face
        Button button2 = (Button) findViewById(R.id.button2); //insta
        Button button3 = (Button) findViewById(R.id.button3); //tw
        Button button4 = (Button) findViewById(R.id.button4); //you
        Button button5 = (Button) findViewById(R.id.button5); //sounnd c
        Button button6 = (Button) findViewById(R.id.button6); //sp

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(this, "Welcome to PSJ Facebook Page", Toast.LENGTH_SHORT).show();
                openFacebook();
                break;
            case R.id.button2:
                Toast.makeText(this, "Welcome to PSJ Instagram Page", Toast.LENGTH_SHORT).show();
                openInstagram();
                break;
            case R.id.button3:
                Toast.makeText(this, "Welcome to PSJ Twitter Page", Toast.LENGTH_SHORT).show();
                openTwitter();
                break;
            case R.id.button4:
                Toast.makeText(this, "Welcome to PSJ Youtube Page", Toast.LENGTH_SHORT).show();
                openYoutube();
                break;
            case R.id.button5:
                Toast.makeText(this, "Welcome to PSJ SoundCloud Page", Toast.LENGTH_SHORT).show();
                openSound();
                break;
            case R.id.button6:
                Toast.makeText(this, "Welcome to PSJ Spotify Page", Toast.LENGTH_SHORT).show();
                openSpotify();
                break;
        }
    }


    public void openFacebook() {
        Intent intent = new Intent(this, facebook.class);
        startActivity(intent);
    }

    public void openInstagram() {
        Intent intent = new Intent(this, Instagram.class);
        startActivity(intent);
    }

    public void openTwitter() {
        Intent intent = new Intent(this, Twiter.class);
        startActivity(intent);
    }

    public void openYoutube() {
        Intent intent = new Intent(this, youtube.class);
        startActivity(intent);
    }

    public void openSound() {
        Intent intent = new Intent(this, soundcloud.class);
        startActivity(intent);
    }

    public void openSpotify() {
        Intent intent = new Intent(this,Spotify.class);
        startActivity(intent);
    }


}
