package com.cy.leetcodeplay.array.no11;

import com.cy.leetcodeplay.array.no11.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int area = Solution.maxArea(height);
        Assertions.assertEquals(area, 49);
    }

    @Test
    public void test2() {
        int[] height = {1,1};
        int area = Solution.maxArea(height);
        Assertions.assertEquals(area, 1);
    }

    @Test
    public void test3() {
        int[] height = {1,4,1,3};
        int area = Solution.maxArea(height);
        Assertions.assertEquals(area, 6);
    }

    @Test
    public void test4() {
        int[] height = {1,8,6,100,5,180,8,3,7};
        int area = Solution.maxArea(height);
        Assertions.assertEquals(area, 200);
    }
}