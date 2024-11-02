package com.cy.leetcodeplay.sort.basesort.insertionsort;

import com.cy.leetcodeplay.common.helper.Helper;
import com.cy.leetcodeplay.common.util.PrintString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

	private InsertionSort insertionSort = new InsertionSort();

	@Test
	public void test1() {
		Integer[] arr = {4,2,1,3};
		insertionSort.sortOptimization(arr);
		System.out.println(PrintString.printIntArray(arr));
		Assertions.assertEquals(true, Helper.isSorted(arr));
	}

	@Test
	public void test2() {

	}
}