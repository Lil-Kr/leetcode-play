package com.cy.leetcodeplay.math.no7;

/**
 * @Author: Lil-K
 * @Date: 2024/10/22
 * @Description: no.7. Reverse Integer
 *
 * 1. 处理负数：如果 x 为负数, 反转时仍然保持负号.
 * 2. 通过余数与除法逐步构造反转后的数字：
 *    2.1 取出 x 的最后一位, 加入到结果中。
 *    2.2 然后更新 x 为去掉最后一位后的值（即 x / 10）。
 * 3. 检测溢出: 反转过程中, 注意检查是否会导致整数溢出。由于反转后的值可能超出 32 位的整数范围, 我们需要在每一步中检查结果是否会溢出。
 */
public class Solution {

	/**
	 * 正整数溢出: 最后一位 7 是边界
	 * 负整数溢出: 最后一位 8 是边界
	 * @param x
	 * @return
	 */
	public int reverse(int x) {
		int res = 0;

		while (x != 0) {
			// 取个位数
			int digit = x % 10;
			x /= 10;

			/**
			 * 检查是否溢出, 32 位整数范围 [-2^31, 2^31 - 1]
			 */
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)) {
				return 0;
			}

			if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && digit < -8)) {
				return 0;  // 负溢出
			}

			/**
			 * 更新结果
			 */
			res = res * 10 + digit;  // 更新结果
		}
		return res;
	}
}