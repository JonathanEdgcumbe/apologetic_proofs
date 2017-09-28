package com.example.jono.apologeticproofs.ObjectionsToExistence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jono.apologeticproofs.R;

public class ProblemOfEvil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_layout);
        setupBackButton();
        setupTextViews();
        setTitle("Problem of Evil");
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

    private void setupTextViews() {
        TextView textView = (TextView) findViewById(R.id.headingTextView);
        textView.setText("This is the Problem of evil view");
    }
}
