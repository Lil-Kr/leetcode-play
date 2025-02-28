package com.cy.leetcodeplay.array.no209;

import com.cy.leetcodeplay.array.no209.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int res = solution.minSubArrayLen2(target, nums);
        Assertions.assertEquals(res, 2);
    }

    @Test
    public void test2() {
        int[] nums = {1,4,4};
        int target = 4;
        int res = solution.minSubArrayLen2(target, nums);
        Assertions.assertEquals(res, 1);
    }

    @Test
    public void test3() {
        int[] nums = {1,1,1,1,1,1,1,1};
        int target = 11;
        int res = solution.minSubArrayLen2(target, nums);
        Assertions.assertEquals(res, 0);
    }

}