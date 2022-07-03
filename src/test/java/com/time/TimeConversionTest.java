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
    }
}
