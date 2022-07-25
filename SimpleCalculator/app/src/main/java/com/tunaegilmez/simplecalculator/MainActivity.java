package com.tunaegilmez.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberText;
    EditText numberText2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberText = findViewById(R.id.numberText);
        numberText2 = findViewById(R.id.numberText2);
        resultText = findViewById(R.id.resultText);


    }

    public void sum(View view){

        if (numberText.getText().toString().matches("") || numberText2.getText().toString().matches("")){

            resultText.setText("Enter Number!");

        }else {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 + number2;
            resultText.setText("Result : " + result);
        }
    }

    public void deduct(View view){
        if (numberText.getText().toString().matches("") || numberText2.getText().toString().matches("")){

            resultText.setText("Enter Number!");

        }else {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 - number2;
            resultText.setText("Result : " + result);
        }
    }

    public void multiply(View view){
        if (numberText.getText().toString().matches("") || numberText2.getText().toString().matches("")){

            resultText.setText("Enter Number!");

        }else {
            int number1 = Integer.parseInt(numberText.getText().toString());
            int number2 = Integer.parseInt(numberText2.getText().toString());

            int result = number1 * number2;
            resultText.setText("Result : " + result);
        }
    }

    public void divide(View view){

        if (numberText.getText().toString().matches("") || numberText2.getText().toString().matches("")){

            resultText.setText("Enter Number!");

        }else {
            double number1 = Integer.parseInt(numberText.getText().toString());
            double number2 = Integer.parseInt(numberText2.getText().toString());

            double result = number1 / number2;
            resultText.setText("Result : " + result);
        }
    }

}