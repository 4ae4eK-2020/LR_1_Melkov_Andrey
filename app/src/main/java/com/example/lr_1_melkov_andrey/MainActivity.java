package com.example.lr_1_melkov_andrey;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button changeTextVisibilityBtn;
    private TextView textViewGroup, textViewName;
    private boolean isTextVisibleNow, isPictureVisibleNow = true;
    private ImageButton changePictureVisibilityBtn;
    private ImageView imageCenterView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTextVisibilityBtn = findViewById(R.id.changeVisibilityBtn);
        textViewGroup = findViewById(R.id.textViewGroup);
        textViewName = findViewById(R.id.textViewName);

        changePictureVisibilityBtn = findViewById(R.id.changePictureVisibilityBtn);
        imageCenterView = findViewById(R.id.imageCenterView);

        changeTextVisibilityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isTextVisibleNow) {
                    textViewGroup.setVisibility(View.INVISIBLE);
                    textViewName.setVisibility(View.INVISIBLE);
                } else {
                    textViewGroup.setVisibility(View.VISIBLE);
                    textViewName.setVisibility(View.VISIBLE);
                }
                isTextVisibleNow = !isTextVisibleNow;
            }
        });
        changePictureVisibilityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPictureVisibleNow) {
                    imageCenterView.setVisibility(View.INVISIBLE);
                } else {
                    imageCenterView.setVisibility(View.VISIBLE);
                }
                isPictureVisibleNow = !isPictureVisibleNow;
            }
        });
    }
}