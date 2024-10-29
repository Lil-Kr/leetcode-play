package com.cy.leetcodeplay.backtracking.no78;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/26
 * @Description: no.78. Subsets
 * todo: 未录入题库
 *
 * 求一个数组的所有子集: [1,2]
 * 得到: [], [1], [1,2], [2]
 */
public class Solution {

	private List<List<Integer>> res = new ArrayList<>();

	/**
	 *
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> subsets(int[] nums) {
		backtrack(nums, 0, new ArrayList<>());
		return res;
	}

	private void backtrack(int[] nums, int start, List<Integer> curList) {
		res.add(new ArrayList<>(curList));

		for (int i = start; i < nums.length; i++) {
			curList.add(nums[i]);

			backtrack(nums, i + 1, curList);

			curList.remove(curList.size() - 1);
		}
	}

}