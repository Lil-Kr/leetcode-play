package com.cy.leetcodeplay.array.no345;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private Solution3 solution = new Solution3();

  @Test
  public void test1 () {
    String s = "hello";
    String res = solution.reverseVowels(s);
    System.out.println(res);
    Assertions.assertEquals("holle", res);
  }

  @Test
  public void test2() {
    String s = "leetcode";
    String res = solution.reverseVowels(s);
    System.out.println(res);
    Assertions.assertEquals("leotcede", res);
  }

  @Test
  public void test3() {
    String s = "llllhelo";
    String res = solution.reverseVowels(s);
    System.out.println(res);
    Assertions.assertEquals("llllhole", res);
  }

  @Test
  public void test4() {
    String s = "ole";
    String res = solution.reverseVowels(s);
    System.out.println(res);
    Assertions.assertEquals("elo", res);
  }


  @Test
  public void test5() {
    String s = "oe";
    String res = solution.reverseVowels(s);
    System.out.println(res);
    Assertions.assertEquals("eo", res);
  }

  @Test
  public void test6() {
    String s = "Aa";
    String res = solution.reverseVowels(s);
    System.out.println(res);
    Assertions.assertEquals("aA", res);
  }
}