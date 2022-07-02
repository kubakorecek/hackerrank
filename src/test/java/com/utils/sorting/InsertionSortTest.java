package com.utils.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortTest {

    private final ArrayList<Double> inputArray= new ArrayList<>();

    ISort<Double> SortClass  = new InsertionSort<>();

    @Test
    void test()
    {
        List<Double> expectedResult = List.of(-166.0,1.0, 2.0, 2.0, 3.0,4.0,5.0,6.0,7.0);
        inputArray.add(5.0);
        inputArray.add(2.0);
        inputArray.add(4.0);
        inputArray.add(7.0);
        inputArray.add(1.0);
        inputArray.add(3.0);
        inputArray.add(2.0);
        inputArray.add(6.0);
        inputArray.add(-166.0);
        SortClass.sort(inputArray);
        Assertions.assertEquals ( expectedResult, inputArray);
    }
}
