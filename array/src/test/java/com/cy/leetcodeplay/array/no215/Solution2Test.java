package com.cy.leetcodeplay.array.no215;

import com.cy.leetcodeplay.array.no215.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

class Solution2Test {

    private Solution2 solution = new Solution2();

    @Test
    public void test1() {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int res = Solution2.findKthLargest(nums, k);

        Assertions.assertEquals(res, 5);
    }

    @Test
    public void test2() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int res = Solution2.findKthLargest(nums, k);

        Assertions.assertEquals(res, 4);
    }

    @Test
    public void test3() {
        int[] nums = {3,2,3,1,2,4,5,5,6,5};
        int k = 1;
        int res = Solution2.findKthLargest(nums, k);

        Assertions.assertEquals(res, 6);
    }

    @Test
    public void test4() {
        int[] nums = {3,2,3,1,2,4,5,5,6,5};
        int k = 5;
        int res = Solution2.findKthLargest(nums, k);

        Assertions.assertEquals(res, 4);
    }

    @Test
    public void test5() {
        int[] nums = {3,2,3,1,2,4,5,5,6,5};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);
        }
        System.out.println(minHeap.peek());
    }
}