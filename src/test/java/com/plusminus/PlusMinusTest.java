package com.plusminus;

import com.arrays2d.Arrays2D;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;





public class PlusMinusTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void givenSystemOutRedirection_whenInvokePrintln_thenOutputCaptorSuccess() {
        System.out.print("Hello Baeldung Readers!!");

        Assertions.assertEquals("Hello Baeldung Readers!!", outContent.toString()
                .trim());
    }

    @Test
    void plusMinusTest()
    {
        List<Double> expectedResult = List.of(0.500000, 0.333333, 0.166667);
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(-4);
        inputArray.add(3);
        inputArray.add(-9);
        inputArray.add(0);
        inputArray.add(4);
        inputArray.add(1);
        PlusMinus.plusMinus(inputArray);
        Assertions.assertEquals("0.500000\r\n0.333333\r\n0.166667", outContent.toString().trim());
    }

    @BeforeEach
    public void tearDown() {
        System.setOut(originalOut);
    }
}
