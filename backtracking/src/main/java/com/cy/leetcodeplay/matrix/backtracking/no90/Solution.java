package com.cy.leetcodeplay.matrix.backtracking.no90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/26
 * @Description: no.90. Subsets II
 * todo: 未录入题库
 */
public class Solution {

	private  List<List<Integer>> res = new ArrayList<>();

	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums); // 排序, 便于去重
		backtrack(nums, 0, new ArrayList<>());
		return res;
	}

	private void backtrack(int[] nums, int start, List<Integer> curList) {
		res.add(new ArrayList<>(curList)); // 添加当前子集

		for (int i = start; i < nums.length; i++) {
			// 如果当前数字和前一个数字相同且前一个未被选择, 跳过以避免重复
			if (i > start && nums[i] == nums[i - 1]) continue;

			curList.add(nums[i]); // 选择当前数字
			backtrack(nums, i + 1, curList); // 递归
			curList.remove(curList.size() - 1); // 回溯, 移除当前数字
		}
	}
}