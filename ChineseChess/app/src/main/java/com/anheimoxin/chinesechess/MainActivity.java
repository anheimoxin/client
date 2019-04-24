package com.anheimoxin.chinesechess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAI = findViewById(R.id.btnAI);
        Button btnNetwork = findViewById(R.id.btnNetwork);

        btnAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //>>>>>>>>>>>>>>>>>>>>>>>
                AIActivity.actionStart(v.getContext());
                //<<<<<<<<<<<<<<<<<<<<<<<
            }
        });

        btnNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
