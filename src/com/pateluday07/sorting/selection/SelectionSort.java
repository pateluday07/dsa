package com.pateluday07.sorting.selection;

public class SelectionSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minValueIndex])
                    minValueIndex = j;
            }
            if (minValueIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minValueIndex];
                arr[minValueIndex] = temp;
            }
        }
    }
}
