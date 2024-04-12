package com.cy.leetcodeplay.array.no167;

import com.alibaba.fastjson2.JSONArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = Solution.twoSum(nums, target);

        Assertions.assertEquals("[1,2]", JSONArray.toJSONString(ints));
    }

    @Test
    public void test2() {
        int[] nums = {2,3,4};
        int target = 6;
        int[] ints = Solution.twoSum(nums, target);
        Assertions.assertEquals("[1,3]", JSONArray.toJSONString(ints));
    }

    @Test
    public void test3() {
        int[] nums = {-1,0};
        int target = -1;
        int[] ints = Solution.twoSum(nums, target);
        Assertions.assertEquals("[1,2]", JSONArray.toJSONString(ints));
    }
}