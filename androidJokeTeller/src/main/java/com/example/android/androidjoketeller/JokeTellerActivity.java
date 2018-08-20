package com.example.android.androidjoketeller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeTellerActivity extends AppCompatActivity{

    public static final String EXTRA ="JOKE";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_activity_main);
        textView = (TextView) findViewById(R.id.joke_view);
        textView.setText((String) getIntent().getExtras().get(EXTRA));
    }

}
