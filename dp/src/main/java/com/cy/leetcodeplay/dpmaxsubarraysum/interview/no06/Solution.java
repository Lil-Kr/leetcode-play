package com.cy.leetcodeplay.dpmaxsubarraysum.interview.no06;

/**
 * @Author: Lil-K
 * @Date: 2025/10/20
 * @Description:
 * 题目:
 *  删掉1个数字后长度为k的子数组最大累加和
 *  给定要给数组nums, 求必须删除一个数字后的新数组中, 长度为k的子数组最大累加和
 *  删除哪个数字随意
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param nums
	 * @return
	 */
	public int maxSum(int[] nums, int k) {
		int n = nums.length;
		if (n <= k) return 0;

		// 单调队列
		int[] window = new int[n];
		int l = 0, r = 0;
		long sum = 0;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; i ++) {
			while (l < r && nums[window[r - 1]] >= nums[i]) {
				r --;
			}
			window[r ++] = i;
			sum += nums[i];
			if (i >= k) {
				ans = Math.max(ans, (int)(sum - nums[window[l]]));
				if (window[l] == i - k) {
					l ++;
				}
				sum -= nums[i - k];
			}
		}
		return ans;
	}
}