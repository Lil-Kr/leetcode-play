package com.cy.leetcodeplay.greedy.no455;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: Lil-K
 * @Date: 2025/4/7
 * @Description: 455. Assign Cookies
 * link: https://leetcode.com/problems/assign-cookies/description/
 */
public class Solution {

	/**
	 *
	 * @param g 待分配的小孩子
	 * @param s 饼干数
	 * @return
	 */
	public int findContentChildren(int[] g, int[] s) {
		Integer[] gArr = Arrays.stream(g).boxed().toArray(Integer[]::new);
		Integer[] sArr = Arrays.stream(s).boxed().toArray(Integer[]::new);
		Arrays.sort(gArr, Collections.reverseOrder());
		Arrays.sort(sArr, Collections.reverseOrder());
		int gidx = 0, sidx = 0;
		int res = 0;
		while (gidx < gArr.length && sidx < sArr.length) {
			if (sArr[sidx] >= gArr[gidx]) {
				gidx ++;
				sidx ++;
				res ++;
			} else {
				gidx++;
			}
		}
		return res;
	}

	/**
	 *
	 * @param g
	 * @param s
	 * @return
	 */
	public int findContentChildren2(int[] g, int[] s) {
		Arrays.sort(g); // 小胃口的孩子在前
		Arrays.sort(s); // 小尺寸的饼干在前
		int gi = 0, si = 0;

		while (gi < g.length && si < s.length) {
			if (s[si] >= g[gi]) {
				gi++; // 满足了一个孩子
			}
			si++; // 每次都要尝试用下一个饼干
		}
		return gi;
	}
}
