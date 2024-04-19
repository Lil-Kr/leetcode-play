package com.cy.leetcodeplay.array.no344;

/**
 * @Author: Lil-K
 * @Date: 2024/4/17
 * @Description:
 */
public class Solution {

  public void reverseString(char[] s) {
    if (s.length <= 1) {
      return;
    }

    int l = 0, r = s.length - 1;

    while (l < r) {
      char leftChar = s[l];
      s[l++] = s[r];
      s[r--] = leftChar;
    }
  }
}