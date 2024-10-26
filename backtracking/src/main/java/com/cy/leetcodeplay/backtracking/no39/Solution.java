package com.cy.leetcodeplay.backtracking.no39;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/26
 * @Description: no.39. Combination Sum
 * 
 * 递归和回溯:
 *    1. 使用递归来遍历所有组合, 尝试将当前数字多次加入组合中, 直到达到目标或超出目标
 * 剪枝优化:
 *    1. 如果当前组合的和超过 target, 则停止递归
 * 去重:
 *    1. 在递归中设定每层的起始位置, 防止重复计算相同组合
 */
public class Solution {

	private List<List<Integer>> res = new ArrayList<>();

	/**
	 *
	 * @param candidates
	 * @param target
	 * @return
	 */
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		backtrack(candidates, target, 0, new ArrayList<>());
		return res;
	}

	private void backtrack(int[] candidates, int target, int start, List<Integer> curList) {
		if (target == 0) { // 找到满足条件的组合
			res.add(new ArrayList<>(curList));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if (candidates[i] > target) { // 剪枝, 避免重复递归
				continue;
			}

			curList.add(candidates[i]);
			/**
			 * 可重复使用同一元素, 传入i
			 */
			backtrack(candidates, target - candidates[i], i, curList);
			/**
			 * 回溯
			 */
			curList.remove(curList.size() - 1);
		}
	}
}