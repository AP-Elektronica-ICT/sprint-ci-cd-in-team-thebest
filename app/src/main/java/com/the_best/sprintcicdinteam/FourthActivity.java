package com.the_best.sprintcicdinteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    private TextView number;
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        number = findViewById(R.id.editText);
    }

    public void IncreaseCounter(View view) {
        counter = Integer.parseInt(number.getText().toString());
        counter++;
        number.setText(counter);
    }
}
