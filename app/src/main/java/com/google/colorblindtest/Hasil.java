package com.google.colorblindtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton, mMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        mGrade = (TextView) findViewById(R.id.grade);
        mFinalScore = (TextView) findViewById(R.id.outOf);
        mRetryButton = (Button) findViewById(R.id.retry);
        mMenuButton = (Button) findViewById(R.id.menu);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("You Score : " + score );

        if(score <= 5){
            mGrade.setText("Selamat Mata kamu kurang sehat");
        }else if(score <= 10){
            mGrade.setText("Selamat Mata kamu cukup sehat");
        }else if(score <= 15){
            mGrade.setText("Selamat Mata kamu sehat");
        }else {
            mGrade.setText("Selamat Mata kamu sangat sehat");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hasil.this, Kuis.class));
                Hasil.this.finish();
            }
        });

        mMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Hasil.this, Menu.class));
                Hasil.this.finish();
            }
        });

    }
}
