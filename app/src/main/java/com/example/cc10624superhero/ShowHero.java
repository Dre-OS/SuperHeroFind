package com.example.cc10624superhero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowHero extends AppCompatActivity {

    private TextView txt_HeroName;
    private ImageView imgHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hero);

        txt_HeroName=(TextView) findViewById(R.id.txt_HeroName);
        imgHero = (ImageView) findViewById(R.id.iv_HeroImage);

        Intent intent = getIntent();
        String heroname = intent.getExtras().getString("heroname");
        txt_HeroName.setText(heroname);
        int imghero = intent.getExtras().getInt("heronum");
        imgHero.setImageResource(getResources().getIdentifier("hero"+(imghero+1), "drawable", getPackageName()));
    }
}