package com.time;

import com.plusminus.PlusMinus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TimeConversionTest {

    @Test
    void timeConversionTest()
    {
        String s = "19:05:45";
        Assertions.assertEquals(s,TimeConversion.timeConversion("07:05:45PM"));

        s = "12:01:00";
        Assertions.assertEquals(s,TimeConversion.timeConversion("12:01:00PM"));

        s = "00:01:00";
        Assertions.assertEquals(s,TimeConversion.timeConversion("12:01:00AM"));

    }
}
