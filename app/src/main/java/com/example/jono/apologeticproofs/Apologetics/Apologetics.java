package com.example.jono.apologeticproofs.Apologetics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jono.apologeticproofs.R;

public class Apologetics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apologetics);
        setupBackButton();
        setupWhatIsApologeticsBtn();
        setupWhyStudyApologeticsBtn();
        setTitle("Apologetics");
    }

    private void setupWhatIsApologeticsBtn() {
        Button button = (Button) findViewById(R.id.WhatIsApologeticsBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WhatIsApologetics.class);
                startActivity(intent);
            }
        });
    }

    private void setupWhyStudyApologeticsBtn() {
        Button button = (Button) findViewById(R.id.WhyStudyApologeticsBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WhyStudyApologetics.class);
                startActivity(intent);
            }
        });
    }
    private void setupBackButton() {
        Button button = (Button) findViewById(R.id.BackButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

