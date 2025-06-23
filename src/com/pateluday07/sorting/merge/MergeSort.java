package com.pateluday07.sorting.merge;

public class MergeSort {

    public void sort(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    private void divide(int[] arr, int low, int high) {
        //base case
        if (low >= high)
            return;

        //divide the arr
        int middle = low + (high - low) / 2;

        //divide left part
        divide(arr, low, middle);

        //divide right part
        divide(arr, middle + 1, high);

        //prepare result arr
        merge(arr, low, middle, high);
    }

    private void merge(int[] arr, int low, int middle, int high) {
        int lLow = low;
        int rLow = middle + 1;
        int[] temp = new int[high - low + 1];
        int resultIndex = 0;
        while (lLow <= middle || rLow <= high) {
            if (lLow <= middle && rLow <= high) {
                if (arr[lLow] <= arr[rLow]) {
                    temp[resultIndex] = arr[lLow];
                    lLow++;
                } else {
                    temp[resultIndex] = arr[rLow];
                    rLow++;
                }
            } else if (lLow <= middle) {
                temp[resultIndex] = arr[lLow];
                lLow++;
            } else {
                temp[resultIndex] = arr[rLow];
                rLow++;
            }
            resultIndex++;
        }

        for (int i = 0; i < temp.length; i++)
            arr[low + i] = temp[i];

    }

}
