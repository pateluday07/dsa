package com.pateluday07.sorting.bubble;

public class BubbleSort {

    public void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            boolean isSwapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
    }

}
