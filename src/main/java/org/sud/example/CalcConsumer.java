package org.sud.example;

import com.sudarsana.azfeed.Calculator;

public class CalcConsumer {

    public int getAdd(int a, int b) {
        Calculator calculator = new Calculator();
        return calculator.add(a, b);
    }
}
