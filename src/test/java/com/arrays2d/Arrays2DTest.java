package com.arrays2d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class Arrays2DTest {

    @Test
    void reverseArrayTest() {
        List<Integer> expectedResult = List.of(3, 2, 1);
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(3);
        Assertions.assertEquals ( expectedResult, Arrays2D.reverseArray(inputArray));
    }
}
