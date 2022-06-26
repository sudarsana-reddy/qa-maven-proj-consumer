package org.sud.example;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CalcConsumerTest {

    @Test
    public void calConsumerAddTest() {
        int result = new CalcConsumer().getAdd(2, 3);
        Assert.assertEquals(result, 5, "Expected the sum of 2 and 3 as 5");

    }

}
