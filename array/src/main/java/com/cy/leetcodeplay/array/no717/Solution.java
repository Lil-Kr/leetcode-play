package com.cy.leetcodeplay.array.no717;

/**
 * @Author: Lil-K
 * @Date: 2024/8/30
 * @Description:
 */
public class Solution {

	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		// 遍历数组直到倒数第二个元素
		while (i < bits.length - 1) {
			if (bits[i] == 1) {
				// 如果遇到1，跳过下一个元素（因为这是一个两位字符）
				i += 2;
			} else {
				// 如果遇到0, 继续向前
				i++;
			}
		}
		// 如果循环结束时指针指向最后一个元素，则返回true
		return i == bits.length - 1;
	}
}
