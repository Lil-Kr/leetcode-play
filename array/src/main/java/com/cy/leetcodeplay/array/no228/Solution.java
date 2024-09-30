package com.cy.leetcodeplay.array.no228;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/9/30
 * @Description: no.228. Summary Ranges
 */
public class Solution {

	/**
	 *
	 * @param nums
	 * @return
	 */
	public List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<>();
		if (nums.length < 1) return res;

		int start = 0, n = nums.length;
		for (int i = 1; i < n; i++) {
			if (Math.abs(nums[i - 1] - nums[i]) == 1) {
				continue;
			}

			if (i - start == 1) {
				res.add(String.valueOf(nums[start]));
			} else {
				res.add(nums[start] + "->" + nums[i - 1]);
			}
			start = i;
		}

		if (start == n - 1) {
			res.add(String.valueOf(nums[start]));
		} else {
			res.add(nums[start] + "->" + nums[n - 1]);
		}
		return res;
	}
}