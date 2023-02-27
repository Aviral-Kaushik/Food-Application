package com.aviral.foodapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;

import com.aviral.foodapp.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ConstraintLayout btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(view -> startActivity(new Intent(this, MainActivity.class)));

    }
}