package com.cy.leetcodeplay.array.no1004;

/**
 * @Author: Lil-K
 * @Date: 2025/9/1
 * @Description: no.1004. Max Consecutive Ones III
 * link: https://leetcode.com/problems/max-consecutive-ones-iii/description/
 *
 * todo: 未录入题库
 * Sliding Window
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public int longestOnes(int[] nums, int k) {
		int n = nums.length;
		int l = 0, r = 0;

		while (r < n) {
			if (nums[r] == 0) {
				k --;
			}

			if (k < 0) {
				if (nums[l] == 0) {
					k ++;
				}
				l++;
			}
			r ++;
		}
		return r - l;
	}
}