package com.anagha.fitnesscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BmiActivity extends AppCompatActivity {
    EditText bmiWeightEditText;
    EditText bmiHeightEditText;
    Button bmiCalculateButton;
    TextView resultBmiTextView;

    Double weight;
    Double height;
    Double heightInMeters;
    Double resultBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        bmiWeightEditText = findViewById(R.id.bmiWeightEditText);
        bmiHeightEditText = findViewById(R.id.bmiHeightEditText);
        bmiCalculateButton = findViewById(R.id.bmiCalculateButton);
        resultBmiTextView = findViewById(R.id.resultBmiTextView);
    }

    public void calculateBmi(View view){
        weight = Double.parseDouble(bmiWeightEditText.getText().toString());
        height = Double.parseDouble(bmiHeightEditText.getText().toString());
        heightInMeters = height / 100;

        resultBmi = weight / Math.pow(heightInMeters, 2);

        resultBmiTextView.setText("Your BMI is "+ resultBmi);
        resultBmiTextView.setVisibility(View.VISIBLE);
    }
}
