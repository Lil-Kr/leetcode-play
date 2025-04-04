package com.cy.leetcodeplay.findtable.no13;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/29
 * @Description: no.13. Roman to Integer
 *
 * 罗马数字是从左到右排列的, 通常是从大到小.
 * 当小的数字在大的数字的左边时（例如 IV）, 表示减去小的数字（5 - 1 = 4）.
 * 当小的数字在大的数字的右边时（例如 VI）, 表示加上小的数字（5 + 1 = 6）.
 */
public class Solution {

	/**
	 *
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		Map<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int total = 0;
		int prevValue = 0;

		// 从右向左遍历罗马数字字符串
		for (int i = s.length() - 1; i >= 0; i--) {
			char currentChar = s.charAt(i);
			int currentValue = romanMap.get(currentChar);

			// 如果当前值小于之前的值, 表示要减去
			if (currentValue < prevValue) {
				total -= currentValue;
			} else {
				total += currentValue;
			}

			// 更新之前的值
			prevValue = currentValue;
		}

		return total;
	}
}