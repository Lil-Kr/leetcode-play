package com.cy.leetcodeplay.sort.basesort.selectionsort;

import com.cy.leetcodeplay.common.util.CommonUtil;
import com.cy.leetcodeplay.common.util.PrintString;

public class SelectionSortDemo {

  public static void main(String[] args) {
    int[] arr = new int[]{8, 6, 2, 3, 1, 5, 7, 4};
    selectionSort(arr);
    System.out.println(PrintString.printIntArray(arr));
  }

  public static void selectionSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      CommonUtil.swap(arr, i, minIndex);
    }
  }
}