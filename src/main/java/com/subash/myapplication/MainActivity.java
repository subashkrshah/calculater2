package com.subash.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doAdd(View v){
        EditText e1=(EditText)findViewById(R.id.number1);
        EditText e2 =(EditText)findViewById(R.id.number2);
        TextView t1=(TextView)findViewById(R.id.result);

        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());

        int sum=num1+num2;
        t1.setText(Integer.toString(sum));
    }
    public void dosubtract(View v){
        EditText e1=(EditText)findViewById(R.id.number1);
        EditText e2 =(EditText)findViewById(R.id.number2);
        TextView t1=(TextView)findViewById(R.id.result);

        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());

        int sum=num1-num2;
        t1.setText(Integer.toString(sum));
    }
    public void domultiply(View v){
        EditText e1=(EditText)findViewById(R.id.number1);
        EditText e2 =(EditText)findViewById(R.id.number2);
        TextView t1=(TextView)findViewById(R.id.result);

        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());

        int sum=num1*num2;
        t1.setText(Integer.toString(sum));
    }
    public void dodivide(View v){
        EditText e1=(EditText)findViewById(R.id.number1);
        EditText e2 =(EditText)findViewById(R.id.number2);
        TextView t1=(TextView)findViewById(R.id.result);

        int num1=Integer.parseInt(e1.getText().toString());
        int num2=Integer.parseInt(e2.getText().toString());

        int sum=num1/num2;
        t1.setText(Integer.toString(sum));
    }
}
