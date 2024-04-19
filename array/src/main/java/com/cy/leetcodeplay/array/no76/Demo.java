package com.cy.leetcodeplay.array.no76;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Lil-K
 * @Date: 2024/4/15
 * @Description:
 */
public class Demo {

  /**
   *
   * @param s
   * @param t
   * @return
   */
  public static String minWindow(String s, String t) {
    if (s.isEmpty() || t.isEmpty()) {
      return "";
    }
    if (s.length() < t. length()) {
      return "";
    }

    Map<Character, Integer> freqT = new TreeMap<>();

    for (int i = 0; i < t.length(); i++) {
      freqT.put(t.charAt(i), freqT.getOrDefault(t.charAt(i), 0) + 1);
    }

    // slid window range [l ... r]
    int l = 0, r = 0;

    // record minmum length
    int l2 = -1, r2 = -1, freqCount = 0, freqSize = freqT.size(), minmum = -1;

    Map<Character, Integer> freqWindow = new TreeMap<>();

    while (r < s.length()) {
      char c = s.charAt(r);
      freqWindow.put(c, freqWindow.getOrDefault(c, 0) + 1);

      // find match t string char
      if (freqT.containsKey(c) && freqWindow.get(c).intValue() == freqT.get(c).intValue()) {
        freqCount++;
      }

      // shrink window left range
      while (l <= r && freqCount == freqSize) {
        c = s.charAt(l);

        // record minmum length
        if (minmum == -1 || r - l + 1 < minmum) {
          minmum = r - l + 1;
          l2 = l;
          r2 = r;
        }

        // reset will remove l index char
        freqWindow.put(c, freqWindow.get(c) - 1);

        if (freqT.containsKey(c) && freqWindow.get(c).intValue() < freqT.get(c).intValue()) {
          freqCount--;
        }
        l++;
      }
      r++;
    }

    if (l2 == -1 && r2 == -1) {
      return "";
    } else {
      return s.substring(l2, r2+1);
    }
  }

}
