package com.pateluday07.sorting.quick.lomuto;

public class QuickSortLomuto {

    public void sort(int[] arr) {
        quickSortLomuto(arr, 0, arr.length - 1);
    }

    private void quickSortLomuto(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < arr[high])
                swap(arr, ++i, j);
        }
        swap(arr, ++i, high);
        //sort left side
        quickSortLomuto(arr, low, i - 1);
        //sort right side
        quickSortLomuto(arr, i + 1, high);
    }

    private void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

}
