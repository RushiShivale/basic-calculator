package com.example.mycaculator;

import static android.widget.EditText.*;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText first_input;
    EditText second_input;
    EditText result;
    TextView textView;
    TextView addition;
    TextView substraction;
    TextView multiplication;
    TextView division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        first_input = findViewById(R.id.first_input);
        second_input = findViewById(R.id.second_input);
        result = findViewById(R.id.result);
        textView = findViewById(R.id.textView);
        addition = findViewById(R.id.addition);
        substraction = findViewById(R.id.substraction);
        multiplication = findViewById(R.id.multiplication);
        division = findViewById(R.id.division);

        //perform addion on click
        addition.setOnClickListener(v -> {
            int first = Integer.parseInt(first_input.getText().toString());
            int second = Integer.parseInt(second_input.getText().toString());
            int sum = first + second;
            result.setText(String.valueOf(sum));
        });

        //perform substraction on click
        substraction.setOnClickListener(v -> {
            int first = Integer.parseInt(first_input.getText().toString());
            int second = Integer.parseInt(second_input.getText().toString());
            int sub = first - second;
            result.setText(String.valueOf(sub));
        });

        //perform multiplication on click
        multiplication.setOnClickListener(v -> {
            int first = Integer.parseInt(first_input.getText().toString());
            int second = Integer.parseInt(second_input.getText().toString());
            int mul = first * second;
            result.setText(String.valueOf(mul));
        });

        //perform division on click
        division.setOnClickListener(v -> {
            int first = Integer.parseInt(first_input.getText().toString());
            int second = Integer.parseInt(second_input.getText().toString());
            int div = first / second;
            result.setText(String.valueOf(div));
        });
    }
}
