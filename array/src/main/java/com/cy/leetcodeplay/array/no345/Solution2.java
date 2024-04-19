package com.cy.leetcodeplay.array.no345;

/**
 * @Author: Lil-K
 * @Date: 2024/4/18
 * @Description: 这个解法
 */
public class Solution2 {

  /**
   *
   * @param s
   * @return
   */
  public String reverseVowels(String s) {
    char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    int l = 0, r = s.length() - 1;

    char[] sCharArray = s.toCharArray();
    while (l < r) {
      boolean left = isVowel(vowels, s.charAt(l));
      boolean right = isVowel(vowels, s.charAt(r));

      if (left && right) {
        char temp = sCharArray[l];
        sCharArray[l++] = sCharArray[r];
        sCharArray[r--] = temp;
      }

      if (!left) {
        l++;
      }

      if (!right) {
        r--;
      }
    }

    return String.valueOf(sCharArray);
  }

  private boolean isVowel(char[] vowels, char value) {
    for (int i = 0; i < vowels.length; i++) {
      if (vowels[i] == value) {
        return true;
      }
    }
    return false;
  }
}
