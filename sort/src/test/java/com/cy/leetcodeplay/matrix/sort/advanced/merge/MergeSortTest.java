package com.cy.leetcodeplay.matrix.sort.advanced.merge;

import com.cy.leetcodeplay.matrix.common.util.PrintString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


@Slf4j
class MergeSortTest {

	private static MergeSort mergeSort = new MergeSort();
	private static MergeSortBU mergeSortBU = new MergeSortBU();

	@Test
	public void test_1() {
		Integer[] arr = new Integer[]{8, 6, 2, 3, 1, 5, 7, 4};
		mergeSort.mergeSort(arr);
		String res = PrintString.printArray(arr);
		System.out.println(res);
		Assertions.assertEquals("[1,2,3,4,5,6,7,8]", res);
	}

	@Test
	public void test_2() {
		Integer[] arr = new Integer[]{8, 6, 2, 3, 1, 5, 7, 4};
		mergeSortBU.sort(arr);
		String res = PrintString.printArray(arr);
		System.out.println(res);
		Assertions.assertEquals("[1,2,3,4,5,6,7,8]", res);
	}

}