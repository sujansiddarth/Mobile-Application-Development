package com.example.conversionsujansiddarthgowdrukaribasappav1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText milesEnter;
    private Button convertButton;
    private TextView kilometerResult;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milesEnter = findViewById(R.id.milesEnter);
        convertButton = findViewById(R.id.convertButton);
        kilometerResult = findViewById(R.id.kilometerResult);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double miles = Double.parseDouble(milesEnter.getText().toString());
                double kilometers = miles * 1.609;
                kilometerResult.setText(kilometers + " km");
            }
        });
    }
}