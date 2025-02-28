package com.cy.leetcodeplay.matrix.questionnumber.no26;

import com.cy.leetcodeplay.matrix.common.util.PrintString;
import org.junit.jupiter.api.Test;

class No_26_RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test_1() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = No_26_RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.println(i);
        System.out.println(PrintString.printIntArray(nums));
    }


}