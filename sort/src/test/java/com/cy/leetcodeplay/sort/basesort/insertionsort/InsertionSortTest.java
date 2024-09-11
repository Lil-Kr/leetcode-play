package com.cy.leetcodeplay.sort.basesort.insertionsort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

	private InsertionSort insertionSort = new InsertionSort();

	@Test
	public void test1() {
		Integer[] arr = {4,2,1,3};
		insertionSort.sortOptimization(arr);


	}

}