package com.cy.leetcodeplay.array.no852;

/**
 * @Author: Lil-K
 * @Date: 2024/8/31
 * @Description:
 * 题目要求 O(logn)
 */
public class Solution {


	/**
	 * O(n)
	 * @param arr
	 * @return
	 */
	public int peakIndexInMountainArray(int[] arr) {
		int max = -1, maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * O(logn)
	 * 二分查找
	 * @param arr
	 * @return
	 */
	public int peakIndexInMountainArray2(int[] arr) {
		int l = 0, r = arr.length - 1;

		while (l < r) { // 这个条件很关键, 当 1 == r时, 说明已经找到了
			int mid = l + (r - l) / 2;
			if (arr[mid] > arr[mid + 1]) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
}
