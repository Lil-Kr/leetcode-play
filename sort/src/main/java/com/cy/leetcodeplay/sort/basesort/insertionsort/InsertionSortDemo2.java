package com.cy.leetcodeplay.sort.basesort.insertionsort;

import com.cy.common.util.CommonUtil;
import com.cy.common.util.StringPrint;

/**
 * @Author: Lil-K
 * @Date: 2024/8/14
 * @Description:
 */
public class InsertionSortDemo2 {

  public static void main(String[] args) {
    int[] arr = new int[]{8, 6, 2, 3, 1, 5, 7, 4};
    insertionSort2(arr);
    System.out.println(StringPrint.printIntArray(arr));
  }

  public static void insertionSort(int[] arr) {
    int n = arr.length;

    for(int i = 1; i < n; i++) {
      for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
        CommonUtil.swap(arr, j, j - 1);
      }
    }
  }

  public static void insertionSort2(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
      int temp = arr[i];
      int j;
      for (j = i; j > 0 && temp < arr[j - 1]; j--) {
        arr[j] = arr[j - 1];
      }
      arr[j] = temp;
    }
  }

}