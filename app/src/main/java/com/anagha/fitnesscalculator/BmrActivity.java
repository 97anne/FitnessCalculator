package com.anagha.fitnesscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BmrActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton bmrFemaleRadioButton;
    RadioButton bmrMaleRadioButton;

    EditText bmrAgeEditText;
    EditText bmrWeightEditText;
    EditText bmrHeightEditText;
    Button bmrCalculateButton;
    TextView bmrResultTextView;

    Double age;
    Double weight;
    Double height;
    Double resultBmr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        bmrFemaleRadioButton = findViewById(R.id.bmrFemaleRadioButton);
        bmrMaleRadioButton = findViewById(R.id.bmrMaleRadioButton);

        bmrAgeEditText = findViewById(R.id.bmrAgeEditText);
        bmrWeightEditText = findViewById(R.id.bmrWeightEditText);
        bmrHeightEditText = findViewById(R.id.bmrHeightEditText);
        bmrCalculateButton = findViewById(R.id.bmrCalculateButton);
        bmrResultTextView = findViewById(R.id.bmrResultTextView);

        bmrFemaleRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmrAgeEditText.setVisibility(View.VISIBLE);
                bmrWeightEditText.setVisibility(View.VISIBLE);
                bmrHeightEditText.setVisibility(View.VISIBLE);
                bmrCalculateButton.setVisibility(View.VISIBLE);
            }
        });
        bmrMaleRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmrAgeEditText.setVisibility(View.VISIBLE);
                bmrWeightEditText.setVisibility(View.VISIBLE);
                bmrHeightEditText.setVisibility(View.VISIBLE);
                bmrCalculateButton.setVisibility(View.VISIBLE);
            }
        });
    }

    public void calculateBmr(final View view){
        age = Double.parseDouble(bmrAgeEditText.getText().toString());
        weight = Double.parseDouble(bmrWeightEditText.getText().toString());
        height = Double.parseDouble(bmrHeightEditText.getText().toString());

        switch (radioGroup.getCheckedRadioButtonId()){
            case R.id.bmrFemaleRadioButton:
                resultBmr =  655.1 + ( 9.563 * weight) + ( 1.85 * height) - ( 4.676 * age);
                bmrResultTextView.setText("Your BMR is "+resultBmr+" cal/day");
                bmrResultTextView.setVisibility(View.VISIBLE);
                break;
            case R.id.bmrMaleRadioButton:
                resultBmr =  66.47 + ( 13.75 * weight) + ( 5.003 * height) - ( 6.755 * age);
                bmrResultTextView.setText("Your BMR is "+resultBmr+" cal/day");
                bmrResultTextView.setVisibility(View.VISIBLE);
                break;
        }
        bmrAgeEditText.setText("");
        bmrWeightEditText.setText("");
        bmrHeightEditText.setText("");
    }
}
