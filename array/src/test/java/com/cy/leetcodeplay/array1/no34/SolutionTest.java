package com.cy.leetcodeplay.array1.no34;

import com.cy.common.util.StringPrint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();
    private static int[] nums1 = {5,7,7,8,8,10};
    private static int[] nums2 = {};
    private static int[] nums3 = {7};
    private static int[] nums4 = {2,2};
    private static int[] nums5 = {-3,-2,-1};
    private static int target1 = 6;
    private static int target2 = 8;
    private static int target3 = 0;
    private static int target4 = 7;



    @Test
    public void test1() {
        int[] indexs1 = solution.searchRange(nums1, target1);
        String res1 = StringPrint.printIntArray(indexs1);
        Assertions.assertEquals("[-1,-1]", res1);

        int[] indexs2 = solution.searchRange(nums1, target2);
        String res2 = StringPrint.printIntArray(indexs2);
        Assertions.assertEquals("[3,4]", res2);

        int[] indexs3 = solution.searchRange(nums2, target3);
        String res3 = StringPrint.printIntArray(indexs3);
        Assertions.assertEquals("[-1,-1]", res3);
    }

    @Test
    public void test2() {
        int[] indexs1 = solution.searchRange(nums3, target4);
        String res1 = StringPrint.printIntArray(indexs1);
        Assertions.assertEquals("[0,0]", res1);

        int[] indexs2 = solution.searchRange(nums3, target3);
        String res2 = StringPrint.printIntArray(indexs2);
        Assertions.assertEquals("[-1,-1]", res2);
    }


    @Test
    public void test3() {
        int[] indexs1 = solution.searchRange(nums4, target1);
        String res1 = StringPrint.printIntArray(indexs1);
        Assertions.assertEquals("[-1,-1]", res1);
    }

    @Test
    public void test4() {
        int[] indexs1 = solution.searchRange(nums5, target3);
        String res1 = StringPrint.printIntArray(indexs1);
        Assertions.assertEquals("[-1,-1]", res1);
    }
}