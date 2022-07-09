package com.strings.hash;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArrayTest {

    @Test
    void testBasic()
    {


        List<Integer> expectedResult = List.of(2, 1, 0);
        ArrayList<Integer> inputArray;
        List<String> strings = List.of("ab", "ab", "abc");
        List<String> queries =  List.of("ab", "abc", "bc");
        Assertions.assertEquals (expectedResult, SparseArray.matchingStrings(
                strings,  queries));
    }

    @Test
    void testBasic2()
    {
        List<Integer> expectedResult = List.of(1, 0, 1);;
        ArrayList<Integer> inputArray;
        List<String> strings = List.of("def", "de", "fgh");
        List<String> queries =  List.of("de", "lmn", "fgh");
        Assertions.assertEquals (expectedResult, SparseArray.matchingStrings(
                strings,  queries));
    }

    @Test
    void testBasic1()
    {
        List<Integer> expectedResult = List.of(2, 1, 0);;
        ArrayList<Integer> inputArray;
        List<String> strings = List.of("aba", "baba", "aba","xzxb");
        List<String> queries =  List.of("aba", "xzxb", "ab");
        Assertions.assertEquals (expectedResult, SparseArray.matchingStrings(
                strings,  queries));
    }

    @Test
    void testBasic3()
    {
        List<Integer> expectedResult = List.of(1, 3, 4,3,2);;
        ArrayList<Integer> inputArray;
        List<String> strings = List.of("abcde", "sdaklfj", "asdjf","na",
               "basdn","sdaklfj", "asdjf","na",
                "asdjf", "na",
                "basdn","asdjf", "sdaklfj"

        );
        List<String> queries =  List.of("abcde", "sdaklfj", "asdjf", "na", "basdn");
        Assertions.assertEquals (expectedResult, SparseArray.matchingStrings(
                strings,  queries));
    }

    @Test
    void testBasic4() throws IOException {
        List<String> strings =  Files.readAllLines(Path.of("src/test/data/Strings4.txt"));
        List<String> queries = Files.readAllLines(Path.of("src/test/data/Queries4.txt"));
        List<String> expectedResultStr = Files.readAllLines(Path.of("src/test/data/Result4.txt"));
        List<Integer> expectedResult =

        expectedResultStr.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
      
        Assertions.assertEquals (expectedResult, SparseArray.matchingStrings(
                strings,  queries));
    }


}
