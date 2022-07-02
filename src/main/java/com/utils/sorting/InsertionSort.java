package com.utils.sorting;

import java.util.List;

public class InsertionSort<T extends Number> implements ISort<T> {
    @Override
    public void sort(List<T> arr) {
        T tmp;
        int j;
        if ( arr.size() == 1){return;}
        for (int i = 1; i < arr.size(); i++)
        {
            tmp = arr.get(i);
            j = i - 1;
            while (j > -1 && tmp.doubleValue() < arr.get(j).doubleValue())
            {
                arr.set(j+1, arr.get(j)) ;
                j--;
            }
            arr.set(j+1,tmp);
        }

    }
}
