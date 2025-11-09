package com.cy.leetcodeplay.array.no34;

/**
 * @Author: Lil-K
 * @Date: 2024/3/6
 * @Description: no.34
 * title: Find First and Last Position of Element in Sorted Array
 * link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */
public class Solution {

	/**
	 * solution1: binary search
	 * recommend
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] searchRange(int[] nums, int target) {
		int left = findLeft(nums, target);
		int right = findRight(nums, target);
		return new int[]{left, right};
	}

	private int findLeft(int[] nums, int target) {
		int l = 0, r = nums.length - 1, mid;
		int ans = -1;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				ans = mid;
			}

			if (nums[mid] >= target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return ans;
	}

	private int findRight(int[] nums, int target) {
		int l = 0, r = nums.length - 1, mid;
		int ans = -1;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				ans = mid;
			}

			if (nums[mid] <= target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return ans;
	}

	/**
	 * solution2: two pointer
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] searchRange2(int[] nums, int target) {
		int n = nums.length;
		int[] error = new int[]{-1, -1};
		if (n <= 0) return error;

		if (n == 1) {
			if (nums[0] == target){
				return new int[]{0, 0};
			} else {
				return error;
			}
		}

		int l = 0, r = n - 1;
		while (l <= r && nums[l] != nums[r]) {
			if (nums[l] != target) l ++;
			if (nums[r] != target) r --;
		}

		if (l > r || nums[l] != target || nums[r] != target) return error;

		return new int[]{l, r};
	}
}
