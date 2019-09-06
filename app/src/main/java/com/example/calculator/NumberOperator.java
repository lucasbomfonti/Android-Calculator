package com.example.calculator;

import android.widget.TextView;

public class NumberOperator extends android.os.Handler implements Handler {
    @Override
    public void handleIt(Object... parameters) {
        String numberString = (String) parameters[0];
        TextView inputText = (TextView) parameters[1];

        String number = inputText.getText().toString();

        number = number.concat(numberString);
        inputText.setText(number);
    }
}
