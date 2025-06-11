package com.pateluday07.sorting.quick;

import com.pateluday07.sorting.quick.hoares.QuickSortHoareRandomPivot;
import com.pateluday07.sorting.quick.hoares.QuickSortHoares;
import com.pateluday07.sorting.quick.lomuto.QuickSortLomuto;
import com.pateluday07.sorting.quick.lomuto.QuickSortLomutoRandomPivot;

import java.util.Arrays;

public class QuickSortTest {

    public static void main(String[] args) {
        QuickSortLomuto quickSortLomuto = new QuickSortLomuto();
        int[] arr = {4, 2, 6, 1, 3, 5};
        quickSortLomuto.sort(arr);
        Arrays.stream(arr)
                .forEachOrdered(n -> System.out.print(n + " "));
        System.out.println();

        QuickSortLomutoRandomPivot quickSortLomutoRandomPivot = new QuickSortLomutoRandomPivot();
        int[] arr1 = {8, 6, 5, 4, 3, 2, 1};
        quickSortLomutoRandomPivot.sort(arr1);
        Arrays.stream(arr1)
                .forEachOrdered(n -> System.out.print(n + " "));
        System.out.println();

        QuickSortHoares quickSortHoares = new QuickSortHoares();
        int[] arr3 = {9, 4, 7, 1, 6, 2, 8};
        quickSortHoares.sort(arr3);
        Arrays.stream(arr3)
                .forEachOrdered(n -> System.out.print(n + " "));
        System.out.println();

        QuickSortHoareRandomPivot quickSortHoareRandomPivot = new QuickSortHoareRandomPivot();
        int[] arr4 = {3, 9, 1, 7, 5, 2, 8, 1};
        quickSortHoareRandomPivot.sort(arr4);
        Arrays.stream(arr4)
                .forEachOrdered(n -> System.out.print(n + " "));
    }
}
