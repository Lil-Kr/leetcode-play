package com.cy.leetcodeplay.matrix.sort.advanced.quicksort;

import com.cy.leetcodeplay.matrix.common.util.PrintString;
import org.junit.jupiter.api.Test;

class QuickSortRandomTest {

	public static QuickSortRandom quickSortRandom = new QuickSortRandom();

	@Test
	public void test_1() {
		Integer[] arr = {6, 8, 2, 3, 1, 5, 4, 7};
		quickSortRandom.quicksort(arr);
		String res = PrintString.printArray(arr);
		System.out.println(res);
	}
}