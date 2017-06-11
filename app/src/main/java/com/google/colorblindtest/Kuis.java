package com.google.colorblindtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Kuis extends AppCompatActivity {


    Button answer1, answer2, answer3, answer4;

    TextView score;
    ImageView soal;

    private Soal mSoal = new Soal();

    private String mJawaban;
    private int mNilai = 0;
    private int mPanjangSoal = mSoal.mSoal.length;

    private int r = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        soal = (ImageView) findViewById(R.id.question);

        Quest(r);

        score.setText("Score: "+ mNilai);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText() == mJawaban && r < mPanjangSoal){
                    mNilai++;
                    score.setText("Score: " + mNilai);
                    updateQuestion(r++);
                }else{
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText() == mJawaban && r < mPanjangSoal){
                    mNilai++;
                    score.setText("Score: " + mNilai);
                    updateQuestion(r++);
                }else{
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText() == mJawaban && r < mPanjangSoal){
                    mNilai++;
                    score.setText("Score: " + mNilai);
                    updateQuestion(r++);
                }else{
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText() == mJawaban && r < mPanjangSoal){
                    mNilai++;
                    score.setText("Score: " + mNilai);
                    updateQuestion(r++);
                }else{
                    gameOver();
                }
            }
        });

    }

    private void Quest(int num){
        if (num >= mPanjangSoal) {
            gameOver();
        }else {
            updateQuestion(num);
        }
    }

    private void updateQuestion(int num){

        soal.setImageResource(mSoal.getSoal(num));
        answer1.setText(mSoal.getPilihan1(num));
        answer2.setText(mSoal.getPilihan2(num));
        answer3.setText(mSoal.getPilihan3(num));
        answer4.setText(mSoal.getPilihan4(num));

        mJawaban = mSoal.getJawaban(num);
    }

    private void gameOver() {
        Intent i = new Intent(Kuis.this, Hasil.class);
        Bundle bundle = new Bundle();
        bundle.putInt("finalScore", mNilai);
        i.putExtras(bundle);
        Kuis.this.finish();
        startActivity(i);
    }
}
