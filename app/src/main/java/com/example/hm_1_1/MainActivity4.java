package com.example.hm_1_1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getFromThird();
    }

    private void getFromThird() {
        Button btnDest = findViewById(R.id.btn_destroy);
        TextView textViewForth = findViewById(R.id.text_forth);
        textViewForth.setText(getIntent().getStringExtra("3"));
        btnDest.setOnClickListener(view -> onDestroy());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}