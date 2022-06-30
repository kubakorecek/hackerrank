package com.minmaxsum;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;


public class MinMaxSumTest {

    List<Integer> inputArray = List.of(1, 3, 5, 7, 9);

    List<Integer> inputArray2 = List.of(1, 2, 3, 4 ,5);
    List<Integer> inputExDown = List.of(1, 3, 5, 7, 9, 0);

    List<Integer> inputArray3 = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
    Double a = Math.pow(10.0,10.0);
    List<Integer> inputExUp = List.of(1, 3, 5, 7, 9, a.intValue());

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        System.out.print("Test");

        Assertions.assertEquals("Test", outContent.toString()
                .trim());
    }

    @Test
    void MinMaxSumTest_borderUp()
    {
        MinMaxSum.miniMaxSum(inputExUp);
        Assertions.assertEquals("", outContent.toString().trim());
    }

    @Test
    void MinMaxSumTest_borderDown()
    {
        MinMaxSum.miniMaxSum(inputExDown);
        Assertions.assertEquals("", outContent.toString().trim());
    }

    @Test
    void MixSumTest(){
        MinMaxSum.miniMaxSum(inputArray);
        Assertions.assertEquals("16 24", outContent.toString().trim());
    }

    @Test
    void MixSumTest2(){
        MinMaxSum.miniMaxSum(inputArray2);
        Assertions.assertEquals("10 14", outContent.toString().trim());
    }

    @Test
    void MixSumTest3(){
        MinMaxSum.miniMaxSum(inputArray3);
        Assertions.assertEquals("2063136757 2744467344", outContent.toString().trim());
    }

    @BeforeEach
    public void tearDown() {
        System.setOut(originalOut);
    }
}
