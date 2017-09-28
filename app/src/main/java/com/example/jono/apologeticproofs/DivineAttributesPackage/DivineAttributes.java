package com.example.jono.apologeticproofs.DivineAttributesPackage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jono.apologeticproofs.R;

public class DivineAttributes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divine_attributes);
        setupBackButton();
        setupOmnibenevolenceBtn();
        setupOmnipotenceBtn();
        setupOmnipresenceBtn();
        setupOmniscienceBtn();
        setupEternalBtn();
        setupPersonalBtn();
        setupSpiritBtn();
        setTitle("Divine Attributes");
    }


    private void setupOmnipotenceBtn() {
        Button button = (Button) findViewById(R.id.OmnipotenceBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Omnipotence.class);
                startActivity(intent);
            }
        });
    }


    private void setupOmniscienceBtn() {
        Button button = (Button) findViewById(R.id.OmniscienceBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Omniscience.class);
                startActivity(intent);
            }
        });
    }


    private void setupOmnibenevolenceBtn() {
        Button button = (Button) findViewById(R.id.OmnibenevolenceBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Omnibenevolence.class);
                startActivity(intent);
            }
        });
    }


    private void setupOmnipresenceBtn() {
        Button button = (Button) findViewById(R.id.OmnipresenceBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Omnipresence.class);
                startActivity(intent);
            }
        });
    }

    private void setupPersonalBtn() {
        Button button = (Button) findViewById(R.id.PersonalBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GodPersonal.class);
                startActivity(intent);
            }
        });
    }

    private void setupEternalBtn() {
        Button button = (Button) findViewById(R.id.EternalBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GodEternal.class);
                startActivity(intent);
            }
        });
    }

    private void setupSpiritBtn() {
        Button button = (Button) findViewById(R.id.SpiritBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GodSpirit.class);
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
