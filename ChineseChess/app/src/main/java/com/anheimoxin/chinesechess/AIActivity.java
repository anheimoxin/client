package com.anheimoxin.chinesechess;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);
    }

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void actionStart(Context context) {
        Intent intent = new Intent(context, AIActivity.class);
        context.startActivity(intent);
    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
}
