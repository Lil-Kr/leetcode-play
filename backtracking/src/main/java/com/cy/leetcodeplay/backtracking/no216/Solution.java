package com.cy.leetcodeplay.backtracking.no216;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/26
 * @Description: no.216. Combination Sum III
 */
public class Solution {

	private List<List<Integer>> res = new ArrayList<>();
	/**
	 *
	 * @param k
	 * @param n
	 * @return
	 */
	public List<List<Integer>> combinationSum3(int k, int n) {
		backtrack(k, n, 1, new ArrayList<>());
		return res;
	}

	private void backtrack(int k, int n, int start, List<Integer> curList) {
		if (curList.size() == k && n == 0) {
			res.add(new ArrayList<>(curList));
			return;
		}

		if (curList.size() >= k || n < 0) return;

		for (int i = start; i <= 9; i++) {
			curList.add(i);

			backtrack(k, n - i, i + 1, curList);

			curList.remove(curList.size() - 1);
		}
	}
}