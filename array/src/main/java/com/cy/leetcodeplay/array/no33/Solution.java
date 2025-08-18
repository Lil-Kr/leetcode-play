package com.cy.leetcodeplay.array.no33;

/**
 * @Author: Lil-K
 * @Date: 2024/8/23
 * @Description: no.33. Search in Rotated Sorted Array
 * link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * top-100
 *
 * Binary Search
 */
public class Solution {

	public static int search(int[] nums, int target) {
		int n = nums.length;
		int l = 0, r = n - 1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				return mid;
			}

			// 左半部分有序
			if (nums[l] <= nums[mid]) {
				if (nums[l] <= target && target < nums[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			} else { // 右半部分有序
				if (nums[mid] < target && target <= nums[r]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
		}
		return -1;
	}
}
