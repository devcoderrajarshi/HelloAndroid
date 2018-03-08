package com.example.rajar.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void linkClicked(View view) {
        Intent browserIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.udacity.com"));
        startActivity(browserIntent);
    }
}
