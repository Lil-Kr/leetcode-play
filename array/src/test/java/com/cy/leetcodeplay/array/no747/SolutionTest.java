package com.cy.leetcodeplay.array.no747;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution = new Solution();

    static int[] nums1 = {3, 6, 1, 0};
    static int[] nums2 = {1,2,3,4};


    @Test
    public void test1() {
        int res1 = solution.dominantIndex2(nums1);
        Assertions.assertEquals(1, res1);


        int res2 = solution.dominantIndex2(nums2);
        Assertions.assertEquals(-1, res2);
    }

}