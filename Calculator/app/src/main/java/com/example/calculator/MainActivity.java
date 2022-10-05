package com.example.calculator;

import static android.text.TextUtils.isEmpty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Setting variables

    EditText numberBox1, numberBox2, numberBox3;
    TextView currentOperator;
    Double num1, num2, num3;

    //numberBox3.setText(String.valueOf(result));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void initVar(){

    }
    //Addition method
    public void Add(View view){
        EditText numberBox1 = findViewById(R.id.numberBox1);
        EditText numberBox2 = findViewById(R.id.numberBox2);
        TextView numberBox3 = findViewById(R.id.numberBox3);
        TextView currentOperator = findViewById(R.id.currentOperator);

        if(numberBox1.getText().toString().isEmpty()) {
            numberBox3.setText("Insert First Number");
        }
        else if(numberBox2.getText().toString().isEmpty()){
            numberBox3.setText("Insert Second Number");
        }
        else {
            Double num1 = Double.parseDouble(numberBox1.getText().toString());
            Double num2 = Double.parseDouble(numberBox2.getText().toString());

            Double result = num1 + num2;
            currentOperator.setText("+");
            numberBox3.setText(String.valueOf(result));
        }
    }

    //Subtraction method
    public void Sub(View view){
        EditText numberBox1 = findViewById(R.id.numberBox1);
        EditText numberBox2 = findViewById(R.id.numberBox2);
        TextView numberBox3 = findViewById(R.id.numberBox3);
        TextView currentOperator = findViewById(R.id.currentOperator);
        if(numberBox1.getText().toString().isEmpty()) {
            numberBox3.setText("Insert First Number");
        }
        else if(numberBox2.getText().toString().isEmpty()){
            numberBox3.setText("Insert Second Number");
        }
        else {
            Double num1 = Double.parseDouble(numberBox1.getText().toString());
            Double num2 = Double.parseDouble(numberBox2.getText().toString());
            Double result = num1 - num2;

            currentOperator.setText("-");
            numberBox3.setText(String.valueOf(result));
        }
    }

    //Division method
    public void Div(View view){
        EditText numberBox1 = findViewById(R.id.numberBox1);
        EditText numberBox2 = findViewById(R.id.numberBox2);
        TextView numberBox3 = findViewById(R.id.numberBox3);
        TextView currentOperator = findViewById(R.id.currentOperator);
        if(numberBox1.getText().toString().isEmpty()) {
            numberBox3.setText("Insert First Number");
        }
        else if(numberBox2.getText().toString().isEmpty()){
            numberBox3.setText("Insert Second Number");
        }
        else {
            Double num1 = Double.parseDouble(numberBox1.getText().toString());
            Double num2 = Double.parseDouble(numberBox2.getText().toString());
            if (num2 > 0) {
                Double result = (Double) num1 / (Double) num2;
                currentOperator.setText("÷");
                numberBox3.setText(String.valueOf(result));
            } else {
                numberBox3.setText("INVALID");
                currentOperator.setText("÷");
            }
        }
    }
    //Multiplication method
    public void Mul(View view) {
        EditText numberBox1 = findViewById(R.id.numberBox1);
        EditText numberBox2 = findViewById(R.id.numberBox2);
        TextView numberBox3 = findViewById(R.id.numberBox3);
        TextView currentOperator = findViewById(R.id.currentOperator);
        if (numberBox1.getText().toString().isEmpty()) {
            numberBox3.setText("Insert First Number");
        } else if (numberBox2.getText().toString().isEmpty()) {
            numberBox3.setText("Insert Second Number");
        } else {
            Double num1 = Double.parseDouble(numberBox1.getText().toString());
            Double num2 = Double.parseDouble(numberBox2.getText().toString());
            Double result = num1 * num2;

            currentOperator.setText("X");
            numberBox3.setText(String.valueOf(result));
        }
    }
}