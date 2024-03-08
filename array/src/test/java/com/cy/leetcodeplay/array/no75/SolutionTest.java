package com.cy.leetcodeplay.array.no75;


import com.cy.common.util.StringPrint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    static int[] nums1 = {2, 0, 2, 1, 1, 0};
    static int[] nums2 = {2};
    static int[] nums3 = {0,1,0};

    @Test
    public void test1() {
        solution.sortColors(nums1);
        String res1 = StringPrint.printIntArray(nums1);
        System.out.println(res1);
        Assertions.assertEquals("[0,0,1,1,2,2]", res1);
    }

    @Test
    public void test2() {
        solution.sortColors(nums2);
        String res1 = StringPrint.printIntArray(nums2);
        System.out.println(res1);
        Assertions.assertEquals("[2]", res1);
    }

    @Test
    public void test3() {
        solution.sortColors(nums3);
        String res1 = StringPrint.printIntArray(nums3);
        System.out.println(res1);
        Assertions.assertEquals("[0,0,1]", res1);
    }
}