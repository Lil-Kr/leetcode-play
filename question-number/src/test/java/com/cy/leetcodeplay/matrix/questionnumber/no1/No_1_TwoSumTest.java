package com.cy.leetcodeplay.matrix.questionnumber.no1;


import com.cy.leetcodeplay.matrix.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class No_1_TwoSumTest {

    @Test
    public void test_1() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = No_1_TwoSum.twoSum(nums, target);
        String res = PrintString.printIntArray(ints);
        System.out.println(res);
        Assertions.assertEquals("[1,0]", res);
    }

    @Test
    public void test_2() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] ints = No_1_TwoSum.twoSum(nums, target);
        String res = PrintString.printIntArray(ints);
        System.out.println(res);
        Assertions.assertEquals("[2,1]", res);
    }

}