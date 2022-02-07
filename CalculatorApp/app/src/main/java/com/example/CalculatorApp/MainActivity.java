package com.example.CalculatorApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gadkille.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button add;
    private Button Substract;
    private Button divide1;
    private Button multiply;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Please put values");
        add = (Button) findViewById(R.id.Add);
        add.setOnClickListener(this::onClick);
        Substract = (Button) findViewById(R.id.Substract);
        Substract.setOnClickListener(this::onClick);
        divide1 = (Button) findViewById(R.id.divide1);
        divide1.setOnClickListener(this::onClick);
        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(this::onClick);
    }


    @Override
    public void onClick(View v) {
        EditText val1 = (EditText) findViewById(R.id.editTextVal1);
        EditText val2 = (EditText) findViewById(R.id.editTextVal2);
        int value1 = Integer.parseInt(val1.getText().toString());
        int value2 = Integer.parseInt(val2.getText().toString());
        switch (v.getId()){
            case R.id.Add:
                textView.setText(String.valueOf(value1+value2));
                break;
            case R.id.Substract:
                textView.setText(String.valueOf(value1-value2));
                break;
            case R.id.divide1:
                textView.setText(String.valueOf(value1/value2));
                break;
            case R.id.multiply:
                textView.setText(String.valueOf(value1*value2));
                break;
            default:
                textView.setText("Please put values");
        }

    }
}