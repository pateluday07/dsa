package com.pateluday07.sorting.quick.hoares;

public class QuickSortHoareRandomPivot {

    public void sort(int[] arr) {
        quickSortWithHoare(arr, 0, arr.length - 1);
    }

    private void quickSortWithHoare(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int partitionIndex = hoarePartitionSchemeWithRandomPivot(arr, low, high);

        //sort left elements
        quickSortWithHoare(arr, low, partitionIndex);
        //sort right elements
        quickSortWithHoare(arr, partitionIndex + 1, high);
    }

    private int hoarePartitionSchemeWithRandomPivot(int[] arr, int low, int high) {
        //selecting random pivot
        int randomPivotIndex = low + (int) (Math.random() * (high - low + 1));
        swap(arr, low, randomPivotIndex);

        int i = low - 1;
        int j = high + 1;
        int pivot = arr[low];
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j)
                return j;
            else
                swap(arr, i, j);
        }
    }

    private void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}
