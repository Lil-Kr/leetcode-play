package com.cy.leetcodeplay.array.no345;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: Lil-K
 * @Date: 2024/4/17
 * @Description:
 */
public class Solution {

  public static void main(String[] args) {
    String a = "abcsss";
    System.out.println(a.substring(0, 1));
  }

  public String reverseVowels(String s) {
    Set<Character> charSet = new TreeSet<>();
    charSet.add('a');
    charSet.add('e');
    charSet.add('i');
    charSet.add('o');
    charSet.add('u');
    charSet.add('A');
    charSet.add('E');
    charSet.add('I');
    charSet.add('O');
    charSet.add('U');

    int l = 0, r = s.length() - 1;

    char[] sCharArray = s.toCharArray();
    while (l < r) {
      boolean left = isVowel(charSet, s.charAt(l));
      boolean right = isVowel(charSet, s.charAt(r));

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

  private boolean isVowel(Set<Character> characters, char value) {
    return characters.contains(value);
  }
}
