package com.example.gpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText grade1, grade2, grade3, grade4, grade5;
    TextView result;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        grade1 = findViewById(R.id.editTextTextPersonName);
        grade2 = findViewById(R.id.editTextTextPersonName2);
        grade3 = findViewById(R.id.editTextTextPersonName3);
        grade4 = findViewById(R.id.editTextTextPersonName4);
        grade5 = findViewById(R.id.editTextTextPersonName5);
        calculate = findViewById(R.id.button);
        result = findViewById(R.id.textView);

        calculate.setOnClickListener(v -> {

            if (checkEmpty()){
            double g1 = Double.parseDouble(grade2.getText().toString());
            double g2 = Double.parseDouble(grade2.getText().toString());
            double g3 = Double.parseDouble(grade3.getText().toString());
            double g4 = Double.parseDouble(grade4.getText().toString());
            double g5 = Double.parseDouble(grade5.getText().toString());
            double gpa = (g1+g2+g3+g4+g5)/5;
            result.setText("Your GPA is " + gpa);
            calculate.setText("Clear Form");
            if (gpa < 60) {
                calculate.setBackgroundColor(0xFFFF0000);
            } else if (gpa >= 60 && gpa <= 79) {
                calculate.setBackgroundColor(0xFFFFFF00);
            } else {
                calculate.setBackgroundColor(0xFF008000);
            }}
        });

    }
    boolean isEmpty(EditText text){
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    boolean checkEmpty() {
        if (isEmpty(grade1)) {
            grade1.setError("Please enter grade");
            return false;
        }
        if (isEmpty(grade2)) {
            grade2.setError("Please enter grade");
            return false;
        }
        if (isEmpty(grade3)) {
            grade3.setError("Please enter grade");
            return false;
        }
        if (isEmpty(grade4)) {
            grade1.setError("Please enter grade");
            return false;
        }
        if (isEmpty(grade5)) {
            grade5.setError("Please enter grade");
            return false;
        }
        return true;
    }
}


