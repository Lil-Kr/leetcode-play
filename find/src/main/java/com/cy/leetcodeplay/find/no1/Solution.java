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

		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int j = target - nums[i];
			map.put(j, i);
			if (map.getOrDefault(j, 0) + nums[i] == target) {
				res[0] = map.get(j);
				res[1] = i;
			}
		}

		return res;
	}
}
