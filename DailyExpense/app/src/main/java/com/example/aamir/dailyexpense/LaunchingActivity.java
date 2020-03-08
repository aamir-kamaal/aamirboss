package com.example.aamir.dailyexpense;

import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class LaunchingActivity extends AppCompatActivity {

    private TextView expense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launching);

        expense = (TextView) findViewById(R.id.textView);
        Typeface face = Typeface.createFromAsset(getAssets(),"Caviar_Dreams_Bold.ttf");
        expense.setTypeface(face);

        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i  = new Intent(LaunchingActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },5000);


    }
}
