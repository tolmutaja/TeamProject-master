package com.example.opilane.randomapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnRightButtonPress(View v) {
        Button RightBtn = (Button) v;
        RightBtn.setText("Clicked");
        RightBtn.setBackgroundColor(Color.RED);
    }

    public void OnLeftButtonPress(View v) {
        Button LeftBtn = (Button) v;
        LeftBtn.setText("Clicked");
        LeftBtn.setBackgroundColor(Color.CYAN);
    }

    public void OnUpButtonPress(View v) {
        Button UpBtn = (Button) v;
        UpBtn.setText("Clicked");
        UpBtn.setBackgroundColor(Color.GREEN);
    }

    public void OnDownButtonPress(View v) {
        Button DownBtn = (Button) v;
        DownBtn.setText("Clicked");
        DownBtn.setBackgroundColor(Color.MAGENTA);
    }

    public void OnNextButtonPress(View v) {
        Button NextBtn = (Button) v;
        NextBtn.setText("Clicked");
        NextBtn.setBackgroundColor(Color.BLUE);
        launchActivity();
    }

    private void launchActivity() {
        Intent intent = new Intent(this, EnterPasswordActivity.class);
        startActivity(intent);
    }
}
