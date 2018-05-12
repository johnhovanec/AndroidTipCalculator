package com.example.jah.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tenPercent;
    Button fifteenPercent;
    Button twentyPercent;
    Button twentyfivePercent;
    EditText editText;
    EditText splitNumber;
    TextView textView;
    TextView totalView;
    TextView tipAndTotalView;

    Double money;
    Double finalAmount;
    int splitBetween;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tenPercent = (Button) findViewById(R.id.tenPercent);
        fifteenPercent = (Button) findViewById(R.id.fifteenPercent);
        twentyPercent = (Button) findViewById(R.id.twentyPercent);
        twentyfivePercent = (Button) findViewById(R.id.twentyfivePercent);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        totalView = (TextView) findViewById(R.id.totalView);
        splitNumber = (EditText) findViewById(R.id.splitNumber);
        tipAndTotalView = (TextView) findViewById(R.id.tipAndTotalView);

        //splitView = (TextView) findViewById(R.id.splitView);

        finalAmount = 1.00;
        splitBetween = 1;

        tenPercent.setOnClickListener(this);
        fifteenPercent.setOnClickListener(this);
        twentyPercent.setOnClickListener(this);
        twentyfivePercent.setOnClickListener(this);
        //splitBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        money =Double.parseDouble(editText.getText().toString());
        splitBetween = Integer.parseInt((splitNumber.getText().toString()));

        if (money <= 0) {
            totalView.setText("Error - Amount must be greater than 0. Please try again.");
        }
        else {
            if (view.getId() == tenPercent.getId()) {
                finalAmount = money * .10;
                finalAmount = Math.round(finalAmount *100.0) / 100.0;
                textView.setText("$" + finalAmount.toString());
                tipAndTotalView.setText("$" + (finalAmount + money));

                if (finalAmount > 0 && splitBetween >= 1) {
                    totalView.setText("$" + (finalAmount + money)/splitBetween + " each.");
                }
            }

            else if (view.getId() == fifteenPercent.getId()) {
                finalAmount = money * .15;
                finalAmount = Math.round(finalAmount *100.0) / 100.0;
                textView.setText("$" + finalAmount.toString());
                tipAndTotalView.setText("$" + (finalAmount + money));

                if (finalAmount > 0 && splitBetween >= 1) {
                    totalView.setText("$" + (finalAmount + money)/splitBetween + " each.");
                }
            }

            else if (view.getId() == twentyPercent.getId()) {
                finalAmount = money * .20;
                finalAmount = Math.round(finalAmount *100.0) / 100.0;
                textView.setText("$" + finalAmount.toString());
                tipAndTotalView.setText("$" + (finalAmount + money));

                if (finalAmount > 0 && splitBetween >= 1) {
                    totalView.setText("$" + (finalAmount + money)/splitBetween + " each.");
                }
            }

            else if (view.getId() == twentyfivePercent.getId()) {
                finalAmount = money * .25;
                finalAmount = Math.round(finalAmount *100.0) / 100.0;
                textView.setText("$" + finalAmount.toString());
                tipAndTotalView.setText("$" + (finalAmount + money));

                if (finalAmount > 0 && splitBetween >= 1) {
                    totalView.setText("$" + (finalAmount + money)/splitBetween + " each.");
                }
            }
            else {
                totalView.setText("Error in amount input, please try again");
            }

        }


    }
}
