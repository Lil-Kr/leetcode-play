package com.cy.leetcodeplay.array.no88;

/**
 * @Author: Lil-K
 * @Date: 2024/4/18
 * @Description:
 */
public class Solution {

  /**
   *
   * @param nums1
   * @param m
   * @param nums2
   * @param n
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // 初始化三个指针
    int i = m - 1;  // 指向 nums1 的最后一个有效元素
    int j = n - 1;  // 指向 nums2 的最后一个元素
    int p = m + n - 1;  // 指向 nums1 的末尾

    // 从后向前遍历
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[p] = nums1[i];
        i--;
      } else {
        nums1[p] = nums2[j];
        j--;
      }
      p--;
    }

    // 如果 nums2 还有剩余元素, 继续合并
    while (j >= 0) {
      nums1[p] = nums2[j];
      j--;
      p--;
    }
  }

}