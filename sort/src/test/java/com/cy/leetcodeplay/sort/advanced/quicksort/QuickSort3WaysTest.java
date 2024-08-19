package com.cy.leetcodeplay.sort.advanced.quicksort;

import com.cy.common.helper.Helper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSort3WaysTest {

	private static QuickSort3Ways quickSort3Ways = new QuickSort3Ways();

	@Test
	public void test_1() {
		int n = 1_000_000;
		Integer[] arr = Helper.generateRandomNumbers(n, 0, 4); // 大量重复元素
		quickSort3Ways.quicksort(arr);
		Helper.testSort(arr,
			"com.cy.leetcodeplay.sort.advanced.quicksort.QuickSort3Ways",
			"quicksort");
		Assertions.assertEquals(Helper.isSorted(arr), true);
	}

	public void test_2() {

	}



}