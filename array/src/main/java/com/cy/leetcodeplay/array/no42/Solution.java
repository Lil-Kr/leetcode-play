package com.cy.leetcodeplay.array.no42;

/**
 * @Author: Lil-K
 * @Date: 2024/10/7
 * @Description: no.42. Trapping Rain Water
 * link: https://leetcode.com/problems/trapping-rain-water/description/
 *
 * 解题思路:
 *  一个柱子能够接多少雨水, 取决于它左右两侧的最大高度的较小值.
 *  假设 height[i] 代表第 i 根柱子的高度, 那么它上方可以接的雨水量计算方式如下
 *    water[i]=max(min(leftMax[i],rightMax[i]) − height[i],0)
 *  其中：
 *    leftMax[i] 代表 i 左边最高的柱子高度 (包括 i 自己)
 *    rightMax[i] 代表 i 右边最高的柱子高度 (包括 i 自己)
 */
public class Solution {

	/**
	 * solution1:
	 * @param height
	 * @return
	 */
	public int trap(int[] height) {
		int n = height.length;
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		lmax[0] = height[0];
		for (int i = 1; i < n; i ++) {
			lmax[i] = Math.max(lmax[i - 1], height[i]);
		}

		rmax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i --) {
			rmax[i] = Math.max(rmax[i + 1], height[i]);
		}

		int ans = 0;
		for (int i = 1; i < n - 1; i ++) {
			ans += Math.max(0, Math.min(lmax[i - 1], rmax[i + 1]) - height[i]);
		}
		return ans;
	}

	/**
	 * solution2: tow point
	 * @param height
	 * @return
	 */
	public int trap2(int[] height) {
		int n = height.length;
		if (height == null || n == 0 || n == 1 || n == 2) return 0;
		int l = 1, r = n - 2, lmax = height[0], rmax = height[n - 1];
		int water = 0;
		while (l <= r) {
			if (lmax >= rmax) {
				water += Math.max(0, rmax - height[r]);
				rmax = Math.max(rmax, height[r --]);
			} else {
				water += Math.max(0, lmax - height[l]);
				lmax = Math.max(lmax, height[l ++]);
			}
		}
		return water;
	}
}