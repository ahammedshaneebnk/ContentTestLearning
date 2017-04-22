package com.example.android.contenttest;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import static android.R.interpolator.linear;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semlist);
//        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollViewId);
        LinearLayout linearLayout = (LinearLayout) this.findViewById(R.id.semSelectId);
        //scrollView.addView(linearLayout);

        Toast.makeText(this, "Choose Semester",Toast.LENGTH_SHORT ).show();
        int numberOfSems = 8;
        for (int i = 0; i < numberOfSems; ++i) {
            Button button = new Button(this);
            int id = i + 1;
            button.setId(id);
            button.setBackgroundColor(getResources().getColor(R.color.semButtonColor));
            button.setTextColor(Color.WHITE);
            button.setText("Semester " + id);
            button.setAllCaps(true);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            int dpValue = 8; // margin in dips
            float d = this.getResources().getDisplayMetrics().density;

            int margin = (int)(dpValue * d); // margin in pixels

            params.setMargins(margin,margin,margin,margin);
            //button.setGravity(Gravity.CENTER_HORIZONTAL);
            params.gravity = Gravity.CENTER_HORIZONTAL;
            button.setPadding(margin,0,margin,0);

            //button.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));;
            button.setLayoutParams(params);
            linearLayout.addView(button,params);
            button.setGravity(Gravity.CENTER);
            setContentView(linearLayout);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case 1:
                            Intent intentSemOne = new Intent(MainActivity.this, semOneActivity.class);
//                            intentSemOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemOne);
                            break;
                        case 2:
                            Intent intentSemTwo = new Intent(MainActivity.this, semOneActivity.class);
//                            intentSemOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemTwo);
                            break;
                        case 3:
                            Intent intentSemThree = new Intent(MainActivity.this, semOneActivity.class);
//                            intentSemOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemThree);
                            break;
                        case 4:
                            Intent intentSemFour = new Intent(MainActivity.this, semOneActivity.class);
//                            intentSemOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemFour);
                            break;
                        case 5:
                            Intent intentSemFive = new Intent(MainActivity.this, semOneActivity.class);
//                            intentSemOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemFive);
                            break;
                        case 6:
                            Intent intentSemSix = new Intent(MainActivity.this, semOneActivity.class);
//                            intentSemOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemSix);
                            break;
                        case 7:
                            Intent intentSemSeven = new Intent(MainActivity.this, semOneActivity.class);
//                            intentSemOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemSeven);
                            break;
                        case 8:
                            Intent intentSemEight = new Intent(MainActivity.this, semOneActivity.class);
//                            intentSemOne.putExtra("url", "file:///android_asset/newFolder/semOneSub1.html");
                            startActivity(intentSemEight);
                            break;
                    }

                }
            });
          //  setContentView(scrollView);
        }

//        ImageView imageView = (ImageView) findViewById(R.id.imageViewId);
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, semOneActivity.class);
//                startActivity(i);
//                Toast.makeText(MainActivity.this,"Select Subject",Toast.LENGTH_LONG).show();
//            }
//        });
    }
}
