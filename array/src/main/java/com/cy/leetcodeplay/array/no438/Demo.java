package com.cy.leetcodeplay.array.no438;

import com.alibaba.fastjson2.JSONArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/4/16
 * @Description:
 */
public class Demo {

  public static void main(String[] args) {
    String s = "cbeabaabacd", p = "abc";

    List<Integer> anagrams = findAnagrams(s, p);
    System.out.println(JSONArray.toJSONString(anagrams));
  }

  /**
   *
   * @param s
   * @param p
   * @return
   */
  public static List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new ArrayList<>();
    if (s.isEmpty() || p.isEmpty()) {
      return res;
    }

    if (s.length() < p.length()) {
      return res;
    }

    int[] freqS = new int[26];
    int[] freqP = new int[26];

    for (int i = 0; i < p.length(); i++) {
      freqP[p.charAt(i) - 'a']++;
      freqS[s.charAt(i) - 'a']++;
    }

    if (Arrays.equals(freqS, freqP)) {
      res.add(0);
    }

    int l = 0, r = p.length();

    while (r < s.length()) {
      freqS[s.charAt(l) - 'a']--;
      freqS[s.charAt(r) - 'a']++;

      if (Arrays.equals(freqS, freqP)) {
        res.add(l + 1);
      }
      l++;
      r++;
    }
    return res;
  }

}
