package com.cy.leetcodeplay.array.no3;

/**
 * @Author: Lil-K
 * @Date: 2024/4/12
 * @Description: no.3. Longest Substring Without Repeating Characters
 * 题目: 在一个字符串中寻找没有重复字母的最长子串
 */
public class Solution {

    /**
     * 只有字符集? 只有字母? 是否考虑大小写? 数字 + 字母?  ASCII?
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256]; // 记录频率
        int l = 0, r = -1; // window area s[l ... r]
        int res = 0; // 记录最长的字串长度

        while (l < s.length()) {
            if (r+1 < s.length() && freq[s.charAt(r+1)] == 0) { // 右边界的字符如果没有出现过, 说明不重复
                freq[s.charAt(++r)] ++;
            } else { // 否则不停地缩小左边界
                freq[s.charAt(l++)] --;
            }

            // 取最大长度值
            res = Math.max(res, r - l + 1);
        }

        return res == 0 ? 0 : res;
    }

}