package com.cy.leetcodeplay.array.no283;

import com.cy.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    static int[] nums1 = {0, 1, 0, 3, 12};
    static int[] nums2 = {0};
    static int[] nums3 = {4,3,9,7};
    static int[] nums4 = {3, 1, 0, 2, 0, 6};

    @Test
    public void test1() {
        Solution.moveZeroes1(nums1);
        String res1 = PrintString.printIntArray(nums1);
        System.out.println(res1);
        Assertions.assertEquals("[1,3,12,0,0]", res1);

        Solution.moveZeroes1(nums2);
        String res2 = PrintString.printIntArray(nums2);
        System.out.println(res2);
        Assertions.assertEquals("[0]", res2);
    }

    @Test
    public void test2() {
        Solution.moveZeroes2(nums1);
        String res = PrintString.printIntArray(nums1);
        System.out.println(res);
        Assertions.assertEquals("[1,3,12,0,0]", res);


        Solution.moveZeroes2(nums2);
        String res2 = PrintString.printIntArray(nums2);
        System.out.println(res2);
        Assertions.assertEquals("[0]", res2);
    }

    @Test
    public void test3() {
        Solution.moveZeroes3(nums1);
        String res = PrintString.printIntArray(nums1);
        System.out.println(res);
        Assertions.assertEquals("[1,3,12,0,0]", res);


        Solution.moveZeroes3(nums2);
        String res2 = PrintString.printIntArray(nums2);
        System.out.println(res2);
        Assertions.assertEquals("[0]", res2);
    }

    @Test
    public void test4() {
        Solution.moveZeroes4(nums1);
        String res = PrintString.printIntArray(nums1);
        System.out.println(res);
        Assertions.assertEquals("[1,3,12,0,0]", res);


        Solution.moveZeroes4(nums2);
        String res2 = PrintString.printIntArray(nums2);
        System.out.println(res2);
        Assertions.assertEquals("[0]", res2);

        Solution.moveZeroes4(nums3);
        String res3 = PrintString.printIntArray(nums3);
        System.out.println(res3);
        Assertions.assertEquals("[4,3,9,7]", res3);
    }


    @Test
    public void test5() {
        Solution.moveZeroes4(nums4);
        String res1 = PrintString.printIntArray(nums4);
        System.out.println(res1);
        Assertions.assertEquals("[3,1,2,6,0,0]", res1);
    }
}