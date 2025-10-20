package com.cy.leetcodeplay.dpmaxsubarraysum.interview.no05;

/**
 * @Author: Lil-K
 * @Date: 2025/10/20
 * @Description:
 * 题目: 可以反转1次的情况下子数组最大累加和
 *  给定一个数组nums, 现在允许你随意选择数组连续一段进行翻转, 也就是子数组逆序的调整, 比如翻转[1, 2, 3, 4, 5, 6] 的 [2 ~ 4]范围
 *  得到的是 [1,2,5,4,3,6], 返回必须随意翻转1次之后, 子数组的最大累加和
 *
 * todo: 未录入Anki
 */
public class Solution {

	/**
	 * solution1:
	 * @param nums
	 * @return
	 */
	public int maxSumReverse(int[] nums) {
		int n = nums.length;

		/**
		 * start[i]: 所有必须以 i 开头的子数组中, 最大累加和是多少
		 */
		int[] start = new int[n];
		start[n - 1] = nums[n - 1];
		for (int i = n - 2; i >= 0; i --) {
			start[i] = Math.max(nums[i], nums[i] + start[i + 1]);
		}
		int ans = start[0];

		// end: 子数组必须以 i 结尾, 其中的最大累加和
		int end = nums[0];
		/**
		 * maxEnd: [0 ... i-1] 范围上, 以每一个数为结尾, 其中的最大累加和
		 * 枚举所有情况中, 最大的累加和就是 maxEnd
		 */
		int maxEnd = nums[0];
		for (int i = 1; i < n; i ++) {
			ans = Math.max(ans, maxEnd + start[i]);
			end = Math.max(nums[i], nums[i] + end);
			maxEnd = Math.max(maxEnd, end);
		}
		// 答案有可能不需要翻转就能得到
		ans = Math.max(ans, maxEnd);
		return ans;
	}
}