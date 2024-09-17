package com.cy.leetcodeplay.array.no76;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Lil-K
 * @Date: 2024/4/13
 * @Description: no.76. Minimum Window Substring
 *
 * Given two strings s and t of lengths m and n respectively, return the minimum window
 * substring
 *  of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 * 思考过程:
 */
public class Solution {

  /**
   * 解法一
   * @param s
   * @param t
   * @return
   */
  public String minWindow(String s, String t) {
    if (s.length() < t.length()) {
      return "";
    }

    /**
     * 定义 模板 t 字符串中字母出现的频率
     */
    Map<Character, Integer> freqT = new TreeMap<>();
    char[] charArray = t.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      Integer freqCount = freqT.getOrDefault(charArray[i], 0);
      freqT.put(charArray[i], freqCount + 1);
    }
    // 获取 t 中有多少种字符
    int freqTSize = freqT.size();

    // 定义滑动窗口的左右边界
    int l = 0, r = 0;

    // 定义滑动窗口内的字符出现的频率
    Map<Character, Integer> slideWindowCount = new TreeMap<>();

    /**
     * 定义记录符合题意规则的标志,
     * 比如: t: "ABB", freqT: [A -> 1, B -> 2] --> ruleCount: 2, 意味着freqT中有2种元素, B是重复
     */
    int ruleCount = 0;

    // 定义记录符合条件字符串的索引
    int l2 = -1, r2 = -1, minLength = -1;

    while (r < s.length()) {
      char c = s.charAt(r);
      slideWindowCount.put(c, slideWindowCount.getOrDefault(c, 0) + 1);

      /**
       * 当前r的位置的字符在 freqT 出现过
       * 并且: 与freqT中出现的频率一致, 则记录下符合题意的规则
       * 以下写法包括了 t 中 包含重复字符的情况
       */
      if (freqT.containsKey(c) && freqT.get(c).intValue() == slideWindowCount.get(c).intValue()) {
        ruleCount++;
      }

      /**
       * 当 [l ... r]之间的字符种类 与 freqT 中的一致时, 才对 [l ... r] 范围内的字符遍历
       * 循环遍历 [l ... r] 之间的字符, 看是否还有 与 t 中的字符
       * l <= r 这个条件必须加上
       */
      while (l <= r && freqTSize == ruleCount) {
        c = s.charAt(l);

        /**
         * this if() judgment is record min length, then change l2 and r2
         */
        if (minLength == -1 || r - l + 1 < minLength) {
          minLength = r - l + 1;
          l2 = l;
          r2 = r;
        }

        /**
         * 这里即将要移除 l 位置的元素, 让 l 位置的元素频率 - 1, 做复位
         */
        slideWindowCount.put(c, slideWindowCount.get(c) - 1);

        /**
         * remove l info, if s.charAt(l) not include t, so freqCount can`t change
         */
        if (freqT.containsKey(c) && slideWindowCount.get(c).intValue() < freqT.get(c).intValue()) {
          ruleCount --;
        }
        l++;
      }
      r++;
    }

//    if (l2 == -1 && r2 == -1) {
//      return "";
//    }else {
//      return s.substring(l2, r2+1);
//    }
    return minLength == -1 ? "" : s.substring(l2, r2 + 1);
  }
}
