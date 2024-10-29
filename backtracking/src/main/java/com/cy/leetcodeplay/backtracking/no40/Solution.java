package com.cy.leetcodeplay.backtracking.no40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/26
 * @Description: no.40. Combination Sum II
 * todo: 未录入题库
 */
public class Solution {

	private List<List<Integer>> res = new ArrayList<>();

	/**
	 *
	 * @param candidates
	 * @param target
	 * @return
	 */
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		backtrack(candidates, target, 0, new ArrayList<>());
		return res;
	}

	/**
	 * [1,1,2,5,6,7,10]
	 * @param candidates
	 * @param target
	 * @param start
	 * @param curList
	 */
	private void backtrack(int[] candidates, int target, int start, List<Integer> curList) {
		if (target == 0) {
			res.add(new ArrayList<>(curList));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			/**
			 * 去重
			 */
			if (i > start && candidates[i] == candidates[i - 1]) continue;

			/**
			 * 剪枝
			 */
			if (candidates[i] > target) continue;

			curList.add(candidates[i]);

			backtrack(candidates, target - candidates[i], i + 1, curList);

			/**
			 * 回溯
			 */
			curList.remove(curList.size() - 1);
		}
	}
}
