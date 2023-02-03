package com.example.hm_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getFromSecond();
    }

    private void getFromSecond() {
        EditText editTextThird = findViewById(R.id.et_third);
        Button buttonThird = findViewById(R.id.btn_third);
        TextView textViewThird = findViewById(R.id.text_third);

        textViewThird.setText(getIntent().getStringExtra("2"));
        buttonThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("3",editTextThird.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}