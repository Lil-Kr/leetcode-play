package com.cy.leetcodeplay.sort.advanced.quicksort;

import com.cy.common.helper.Helper;
import com.cy.common.util.PrintString;
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

	@Test
	public void test_2() {
		Integer[] arr1 = {2,0,1};
		quickSort3Ways.quicksort(arr1);
		System.out.println(PrintString.printArray(arr1));
		Helper.testSort(arr1,
			"com.cy.leetcodeplay.sort.advanced.quicksort.QuickSort3Ways",
			"quicksort");
		Assertions.assertEquals(Helper.isSorted(arr1), true);
	}



}