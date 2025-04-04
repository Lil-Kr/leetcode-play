package com.cy.leetcodeplay.backtracking.no46;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/24
 * @Description: no.46. Permutations
 *
 * 这道题相当于求一个数组的全排列:
 *  1.
 */
public class Solution {
	
	private List<List<Integer>> res = new ArrayList<>();

	/**
	 *
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> permute(int[] nums) {
		boolean[] sign = new boolean[nums.length];
		backtrack(new ArrayList<>(), nums, sign);
		return res;
	}

	/**
	 * 求全排列
	 * @param current
	 * @param nums
	 * @param sign
	 */
	private void backtrack(List<Integer> current, int[] nums, boolean[] sign) {
		if (current.size() == nums.length) {
			res.add(new ArrayList<>(current));  // 当前排列已经构建完成, 加入结果集
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			// 如果当前数字已经被使用, 跳过
			if (sign[i]) continue;
			// 标记当前数字已使用
			sign[i] = true;

			// 将当前数字加入排列
			current.add(nums[i]);
			// 递归处理下一个数字
			backtrack(current, nums, sign);

			/**
			 * 回溯, 移除最后一个加入的数字
			 * 取消标记当前数字为已使用
			 */
			current.remove(current.size() - 1);
			sign[i] = false;
		}
	}
}