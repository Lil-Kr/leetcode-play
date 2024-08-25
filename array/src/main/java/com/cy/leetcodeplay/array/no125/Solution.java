package com.cy.leetcodeplay.array.no125;

/**
 * @Author: Lil-K
 * @Date: 2024/4/17
 * @Description: 125. Valid Palindrome
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * 对撞指针:
 *  创建两个收尾指针,
 */
public class Solution {

  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    isPalindrome2(s);
  }

  /**
   *
   * 当 s[l] != s[r] 有两种情况:
   *  1. 如果 s[l] s[r] 都是数字, 进入 else 必定是不相等的
   *  2. 如果 s[l] s[r] 如果都有可能不是数字, 那么移动相应左右两端的指针
   * @param s
   * @return
   */
  public boolean isPalindrome(String s) {
    String lowerStr = s.toLowerCase();

    int l = 0, r = lowerStr.length() - 1;

    while (l < r) {
      int lAscii = lowerStr.charAt(l);
      int rAscii = lowerStr.charAt(r);

      if (lAscii == rAscii) { //
        l++;
        r--;
      } else { // l not equals r
        boolean left = isCharOrNumber(lAscii);
        boolean right = isCharOrNumber(rAscii);

        if (left && right)
          return false;

        if (!left)
          l++;

        if (!right)
          r--;
      }
    }
    return true;
  }

  private boolean isCharOrNumber(int s) {
    return (s >= 48 && s <= 57) || (s >= 65 && s <= 90) || (s >= 97 && s <= 122);
  }

  /**
   * 解法二, 对撞指针
   * @param s
   * @return
   */
  public static boolean isPalindrome2(String s) {
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      // 跳过非字母数字字符
      while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
        l++;
      }
      while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
        r--;
      }
      // 比较字符，忽略大小写
      if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
        return false;
      }
      l++;
      r--;
    }
    return true; // 如果所有字符都匹配
  }
}