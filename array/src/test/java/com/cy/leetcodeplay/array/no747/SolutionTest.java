package com.cy.leetcodeplay.array.no747;

import com.cy.leetcodeplay.array.no747.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    static int[] nums1 = {3, 6, 1, 0};
    static int[] nums2 = {1,2,3,4};
    static int[] nums3 = {9,1};

    @Test
    public void test1() {
        int res1 = solution.dominantIndex2(nums1);
        Assertions.assertEquals(1, res1);

        int res2 = solution.dominantIndex2(nums2);
        Assertions.assertEquals(-1, res2);
    }

    @Test
    public void test2() {

        int res1 = solution.dominantIndex2(nums1);
        Assertions.assertEquals(1, res1);

        int res2 = solution.dominantIndex2(nums2);
        Assertions.assertEquals(-1, res2);

        int res3 = solution.dominantIndex2(nums3);
        Assertions.assertEquals(0, res3);
    }


}