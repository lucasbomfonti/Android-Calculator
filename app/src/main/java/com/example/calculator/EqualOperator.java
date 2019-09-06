package com.example.calculator;

import android.widget.TextView;

public class EqualOperator extends android.os.Handler implements Handler {
    @Override
    public void handleIt(Object... parameters) {
        CalculatorActivity activity = (CalculatorActivity) parameters[0];
        //declare Textviews from textViews pass from Calculator
        TextView inputTxt = (TextView) parameters[1];
        TextView solutionTxt = (TextView) parameters[2];

        solutionTxt.setText(inputTxt.getText().toString());
        inputTxt.setText("");
    }
}
