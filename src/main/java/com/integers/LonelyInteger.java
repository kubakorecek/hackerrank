package com.integers;

import com.utils.sorting.ISort;
import com.utils.sorting.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {
    public static int lonelyInteger(List<Integer> inputArray) {

        ISort<Integer> sortAlg = new MergeSort<>();
        ArrayList<Integer> _tmpArray = new ArrayList<>(inputArray);
        sortAlg.sort(_tmpArray);
        for (int i = 0 ; i < _tmpArray.size() - 1; i = i+2)
        {
            if(!_tmpArray.get(i).equals(_tmpArray.get(i+1)))
            {
                return _tmpArray.get(i);
            }
        }
        return _tmpArray.get(_tmpArray.size() - 1);
    }
}
