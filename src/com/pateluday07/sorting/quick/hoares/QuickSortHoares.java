package com.pateluday07.sorting.quick.hoares;

public class QuickSortHoares {

    public void sort(int[] arr) {
        quickSortWithHoares(arr, 0, arr.length - 1);
    }

    private void quickSortWithHoares(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int partitionIndex = hoaresPartitionScheme(arr, low, high);

        //sort left elements
        quickSortWithHoares(arr, low, partitionIndex);
        //sort right elements
        quickSortWithHoares(arr, partitionIndex + 1, high);
    }

    private int hoaresPartitionScheme(int[] arr, int low, int high) {
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
