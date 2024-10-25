package com.cy.leetcodeplay.backtracking.no77;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/25
 * @Description: no.77. Combinations
 */
public class Solution {

	private List<List<Integer>> res = new ArrayList<>();

	/**
	 * 回溯
	 * @param n
	 * @param k
	 * @return
	 */
	public List<List<Integer>> combine(int n, int k) {
//		backtrack(n, k, 1, new ArrayList<>());
		backtrack2(n, k, 1, new ArrayList<>());

		return res;
	}

	private void backtrack(int n, int k, int start, List<Integer> curList) {
		if (curList.size() == k) {
			res.add(new ArrayList<>(curList));
			return;
		}

		/**
		 * 选择每个数字, 从start开始到 n, 并依次递归选择后续元素
		 */
		for (int i = start; i <= n; i++) {
			/**
			 * 选择当前数字
			 */
			curList.add(i);

			/**
			 * 递归选择后续
			 */
			backtrack(n, k,i + 1, curList);

			/**
			 * 回溯, 移除当前数字
			 */
			curList.remove(curList.size() - 1);
		}
	}

	/** ==================== 优化 ====================
	 * 回溯法的剪枝优化:
	 *  当 k 比较大时, 可以很大程度优化效率
	 *  剪枝是为了减少不必要的递归
	 *  在生成组合的过程中，如果知道剩下的元素已经不足以构成完整的组合，就可以直接结束当前递归，避免不必要的回溯。剪枝可以通过减少循环次数来节省计算量。
	 * **/
	private void backtrack2(int n, int k, int start, List<Integer> curList) {
		if (curList.size() == k) {
			res.add(new ArrayList<>(curList));
			return;
		}

		/**
		 * 当前还有 k - curList.size() 个元素需要填补, 所以 [i ... n] 中至少要有 k - curList.size() 个元素
		 * i 最多为: n - (k - curList.size()) + 1
		 */
		for (int i = start; i <= n - (k - curList.size()) + 1; i++) {
			/**
			 * 选择当前数字
			 */
			curList.add(i);

			/**
			 * 递归选择后续
			 */
			backtrack2(n, k,i + 1, curList);

			/**
			 * 回溯, 移除当前数字
			 */
			curList.remove(curList.size() - 1);
		}
	}



}