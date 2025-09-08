package com.cy.leetcodeplay.array.no1679;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2025/8/26
 * @Description: 1679. Max Number of K-Sum Pairs
 * https://leetcode.com/problems/max-number-of-k-sum-pairs/
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public int maxOperations(int[] nums, int k) {
		int n = nums.length;
		int l = 0, r = n - 1;
		int res = 0;
		Arrays.sort(nums);
		while (l < r) {
			if (nums[l] + nums[r] == k) {
				res ++;
				l ++;
				r --;
			} else if (nums[l] + nums[r] < k) {
				l++;
			} else {
				r--;
			}
		}
		return res;
	}
}
