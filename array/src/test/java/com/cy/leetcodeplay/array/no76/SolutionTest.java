package com.cy.leetcodeplay.array.no76;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    String s = "ADOBECODEBANC", t = "ABC";

    String res = solution.minWindow(s, t);
    Assertions.assertEquals("BANC", res);
  }

  @Test
  public void test2() {
    String s = "a", t = "a";

    String res = solution.minWindow(s, t);
    Assertions.assertEquals("a", res);
  }

  @Test
  public void test3() {
    String s = "a", t = "aa";

    String res = solution.minWindow(s, t);
    Assertions.assertEquals("", res);
  }

  @Test
  public void test4() {
    String s = "cabwefgewcwaefgcf", t = "cae";

    String res = solution.minWindow(s, t);
    Assertions.assertEquals("cwae", res);
  }

}