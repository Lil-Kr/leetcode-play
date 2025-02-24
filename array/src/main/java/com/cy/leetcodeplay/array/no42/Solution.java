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
	 * 解法一: 双指针
	 * @param height
	 * @return
	 */
	public int trap(int[] height) {
		if (height == null || height.length == 0) return 0;

		int left = 0, right = height.length - 1;
		int leftMax = height[left], rightMax = height[right];
		int water = 0;

		while (left < right) {
			if (height[left] < height[right]) {
				left++; // 移动左指针
				leftMax = Math.max(leftMax, height[left]); // 更新左边最大高度
				water += leftMax - height[left]; // 计算当前柱子能接住的雨水量
			} else {
				right--; // 移动右指针
				rightMax = Math.max(rightMax, height[right]); // 更新右边最大高度
				water += rightMax - height[right]; // 计算当前柱子能接住的雨水量
			}
		}
		return water;
	}

	/**
	 * 双指针
	 * @param height
	 * @return
	 */
	public int trap2(int[] height) {
		if (height == null || height.length == 0) return 0;

		int left = 0, right = height.length - 1;
		int leftMax = 0, rightMax = 0;
		int waterTrapped = 0;

		while (left < right) {
			if (height[left] < height[right]) {
				if (height[left] >= leftMax) {
					leftMax = height[left]; // 更新左侧最大高度
				} else {
					waterTrapped += leftMax - height[left]; // 计算当前能接住的水
				}
				left++;
			} else { // height[left] >= height[right]
				if (height[right] >= rightMax) {
					rightMax = height[right]; // 更新右侧最大高度
				} else {
					waterTrapped += rightMax - height[right]; // 计算当前能接住的水
				}
				right--;
			}
		}

		return waterTrapped; // 返回总接水量
	}
}