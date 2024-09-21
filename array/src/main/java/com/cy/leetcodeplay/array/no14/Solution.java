package com.cy.leetcodeplay.array.no14;

/**
 * @Author: Lil-K
 * @Date: 2024/9/3
 * @Description: no.14. Longest Common Prefix
 * 公共前缀就意味着:
 *  1. 给出的字符串数组中, 一定会在最短的字符串中得到公共前缀
 */
public class Solution {

	public static void main(String[] args) {
		String a = "flower";
		System.out.println(a.indexOf("fl"));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0]; // 取第一个字符串作为初始前缀
		for (int i = 1; i < strs.length; i++) {
			/**
			 * 利用 indexOf() 判断 prefix 的前缀是否是 strs[i]
			 * 比如:
			 *  1. "flower".indexOf(flow) --> 0
			 *  2. "flower".indexOf(flight) --> -1
			 *  3. "flower".indexOf(f) --> 0
			 *
			 *  然后将 != 0 的字符串, 从最后往前挪, 直到 indexOf() == 0
			 */
			while (strs[i].indexOf(prefix) != 0) {
				// 如果当前前缀不是下一个字符串的前缀, 缩短前缀
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return ""; // 如果前缀缩短为空, 说明没有公共前缀
				}
			}
		}

		return prefix;
	}
}
