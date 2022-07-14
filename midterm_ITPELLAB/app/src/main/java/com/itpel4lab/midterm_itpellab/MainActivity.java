package com.itpel4lab.midterm_itpellab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

     Button cal1, cal2, clr1, clr2;
     EditText num1, num2, num3, num4;
     TextView Up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal1 = (Button) findViewById(R.id.btnCal1);
        cal2 = (Button) findViewById(R.id.btnCalc2);
        clr1 = (Button) findViewById(R.id.btnClr1);
        clr2 = (Button) findViewById(R.id.btnClr2);
        num1 = (EditText) findViewById(R.id.txtfirstEnter);
        num2 = (EditText) findViewById(R.id.txtSecondEnter);
        num3 = (EditText) findViewById(R.id.txtThirdEnter);
        num4 = (EditText) findViewById(R.id.txtFourthEnter);
        Up = (TextView) findViewById(R.id.txtUp);

        cal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().toString().isEmpty() ||
                        num2.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Put numbers on the space provided",Toast.LENGTH_SHORT).show();
                }else {
                    float getFirst =
                            Float.parseFloat(num1.getText().toString());
                    float getSecond =
                            Float.parseFloat(num2.getText().toString());
                    float initialCalc = getFirst * getSecond;
                    float y = initialCalc/100;
                    Up.setText("Result: " + String.valueOf(y));
                }
            }
        });
        cal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num3.getText().toString().isEmpty() ||
                        num4.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Put numbers on the space provided",Toast.LENGTH_SHORT).show();
                }else{
                    float getThird =
                            Float.parseFloat(num3.getText().toString());
                    float getFourth =
                            Float.parseFloat(num4.getText().toString());
                    float initialCalculation = getThird * 100;
                    float x = initialCalculation/getFourth;
                    Up.setText("Result: " + String.valueOf(x));
                }
            }
        });
        clr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                num1.clearFocus();
                num2.clearFocus();
            }
        });
        clr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num3.setText("");
                num4.setText("");
                num3.clearFocus();
                num4.clearFocus();
            }
        });
    }
}
