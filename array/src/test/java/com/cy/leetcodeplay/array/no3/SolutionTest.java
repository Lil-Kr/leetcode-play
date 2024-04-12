package com.cy.leetcodeplay.array.no3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    String s = "abcabcbb";
    int res = Solution.lengthOfLongestSubstring(s);
    Assertions.assertEquals(res, 3);
  }

  @Test
  public void test2() {
    String s = "bbbbb";
    int res = Solution.lengthOfLongestSubstring(s);
    Assertions.assertEquals(res, 1);
  }

  @Test
  public void test3() {
    String s = "pwwkew";
    int res = Solution.lengthOfLongestSubstring(s);
    Assertions.assertEquals(res, 3);
  }

}