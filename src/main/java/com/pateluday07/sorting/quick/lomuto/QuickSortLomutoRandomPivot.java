package com.pateluday07.sorting.quick.lomuto;

public class QuickSortLomutoRandomPivot {

    public void sort(int[] arr) {
        lomutoPartitionRandomPivot(arr, 0, arr.length - 1);
    }

    private void lomutoPartitionRandomPivot(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int pivotIndex = low + (int) (Math.random() * (high - low + 1));
        swap(arr, pivotIndex, high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < arr[high])
                swap(arr, ++i, j);
        }
        swap(arr, ++i, high);
        //sort left side
        lomutoPartitionRandomPivot(arr, low, i - 1);
        //sort right side
        lomutoPartitionRandomPivot(arr, i + 1, high);
    }

    private void swap(int[] arr, int indexA, int indexB) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}
