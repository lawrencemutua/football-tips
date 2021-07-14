package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button DailyTipsButton = (Button)findViewById(R.id.DailyTipsButton);
        DailyTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),DailyTips.class);
                startActivity(startIntent);
            }
        });
        Button PreviousMatchesButton = (Button)findViewById(R.id.PreviousMatchesbutton);
        PreviousMatchesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),PreviousMatches.class);
                startActivity(startIntent);
            }
        });
        Button BTTSTipsButton = (Button)findViewById(R.id.BTTSTipsbutton);
        BTTSTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),BTTSTips.class);
                startActivity(startIntent);
            }
        });
        Button JackpotTipsButton = (Button) findViewById(R.id.JackpotTipsbutton);
        JackpotTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),JackpotTips.class);
                startActivity(startIntent);
            }
        });
        Button DoubleChanceTipsButton = (Button)findViewById(R.id.DoubleChancebutton);
        DoubleChanceTipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),DoubleChance.class);
                startActivity(startIntent);
            }
        });
        Button DailySafeGameButton = (Button)findViewById(R.id.DailySafeGamebutton);
        DailySafeGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), DailySafeGame.class);
                startActivity(startIntent);
            }
        });
        Button VIPButton = (Button)findViewById(R.id.VIPbutton);
        VIPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),VIP.class);
                startActivity(startIntent);
            }
        });

    }
}