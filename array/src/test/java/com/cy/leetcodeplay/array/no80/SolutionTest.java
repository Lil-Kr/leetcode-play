package com.cy.leetcodeplay.array.no80;

import com.cy.leetcodeplay.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    private Solution solution = new Solution();

    @Test
    public void test_1() {
        int[] nums1 = {1,1,1,2,2,3};
        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        int[] nums3 = {1,1};
        int[] nums4 = {0,0};
        int[] nums5 = {0,1};
        int[] nums6 = {1};
        int[] nums7 = {0,1,2};

        int res1 = solution.removeDuplicates(nums1);
        System.out.println(PrintString.printIntArray(nums1));
        Assertions.assertEquals(5, res1);

        int res2 = solution.removeDuplicates(nums2);
        System.out.println(PrintString.printIntArray(nums2));
        Assertions.assertEquals(7, res2);

        int res3 = solution.removeDuplicates(nums3);
        System.out.println(PrintString.printIntArray(nums3));
        Assertions.assertEquals(2, res3);

        int res4 = solution.removeDuplicates(nums4);
        System.out.println(PrintString.printIntArray(nums4));
        Assertions.assertEquals(2, res4);

        int res5 = solution.removeDuplicates(nums5);
        System.out.println(PrintString.printIntArray(nums5));
        Assertions.assertEquals(2, res5);

        int res6 = solution.removeDuplicates(nums6);
        System.out.println(PrintString.printIntArray(nums6));
        Assertions.assertEquals(1, res6);

        int res7 = solution.removeDuplicates(nums7);
        System.out.println(PrintString.printIntArray(nums7));
        Assertions.assertEquals(3, res7);
    }

    @Test
    public void test_2() {
        int[] nums1 = {1,1,1,2,2,3};
        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        int[] nums3 = {1,1};
        int[] nums4 = {0,0};
        int[] nums5 = {0,1};
        int[] nums6 = {1};
        int[] nums7 = {0,1,2};

        int res1 = solution.removeDuplicates2(nums1);
        System.out.println(PrintString.printIntArray(nums1));
        Assertions.assertEquals(5, res1);

        int res2 = solution.removeDuplicates2(nums2);
        System.out.println(PrintString.printIntArray(nums2));
        Assertions.assertEquals(7, res2);

        int res3 = solution.removeDuplicates2(nums3);
        System.out.println(PrintString.printIntArray(nums3));
        Assertions.assertEquals(2, res3);

        int res4 = solution.removeDuplicates2(nums4);
        System.out.println(PrintString.printIntArray(nums4));
        Assertions.assertEquals(2, res4);

        int res5 = solution.removeDuplicates2(nums5);
        System.out.println(PrintString.printIntArray(nums5));
        Assertions.assertEquals(2, res5);

        int res6 = solution.removeDuplicates2(nums6);
        System.out.println(PrintString.printIntArray(nums6));
        Assertions.assertEquals(1, res6);

        int res7 = solution.removeDuplicates2(nums7);
        System.out.println(PrintString.printIntArray(nums7));
        Assertions.assertEquals(3, res7);
    }

}