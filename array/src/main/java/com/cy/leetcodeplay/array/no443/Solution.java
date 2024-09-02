package com.cy.leetcodeplay.array.no443;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/9/1
 * @Description:
 */
public class Solution {

	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(2);

		int sum = ar.stream().mapToInt((item) -> item).sum();
		System.out.println(sum);
	}

	public int compress(char[] chars) {
		if (chars.length <= 1) return chars.length;

		/**
		 * write:
		 * anchor: 连续字符数组的起始位置
		 */
		int write = 0, anchor = 0;

		for (int i = 0; i < chars.length; i++) {
			/**
			 * read + 1 == chars.length, 说明 chars[i] 已经是最后一个元素了
			 */
			if (i + 1 == chars.length || chars[i] != chars[i + 1]) {
				/**
				 * 更新数组: chars[a, 3, b, 2]
				 * 后一个子数组的开头要更新到write, 然后 从 write+1 的位置开始填数字
				 */
				chars[write] = chars[anchor];
				write++;

				/**
				 * 判断连续的字符串长度是否大于1
				 */
				if (i > anchor) {
					int count = i - anchor + 1;
					for (char c : Integer.toString(count).toCharArray()) {
						chars[write] = c;
						write++;
					}
				}
				anchor = i + 1;
			}
		}
		return write;
	}
}
