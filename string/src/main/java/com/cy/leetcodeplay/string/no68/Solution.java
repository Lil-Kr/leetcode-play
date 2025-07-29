package com.cy.leetcodeplay.string.no68;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2025/7/29
 * @Description: no. 68. Text Justification
 * link: https://leetcode.com/problems/text-justification/description/
 */
public class Solution {

	public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> res = new ArrayList<>();

		for (int i = 0; i < words.length;) {
			int line = words[i].length();
			int j = i + 1;

			// 从第二个单词开始搜索, 判断在 maxWidth 范围内 还能容纳多少个单词
			while (j < words.length && line + (j - i) + words[j].length() <= maxWidth) {
				line += 1 + words[j].length();
				j++;
			}

			// 记录一个 maxWidth 长度中, 存储了几个word
			int wordCount = j - i;
			// 记录一个 maxWidth 长度中, 纯 words 的字符串长度
			int totalChars = 0;

			for (int k = i; k < j; k ++) {
				totalChars += words[k].length();
			}

			// 记录当前 maxWidth 中, 需要在中间补多少个空格, 这里需要平均分配
			int spaces = maxWidth - totalChars;
			StringBuilder sb = new StringBuilder();

			/**
			 * 两种情况:
			 * 1. 当 j 超出 words数组的边界, 说明整个words数组扫描完毕, 或者只有一个 word 时, 向左对齐
			 * 2. 中间行 → 需要均匀分配 spaces 个空格
			 */
			if (j == words.length || wordCount == 1) {
				for (int k = i; k < j; k ++) {
					sb.append(words[k]);
					if (k != j - 1) sb.append(" ");
				}

				// 补最后的空格
				while (sb.length() < maxWidth) sb.append(" ");
			} else {
				int spaceBetween = spaces / (wordCount - 1);
				// 前 extra 个间隙多一个空格
				int extra = spaces % (wordCount - 1);

				for (int k = i; k < j; k++) {
					sb.append(words[k]);
					if (k != j - 1) {
						int space = spaceBetween + (extra > 0 ? 1 : 0);
						extra--;
						for (int s = 0; s < space; s++) sb.append(" ");
					}
				}
			}
			res.add(sb.toString());
			i = j;
		}
		return res;
	}
}