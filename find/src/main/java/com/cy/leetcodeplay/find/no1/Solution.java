package com.cy.leetcodeplay.find.no1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Lil-K
 * @Date: 2024/9/4
 * @Description:
 */
public class Solution {

	public int[] twoSum(int[] nums, int target) {
		if (nums.length < 1) return new int[]{};

		Map<Integer, Integer> res = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int j = target - nums[i];
			if (res.containsKey(j)) { // 这样写包括了有两个重复的元素 相加得到 target的情况
				return new int[]{res.get(j), i};
			} else {
				res.put(nums[i], i);
			}
		}

		return new int[]{};
	}
}
