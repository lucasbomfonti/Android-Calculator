package com.example.calculator;

import android.widget.TextView;

public class PlusOperator extends android.os.Handler implements Handler {
    @Override
    public void handleIt(Object... parameters) {
        CalculatorActivity calculatorActivity = (CalculatorActivity) parameters[0];
        TextView txtInput = (TextView) parameters[1];
        TextView txtSolution = (TextView) parameters[2];

        double value1 = Double.parseDouble(txtInput.getText().toString());
        double  value2 = Double.parseDouble(txtInput.getText().toString());

        double result = value1 + value2;

        String castResult = Double.toString(result);

        txtSolution.setText(castResult);

        txtInput.setText("");
    }
}
