package com.cy.leetcodeplay.questionnumber.no27;

import com.cy.common.util.StringPrint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class No_27_RemoveElementTest {

    @Test
    public void test_1() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int res = No_27_RemoveElement.removeElement(nums, val);
        System.out.println(StringPrint.printIntArray(nums));
        Assertions.assertEquals(5, res);
    }

    @Test
    public void test_2() {
        int[] nums = {3,2,2,3};
        int val = 3;

        int res = No_27_RemoveElement.removeElement(nums, val);
        System.out.println(StringPrint.printIntArray(nums));
        Assertions.assertEquals(2, res);
    }

    @Test
    public void test_3() {
        int[] nums = {3};
        int val = 3;

        int res = No_27_RemoveElement.removeElement(nums, val);
        System.out.println(StringPrint.printIntArray(nums));
        Assertions.assertEquals(0, res);
    }

    @Test
    public void test_4() {
        int[] nums = {3};
        int val = 2;

        int res = No_27_RemoveElement.removeElement(nums, val);
        System.out.println(StringPrint.printIntArray(nums));
        Assertions.assertEquals(1, res);
    }


}