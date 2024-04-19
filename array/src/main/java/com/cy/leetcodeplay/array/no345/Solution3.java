package com.cy.leetcodeplay.array.no345;

/**
 * @Author: Lil-K
 * @Date: 2024/4/18
 * @Description:
 */
public class Solution3 {

  /**
   *
   * @param s
   * @return
   */
  public static String reverseVowels(String s) {
    String vowels = "aeiouAEIOU";
    boolean[] freqVowels = new boolean[256];
    for (int i = 0; i < vowels.length(); i++) {
        freqVowels[vowels.charAt(i)] = true;
    }

    int l = 0, r = s.length() - 1;
    char[] charArray = s.toCharArray();

    while (l < r) {
      boolean left = freqVowels[s.charAt(l)];
      boolean right = freqVowels[s.charAt(r)];

      if (left && right) {
        char temp = charArray[l];
        charArray[l++] = charArray[r];
        charArray[r--] = temp;
      } else {
        if (!left) {
          l++;
        }

        if (!right) {
          r--;
        }
      }
    }

    return String.valueOf(charArray);
  }

}
