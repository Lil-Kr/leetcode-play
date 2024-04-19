package com.cy.leetcodeplay.array.no713;

import org.junit.jupiter.api.Test;

class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void test1() {
    int[] nums = {10,5,2,6};
    int k = 100;
    solution.numSubarrayProductLessThanK(nums, k);
  }
}