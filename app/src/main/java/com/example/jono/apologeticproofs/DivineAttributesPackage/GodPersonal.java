package com.example.jono.apologeticproofs.DivineAttributesPackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.jono.apologeticproofs.R;

public class GodPersonal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_layout);
        setupBackButton();
        setupTextViews();
        setTitle("Personal");
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
        textView.setText("The first thing we should note about God is that He is personal. " +
                "In other words, God is not some impersonal force, like gravity, but He is a " +
                "personal being. This means that God has the essential properties of personhood, " +
                "such as intellect, self-consciousness, and will. A person has (or can have) " +
                "knowledge, beliefs, affections, and intentions. God has all these qualities and " +
                "He has some to the maximal degree.\n" +
                "\n" +
                "Now, it is good news that God is personal, because this means that you can have " +
                "a relationship with Him. Unlike impersonal objects, which you cannot have a " +
                "relationship with, such as a rock, God is a personal being who wants to be " +
                "in a relationship with you.");
    }
}
