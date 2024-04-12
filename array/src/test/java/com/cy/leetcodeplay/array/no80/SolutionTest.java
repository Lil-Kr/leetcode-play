package com.cy.leetcodeplay.array.no80;

import com.cy.common.util.StringPrint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    private Solution solution = new Solution();

    static int[] nums1 = {1,1,1,2,2,3};
    static int[] nums2 = {0,0,1,1,1,1,2,3,3};
    static int[] nums3 = {1,1};
    static int[] nums4 = {0,0};
    static int[] nums5 = {0,1};
    static int[] nums6 = {1};


    @Test
    public void test1() {
        int res1 = solution.removeDuplicates(nums1);
        System.out.println(StringPrint.printIntArray(nums1));
        Assertions.assertEquals(5, res1);

        int res2 = solution.removeDuplicates(nums2);
        System.out.println(StringPrint.printIntArray(nums2));
        Assertions.assertEquals(7, res2);

        int res3 = solution.removeDuplicates(nums3);
        System.out.println(StringPrint.printIntArray(nums3));
        Assertions.assertEquals(2, res3);

        int res4 = solution.removeDuplicates(nums4);
        System.out.println(StringPrint.printIntArray(nums4));
        Assertions.assertEquals(2, res4);

        int res5 = solution.removeDuplicates(nums5);
        System.out.println(StringPrint.printIntArray(nums5));
        Assertions.assertEquals(2, res5);

        int res6 = solution.removeDuplicates(nums6);
        System.out.println(StringPrint.printIntArray(nums6));
        Assertions.assertEquals(1, res6);
    }

}