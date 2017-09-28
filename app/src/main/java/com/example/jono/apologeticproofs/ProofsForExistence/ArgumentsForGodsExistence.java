package com.example.jono.apologeticproofs.ProofsForExistence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jono.apologeticproofs.ProofsForExistence.ConsciousnessArgument;
import com.example.jono.apologeticproofs.ProofsForExistence.CosmologicalArgument;
import com.example.jono.apologeticproofs.ProofsForExistence.FineTuningArgument;
import com.example.jono.apologeticproofs.ProofsForExistence.ResurrectionArgument;
import com.example.jono.apologeticproofs.R;

public class ArgumentsForGodsExistence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arguments_for_gods_existence);
        setupBackButton();
        setupCosmologicalArgumentBtn();
        setupConsciousnessBtn();
        setupFineTuningBtn();
        setupResurrectionBtn();
        setTitle("Arguments for God's Existence");
    }

    private void setupCosmologicalArgumentBtn() {
        Button button = (Button) findViewById(R.id.CosmologicalArgumentBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CosmologicalArgument.class);
                startActivity(intent);
            }
        });
    }

    private void setupFineTuningBtn() {
        Button button = (Button) findViewById(R.id.FineTuningBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FineTuningArgument.class);
                startActivity(intent);
            }
        });
    }

    private void setupConsciousnessBtn() {
        Button button = (Button) findViewById(R.id.ConsciousnessBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ConsciousnessArgument.class);
                startActivity(intent);
            }
        });
    }

    private void setupResurrectionBtn() {
        Button button = (Button) findViewById(R.id.ResurrectionBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResurrectionArgument.class);
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
