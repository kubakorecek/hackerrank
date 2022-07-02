package com.plusminus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


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
