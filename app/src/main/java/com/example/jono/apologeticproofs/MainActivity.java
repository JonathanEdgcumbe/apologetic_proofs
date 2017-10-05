package com.example.jono.apologeticproofs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jono.apologeticproofs.Apologetics.Apologetics;
import com.example.jono.apologeticproofs.DivineAttributesPackage.DivineAttributes;
import com.example.jono.apologeticproofs.ObjectionsToExistence.ObjectionsForGodsExistence;
import com.example.jono.apologeticproofs.ProofsForExistence.ArgumentsForGodsExistence;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDivineAttributesBtn();
        setupArgumentsBtn();
        setupObjectionsBtn();
        setupApologeticsBtn();
    }

    private void setupApologeticsBtn() {
        Button button = (Button) findViewById(R.id.ApologeticsBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Apologetics.class);
                startActivity(intent);
            }
        });
    }
    private void setupDivineAttributesBtn() {
        Button button = (Button) findViewById(R.id.DivineAttributesBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DivineAttributes.class);
                startActivity(intent);
            }
        });
    }

    private void setupArgumentsBtn() {
        Button button = (Button) findViewById(R.id.ArgumentsBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArgumentsForGodsExistence.class);
                startActivity(intent);
            }
        });
    }

    private void setupObjectionsBtn() {
        Button button = (Button) findViewById(R.id.ObjectionsBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ObjectionsForGodsExistence.class);
                startActivity(intent);
            }
        });
    }
}
