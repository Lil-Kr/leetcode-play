package com.cy.leetcodeplay.array.no67;

/**
 * @Author: Lil-K
 * @Date: 2024/9/2
 * @Description: no.67. Add Binary
 */
public class Solution {

	/**
	 * 算上前一位进位, 后一位也需要进位的情况: 1110 + 1111, 单位数字最多为3
	 * 取余操作表示当前为的数字:
	 * 0 % 2 = 0;
	 * 1 % 2 = 1;
	 * 2 % 2 = 0;
	 *
	 * 进位操作:
	 * 1. 通过除法得到是否需要进位, 并且记录进位数 1,  --> sum / 2
	 * 2. 用前一次遗留下来的进位数字带入下一轮相加
	 * @param a
	 * @param b
	 * @return
	 */
	public String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();

		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0; // 记录是否需要进位

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += a.charAt(i) - '0';  // 将字符转为整数
				i--;
			}
			if (j >= 0) {
				sum += b.charAt(j) - '0';  // 将字符转为整数
				j--;
			}

			result.append(sum % 2);  // 当前位的结果（0或1）
			carry = sum / 2;  // 更新进位（0或1）
		}

		if (carry != 0) {
			result.append(carry);  // 如果有进位, 添加到结果中
		}

		return result.reverse().toString();  // 反转并返回结果
	}

}
