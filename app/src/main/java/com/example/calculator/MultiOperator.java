package com.example.calculator;

import android.widget.TextView;

public class MultiOperator extends android.os.Handler implements Handler{

    @Override
    public void handleIt(Object... parameters) {
        //pull the CalculatorActivity from the Calculator class and assigns to activity
        CalculatorActivity activity = (CalculatorActivity) parameters[0];
        //declare Textviews from textViews pass from Calculator

        TextView inputTxt = (TextView) parameters[1];
        TextView solutionTxt = (TextView) parameters[2];

        double value1 = Double.parseDouble(inputTxt.getText().toString());
        double value2 = Double.parseDouble(solutionTxt.getText().toString());

        double result = (value1 * value2);

        String castResult = Double.toString(result);

        solutionTxt.setText(castResult);


        inputTxt.setText("");
    }
}
