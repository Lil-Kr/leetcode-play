package com.cy.leetcodeplay.array.no42;

/**
 * @Author: Lil-K
 * @Date: 2024/10/7
 * @Description: no.42. Trapping Rain Water
 */
public class Solution {

	/**
	 * 双指针
	 * @param height
	 * @return
	 */
	public int trap(int[] height) {
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
			} else {
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