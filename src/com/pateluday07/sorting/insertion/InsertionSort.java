package com.pateluday07.sorting.insertion;

public class InsertionSort {

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0 && key < arr[j]; j--)
                arr[j + 1] = arr[j];
            arr[j + 1] = key;
        }
    }
}
