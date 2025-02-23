package com.cy.leetcodeplay.array.no791;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Lil-K
 * @Date: 2024/9/2
 * @Description: no.791. Custom Sort String
 * link: https://leetcode.com/problems/custom-sort-string/description/
 */
public class Solution {


	/**
	 * 解法一: 效率最高
	 * @param order 不重复
	 * @param s 可重复
	 * @return
	 */
	public String customSortString(String order, String s) {
		// 创建一个数组记录字符的出现次数
		int[] freqS = new int[26];

		// 统计 s 中每个字符的出现次数
		for (char c : s.toCharArray()) {
			freqS[c - 'a']++;
		}

		StringBuilder result = new StringBuilder();

		// 按照 order 中的顺序将字符添加到结果中
		for (char c : order.toCharArray()) {
			while (freqS[c - 'a'] > 0) {
				result.append(c);
				/**
				 * 这个操作是关键，它保证了在最后构建结果字符串时，
				 * 每个字符只被添加到 res 中正确的次数。如果不减少频率计数，那么相同的字符可能会被重复添加到 res 中，导致结果错误。
				 * 原因: order中的字符串是唯一的, 所以要把s中的相同的元素全部移除
				 */
				freqS[c - 'a']--;
			}
		}

		/**
		 * 添加 s 中 order 未出现的字符
		 */
		for (char c = 'a'; c <= 'z'; c++) {
			while (freqS[c - 'a'] > 0) {
				result.append(c);
				freqS[c - 'a']--;
			}
		}

		return result.toString();
	}

	/**
	 * 解法二
	 * @param order
	 * @param s
	 * @return
	 */
	public String customSortString2(String order, String s) {

		Map<Character, Integer> freqS = new TreeMap<>();

		for (int i = 0; i < s.length(); i++) {
			freqS.put(s.charAt(i), freqS.getOrDefault(s.charAt(i), 0) + 1);
		}

		StringBuilder res = new StringBuilder();
		for (int i = 0; i < order.length(); i++) {
			while (freqS.getOrDefault(order.charAt(i), 0) > 0) {
				res.append(order.charAt(i));
				freqS.put(order.charAt(i), freqS.get(order.charAt(i)) - 1);
			}
		}

		for (char i = 'a'; i <= 'z'; i++) {
			while (freqS.getOrDefault(i, 0) > 0) {
				res.append(i);
				freqS.put(i, freqS.get(i) - 1);
			}
		}

		return res.toString();
	}

	/**
	 * 解法二优化
	 * @param order
	 * @param s
	 * @return
	 */
	public String customSortString3(String order, String s) {

		Map<Character, Integer> freqS = new TreeMap<>();

		for (int i = 0; i < s.length(); i++) {
			freqS.put(s.charAt(i), freqS.getOrDefault(s.charAt(i), 0) + 1);
		}

		StringBuilder res = new StringBuilder();
		for (int i = 0; i < order.length(); i++) {
			char c = order.charAt(i);
			Integer count = freqS.getOrDefault(c, 0);

			while (count > 0) {
				res.append(c);
				count--;
			}
			freqS.remove(c);
		}

		for (Character c : freqS.keySet()) {
			int count = freqS.getOrDefault(c, 0);
			while (count > 0) {
				res.append(c);
				count--;
			}
		}

		return res.toString();
	}
}
