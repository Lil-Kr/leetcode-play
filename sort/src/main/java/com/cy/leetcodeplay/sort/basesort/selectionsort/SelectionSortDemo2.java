package com.cy.leetcodeplay.sort.basesort.selectionsort;

import com.cy.common.util.CommonUtil;
import com.cy.common.util.StringPrint;

public class SelectionSortDemo2 {

  public static void main(String[] args) {
    int[] arr = new int[]{8, 6, 2, 3, 1, 5, 7, 4};
//    selectionSortMin(arr, arr.length);
//    System.out.println(StringPrint.printIntArray(arr));

    selectionSortMax(arr, arr.length);
    System.out.println(StringPrint.printIntArray(arr));
  }

  public static void selectionSortMin(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex])
          // 挪动指针到这个小的元素位置
          minIndex = j;
      }
      CommonUtil.swap(arr, i, minIndex);
    }
  }

  public static void selectionSortMax(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      int maxIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] > arr[maxIndex])
          maxIndex = j;
      }
      CommonUtil.swap(arr, i, maxIndex);
    }
  }

}
