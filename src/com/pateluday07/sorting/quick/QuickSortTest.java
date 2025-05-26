package com.pateluday07.sorting.quick;

import com.pateluday07.sorting.quick.lomuto.QuickSortLomuto;

import java.util.Arrays;

public class QuickSortTest {

    public static void main(String[] args) {
        QuickSortLomuto quickSortLomuto = new QuickSortLomuto();
        int[] arr = {4, 2, 6, 1, 3, 5};
        quickSortLomuto.sort(arr);
        Arrays.stream(arr)
                .forEachOrdered(n -> System.out.print(n + " "));
    }
}
