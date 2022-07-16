package com.integers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class LonelyIntegerTest {

    @Test
    public void lonelyIntegerSampleCaseTest()
    {
       List<Integer> inputArray = List.of(1,2,3,4,3,2,1);
       Assertions.assertEquals(4,LonelyInteger.lonelyInteger(inputArray));
    }
}
