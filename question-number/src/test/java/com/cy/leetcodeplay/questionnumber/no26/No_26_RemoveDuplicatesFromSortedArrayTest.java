package com.cy.leetcodeplay.questionnumber.no26;

import com.cy.common.util.PrintString;
import org.junit.jupiter.api.Test;

import static com.cy.leetcodeplay.questionnumber.no26.No_26_RemoveDuplicatesFromSortedArray.removeDuplicates;

class No_26_RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test_1() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
        System.out.println(PrintString.printIntArray(nums));
    }


}