package com.cy.leetcodeplay.queue.no295;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {

	private MedianFinder medianFinder = new MedianFinder();

	@Test
	public void test1() {
		int[] nums = {1, 2};
		for (int i = 0; i < nums.length; i++) {
			medianFinder.addNum(nums[i]);
		}
		double res1 = medianFinder.findMedian();
		Assertions.assertEquals(1.5, res1);
	}

	@Test
	public void test2() {
		int[] nums = {1, 2, 4};
		for (int i = 0; i < nums.length; i++) {
			medianFinder.addNum(nums[i]);
		}
		double res1 = medianFinder.findMedian();
		Assertions.assertEquals(2, res1);
	}
}