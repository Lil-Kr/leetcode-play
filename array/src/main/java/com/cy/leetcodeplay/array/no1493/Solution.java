package com.cy.leetcodeplay.array.no1493;

/**
 * @Author: Lil-K
 * @Date: 2025/9/1
 * @Description: no.1493. Longest Subarray of 1's After Deleting One Element
 * link: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
 *
 * todo: 未录入Anki
 * Sliding Window
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public int longestSubarray(int[] nums) {
		int n = nums.length;
		int l = 0, r = 0, k = 1;
		while (r < n) {
			if (nums[r] == 0) {
				k --;
			}

			// have 2 [0], move l pointer
			if (k < 0) {
				if (nums[l] == 0) {
					k ++;
				}
				l ++;
			}

			r ++;
		}
		return r - l - 1;
	}
}