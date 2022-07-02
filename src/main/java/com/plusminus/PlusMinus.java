package com.plusminus;


import java.util.ArrayList;

public class PlusMinus {


    public static void plusMinus(ArrayList<Integer> inputArray) {
        double n = inputArray.size();
        int neg = 0, pos = 0, zeros = 0;

        for (var item : inputArray
        ) {
            if (item > 0) {
                pos++;
            } else if (item < 0) {
                neg++;

            } else {
                zeros++;
            }

        }
        System.out.printf("%.6f%n",pos/n);
        System.out.printf("%.6f%n",neg/n);
        System.out.printf("%.6f%n",zeros/n);


    }


}

