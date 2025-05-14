package com.pateluday07.sorting.insertion;

import java.util.Arrays;

public class InsertionSortTest {

    public static void main(String[] args) {
        int[] arr = {8, 2, 1, -1, -3, 3, 4, 7, 0};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        Arrays.stream(arr)
                .forEachOrdered(n -> System.out.print(n + " "));
    }
}
