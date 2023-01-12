package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add,sub,mul,div;
    EditText num1,num2;
    TextView answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=findViewById(R.id.btn1);
        sub=findViewById(R.id.btn2);
        mul=findViewById(R.id.btn3);
        div=findViewById(R.id.btn4);
        num1=findViewById(R.id.No1);
        num2=findViewById(R.id.No2);
        answer=findViewById(R.id.textv1);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float no1 =Float.parseFloat(num1.getText().toString());
                float no2 =Float.parseFloat(num2.getText().toString());
                float Answer = no1+no2;
                answer.setText("Answer:   "+ Answer);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int no1 =Integer.parseInt(num1.getText().toString());
                int no2 =Integer.parseInt(num2.getText().toString());
                int Answer = no1-no2;
                answer.setText("Answer:   "+ Answer);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float no1 =Integer.parseInt(num1.getText().toString());
                float no2 =Integer.parseInt(num2.getText().toString());
                float Answer = no1/no2;
                answer.setText("Answer:   "+ Answer);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float no1 =Integer.parseInt(num1.getText().toString());
                float no2 =Integer.parseInt(num2.getText().toString());
                float Answer = no1*no2;
                answer.setText("Answer:   "+ Answer);
            }
        });
    }
}