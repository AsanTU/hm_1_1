package com.example.hm_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getTextFromMain();
    }

    private void getTextFromMain() {
        EditText editTextTwo = findViewById(R.id.et_two);
        Button buttonTwo = findViewById(R.id.btn_two);
        TextView textViewTwo = findViewById(R.id.text_second);


        textViewTwo.setText(getIntent().getStringExtra("1"));


        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("2", editTextTwo.getText().toString());
                startActivity(intent);
                finish();
            }
        });

    }
}