package com.example.jono.apologeticproofs.ObjectionsToExistence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jono.apologeticproofs.R;

public class ObjectionsForGodsExistence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objections_for_gods_existence);
        setupBackButton();
        setupProblemEvilBtn();
        setTitle("Objections for God's Existence");
    }

    private void setupProblemEvilBtn() {
        Button button = (Button) findViewById(R.id.ProblemEvilBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProblemOfEvil.class);
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
