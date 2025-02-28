package com.cy.leetcodeplay.array.no344;

import com.cy.leetcodeplay.array.no344.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


  private Solution solution = new Solution();

  @Test
  public void test1() {
    char[] s = new char[]{'h','e','l','l','o'};
    solution.reverseString(s);
    String res = String.valueOf(s);
    Assertions.assertEquals("olleh", res);
  }

  @Test
  public void test2() {
    char[] s = new char[]{'H','a','n','n','a','h'};
    solution.reverseString(s);
    String res = String.valueOf(s);
    Assertions.assertEquals("hannaH", res);
  }

}