package com.utils.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Number> implements ISort<T> {


    public void _sort(List<T> arr, Integer start, Integer end) {
        if (start >= end) {
            return;
        }
        int q = ((end + start) / 2);
        _sort(arr, start, q);
        _sort(arr, q + 1, end);
        merge(arr, start, q, end);
    }

    private void merge(List<T> arr, Integer start, Integer middle, Integer end) {
        List<T> left = new ArrayList<>();
        List<T> right = new ArrayList<>();

        int n1 = middle - start + 1;
        int n2 = end - middle;

        for (int i = 0; i < n1; i++) {
            left.add(arr.get(start + i));
        }

        for (int i = 0; i < n2; i++) {
            right.add(arr.get(middle + i + 1));
        }

        int j = 0;
        int i = 0;
        int k = start;

        while (i < n1 && j < n2) {

            if (left.get(i).doubleValue() <= right.get(j).doubleValue()) {
                arr.set(k, left.get(i));
                i++;
            } else {
                arr.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr.set(k, left.get(i));
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr.set(k, right.get(j));
            j++;
            k++;
        }

    }

    @Override
    public void sort(List<T> arr) {
        this._sort(arr, 0, arr.size() - 1);
    }
}
