package com.cy.leetcodeplay.array.no274;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/10/23
 * @Description: no.274. H-Index
 */
public class Solution {

	/**
	 *
	 * @param citations
	 * @return
	 */
	public int hIndex(int[] citations) {
		// 先将引用次数排序
		Arrays.sort(citations);

		int n = citations.length;
		// 遍历数组
		for (int i = 0; i < n; i++) {
			// 如果满足 H 指数条件，返回 H 指数
			if (citations[i] >= n - i) {
				return n - i;
			}
		}

		return 0;  // 如果没有找到满足条件的 H 指数，返回 0
	}
}
