package com.example.lr_1_melkov_andrey;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button changeVisibilityBtn;
    private TextView textViewGroup, textViewName;
    private boolean isVisibleNow = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeVisibilityBtn = findViewById(R.id.changeVisibilityBtn);
        textViewGroup = findViewById(R.id.textViewGroup);
        textViewName = findViewById(R.id.textViewName);

        changeVisibilityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isVisibleNow == true) {
                    textViewGroup.setVisibility(View.INVISIBLE);
                    textViewName.setVisibility(View.INVISIBLE);
                } else {
                    textViewGroup.setVisibility(View.VISIBLE);
                    textViewName.setVisibility(View.VISIBLE);
                }
                isVisibleNow = !isVisibleNow;
            }
        });
    }
}