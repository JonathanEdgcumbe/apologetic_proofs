package com.example.jono.apologeticproofs.DivineAttributesPackage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jono.apologeticproofs.R;

public class BaseActivity extends AppCompatActivity {
    public LinearLayout sharedLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_layout);
        sharedLayout = (LinearLayout) findViewById(R.id.sharedLayout);
        setupBackButton();
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

    public void addHeading(String heading) {
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.heading_layout, sharedLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.sharedHeadingTextView);
        textView.setId(View.generateViewId());
        textView.setText(heading);
    }

    public void addNormalText(String text) {
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.normal_text_layout, sharedLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.sharedNormalTextView);
        textView.setId(View.generateViewId());
        textView.setText(Html.fromHtml(text));
    }

    public void addBlockQuote(String text) {
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.block_quote_layout, sharedLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.blockQuoteTextView);
        textView.setId(View.generateViewId());
        textView.setText(Html.fromHtml(text));
    }
}
