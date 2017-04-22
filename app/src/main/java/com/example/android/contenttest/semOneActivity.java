package com.example.android.contenttest;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.button;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class semOneActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_one);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.semOneSubListId);
        Toast.makeText(this, "Choose Subject", Toast.LENGTH_SHORT).show();
        int numberOfSubjects = 6;
        for (int i = 0; i < numberOfSubjects; ++i) {
            Button button = new Button(this);
            int id = i + 1;
            button.setId(id);
            button.setBackgroundColor(getResources().getColor(R.color.subButtonColor));
            button.setText("Subject " + id);
            button.setTextColor(Color.BLACK);
            button.setAllCaps(true);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            int dpValueMargin = 8;
            float d = this.getResources().getDisplayMetrics().density;
            int margin = (int) (dpValueMargin*d);
            params.setMargins(margin, margin, margin, margin);
            button.setLayoutParams(params);
            params.gravity = Gravity.CENTER_HORIZONTAL;
            button.setPadding(margin,0,margin,0);
            //button.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            linearLayout.addView(button,params);
            button.setGravity(Gravity.CENTER);
            setContentView(linearLayout);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case 1:
                            Intent intentSemOneSubOne = new Intent(semOneActivity.this, semOneSubOneActivity.class);
                            intentSemOneSubOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemOneSubOne);
                            break;
                        case 2:
                            Intent intentSemOneSubTwo = new Intent(semOneActivity.this, semOneSubOneActivity.class);
                            intentSemOneSubTwo.putExtra("url", "file:///android_asset/newFolder/semOneSub2.htm");
                            startActivity(intentSemOneSubTwo);
                            break;
                        case 3:
                            Intent intentSemOneSubThree = new Intent(semOneActivity.this, semOneSubOneActivity.class);
                            intentSemOneSubThree.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemOneSubThree);
                            break;
                        case 4:
                            Intent intentSemOneSubFour = new Intent(semOneActivity.this, semOneSubOneActivity.class);
                            intentSemOneSubFour.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemOneSubFour);
                            break;
                        case 5:
                            Intent intentSemOneSubFive = new Intent(semOneActivity.this, semOneSubOneActivity.class);
                            intentSemOneSubFive.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemOneSubFive);
                            break;
                        case 6:
                            Intent intentSemOneSubSix = new Intent(semOneActivity.this, semOneSubOneActivity.class);
                            intentSemOneSubSix.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemOneSubSix);
                            break;
                    }

                }
            });
        }

//        @Override
//                public void OnClick
//        //Button button = (Button) findViewById(R.id.subOneOne);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(semOneActivity.this, semOneSubOneActivity.class);
//                startActivity(i);
//            }
//        });
    }

}
