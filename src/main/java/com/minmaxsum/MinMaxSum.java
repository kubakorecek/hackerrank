package com.minmaxsum;

import java.util.List;


public class MinMaxSum {

    public static void miniMaxSum(List<Integer> inputArr) {
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;
        Long  sum = 0L;
        Double constraint = Math.pow(10.0, 9.0);
        for (var item : inputArr
        ) {
            sum += item;
            if (item < 1 || item > constraint.intValue()) {
                return;
            }

            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }
        }
        System.out.println("%d %d".formatted(sum - max, sum - min));

    }

}

