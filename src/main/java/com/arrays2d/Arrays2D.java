package com.arrays2d;

import java.util.ArrayList;
import java.util.List;

public class Arrays2D {
    public static List<Integer> reverseArray(ArrayList<Integer> inputArray) {
        int counter = 0, second, first;

        for (; counter < (inputArray.size() / 2); counter++) {

            first = inputArray.get(counter);
            second = inputArray.get(inputArray.size() - counter - 1);
            inputArray.set(counter, second);
            inputArray.set(inputArray.size() - counter - 1, first);
        }

        return inputArray;
    }
}
