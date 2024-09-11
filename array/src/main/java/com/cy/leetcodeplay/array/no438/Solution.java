package com.cy.leetcodeplay.array.no438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/4/12
 * @Description: no.438. Find All Anagrams in a String
 */
public class Solution {

  /**
   *
   * @param s
   * @param p
   * @return
   */
  public static List<Integer> findAnagrams(String s, String p) {
    List<Integer> resList = new ArrayList<>();
    if (s.length() < p.length()) {
      return resList;
    }

    int[] freqS = new int[26];
    int[] freqP = new int[26];

    for (int i = 0; i < p.length(); i++) {
      freqS[s.charAt(i) - 'a']++;
      freqP[p.charAt(i) - 'a']++;
    }

    if (Arrays.equals(freqS, freqP)) {
      resList.add(0);
    }

    int l = 0, r = p.length();

    while (r < s.length()) { // r < s.length() 表示 判断的长度为p的长度, r == s.length() - 1 就已经完成比较了
      freqS[s.charAt(l) - 'a']--;
      freqS[s.charAt(r) - 'a']++;

      if (Arrays.equals(freqS, freqP)) {
        resList.add(l + 1);
      }
      l++;
      r++;
    }

    return resList;
  }

}
