package com.cy.leetcodeplay.array.no125;

import com.cy.leetcodeplay.array.no125.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    String s = "A man, a plan, a canal: Panama";
    boolean res = solution.isPalindrome(s);
    Assertions.assertEquals(true, res);
  }

  @Test
  public void test2() {
    String s = "race a car";
    boolean res = solution.isPalindrome(s);
    Assertions.assertEquals(false, res);
  }

  @Test
  public void test3() {
    String s = " ";
    boolean res = solution.isPalindrome(s);
    Assertions.assertEquals(true, res);
  }


  @Test
  public void test4() {
    String s = ".,";
    boolean res = solution.isPalindrome(s);
    Assertions.assertEquals(true, res);
  }


  @Test
  public void test5() {
    String s = "";
    boolean res = solution.isPalindrome(s);
    Assertions.assertEquals(true, res);
  }
}