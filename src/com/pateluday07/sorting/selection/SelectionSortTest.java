package com.pateluday07.sorting.selection;

import java.util.Arrays;

public class SelectionSortTest {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        Arrays.stream(arr).forEachOrdered(n -> System.out.print(n + " "));
    }
}
