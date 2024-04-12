package com.cy.leetcodeplay.array.no26;

import com.cy.common.util.StringPrint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    private Solution solution = new Solution();

    static int[] nums1 = {1,1,2};
    static int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
    static int[] nums3 = {0, 0, 0};

    @Test
    public void test1() {
        int res1 = solution.removeDuplicates(nums1);
        System.out.println(StringPrint.printIntArray(nums1));
        Assertions.assertEquals(2, res1);

        int res2 = solution.removeDuplicates(nums2);
        System.out.println(StringPrint.printIntArray(nums2));
        Assertions.assertEquals(5, res2);

        int res3 = solution.removeDuplicates(nums3);
        System.out.println(StringPrint.printIntArray(nums3));
        Assertions.assertEquals(1, res3);
    }

}