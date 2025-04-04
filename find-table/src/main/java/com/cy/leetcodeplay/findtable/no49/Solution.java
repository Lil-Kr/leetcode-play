package com.cy.leetcodeplay.findtable.no49;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2024/9/6
 * @Description: no.49. Group Anagrams
 * link: https://leetcode.com/problems/group-anagrams/description/
 *
 * 思路:
 *  1. 为每个字符串中的字符排序
 *  2. 把相同顺序的字符串作为key存入Map, value存入对应的原始字符串
 *  3. 输出 map的所有values
 */
public class Solution {

	/**
	 * 不要求返回的顺序
	 * @param strs
	 * @return
	 */
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length < 1) return new ArrayList<>();

		Map<String, List<String>> res = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] charArray = strs[i].toCharArray();
			Arrays.sort(charArray);
			String key = String.valueOf(charArray);
			/**
			 * 这里比较重要, 之前put过的key就不会再记录
			 */
			res.putIfAbsent(key, new ArrayList<>());
			res.get(key).add(strs[i]);
		}

		return new ArrayList<>(res.values());
	}


}