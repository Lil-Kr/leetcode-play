package com.cy.leetcodeplay.array.no88;

import com.cy.common.util.PrintString;

/**
 * @Author: Lil-K
 * @Date: 2024/4/18
 * @Description:
 */
public class Solution1 {

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;

    merge(nums1, m, nums2, n);

    System.out.println(PrintString.printIntArray(nums1));
  }

  /**
   *
   * @param nums1
   * @param m
   * @param nums2
   * @param n
   */
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) {
      return;
    }

    if (m == 0 && n > 0) {
      for (int i = 0; i < n; i++) {
        nums1[i] = nums2[i];
      }
      return;
    }

    int i = 0, j = 0;
    int temp = -1;

    while (i < nums1.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        temp = nums1[i];
        nums1[i] = nums2[j];
        j++;
        i++;
      }
    }


  }
}