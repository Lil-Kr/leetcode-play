package com.cy.leetcodeplay.sort.basesort.insertionsort;

import com.cy.common.util.PrintString;

/**
 * @Author: Lil-K
 * @Date: 2024/8/14
 * @Description:
 */
public class InsertionSortDemo {

  public static void main(String[] args) {
    int[] arr = new int[]{8, 6, 2, 3, 1, 5, 7, 4};
    insertionSort(arr);
    System.out.println(PrintString.printIntArray(arr));
  }

  public static void insertionSort(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
      int temp = arr[i];
      int j = i;
      for (; j > 0; j--) {
        if (arr[j - 1] > temp) {
          arr[j] = arr[j - 1];
        }else {
          break;
        }
      }
      arr[j] = temp;
    }
  }
}