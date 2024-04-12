package com.cy.leetcodeplay.array.no27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    static int[] nums1 = {3,2,2,3};
    static int val1 = 3;

    static int[] nums2 = {0,1,2,2,3,0,4,2};
    static int val2 = 2;

    @Test
    public void test1() {
        int res1 = solution.removeElement(nums1, val1);
        System.out.println(res1);
        Assertions.assertEquals(res1, 2);


        int res2 = solution.removeElement(nums2, val2);
        System.out.println(res2);
        Assertions.assertEquals(res2, 5);
    }
}