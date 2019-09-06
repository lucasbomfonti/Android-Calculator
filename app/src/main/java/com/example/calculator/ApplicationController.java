package com.example.calculator;

import android.os.Handler;

import java.util.HashMap;

public class ApplicationController {
    private static HashMap<String, Handler> controlHash = new HashMap<>();

    static {
    String numKey = "numKey";

    PlusOperator plus = new PlusOperator();
	controlHash.put("+", plus);

   SubOperator sub = new SubOperator();
	controlHash.put("-", sub);

    MultiOperator mult = new MultiOperator();
	controlHash.put("x", mult);

    DivideOperator div = new DivideOperator();
	controlHash.put("/", div);

    EqualOperator equal = new EqualOperator();
	controlHash.put("=", equal);

    NumberOperator number = new NumberOperator();
	controlHash.put(numKey, number);
}
    public static void handleRequest(String command, Object ... parameters) {
        //instead of setting to handler can we use reflection to set the Type of anOperation
        //to the type of the result of controlHash.get(command); thereby giving us flexability
        com.example.calculator.Handler anOperation = (com.example.calculator.Handler) controlHash.get(command);
        anOperation.handleIt(parameters);
    }
}
