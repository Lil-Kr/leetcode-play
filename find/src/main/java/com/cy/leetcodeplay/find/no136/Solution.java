package com.cy.leetcodeplay.find.no136;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/5
 * @Description: no.136. Single Number
 */
public class Solution {

	/**
	 * 解法一: map 和 set
	 * 空间复杂度都是 O(n)
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums) {
		if (nums.length < 2) {
			return nums[0];
		}
		Map<Integer, Integer> map = new HashMap<>();

		// 记录每个数字的出现次数
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		// 查找出现一次的数字
		for (int num : nums) {
			if (map.get(num) == 1) {
				return num;
			}
		}
		return -1;
	}


	/**
	 * 解法二: 位操作, 性能最好
	 *
	 * 复杂度是 O(n)
	 * 空间复杂度为 O(1)
	 * @param nums
	 * @return
	 */
	public int singleNumber2(int[] nums) {
		int result = 0;
		// 将数组中的所有元素进行异或操作
		for (int num : nums) {
			result ^= num;
		}
		return result;
	}
}
