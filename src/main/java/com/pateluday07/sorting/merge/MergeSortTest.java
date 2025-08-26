package com.pateluday07.sorting.merge;

import java.util.Arrays;

public class MergeSortTest {

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 3, 4};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);

        Arrays
                .stream(arr)
                .forEachOrdered(n -> System.out.print(n + " "));
    }
}
