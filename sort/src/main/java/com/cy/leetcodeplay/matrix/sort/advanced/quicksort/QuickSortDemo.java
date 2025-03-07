package com.cy.leetcodeplay.matrix.sort.advanced.quicksort;

import com.cy.leetcodeplay.matrix.common.helper.Helper;
import com.cy.leetcodeplay.matrix.common.util.PrintString;

/**
 * @Author: Lil-K
 * @Date: 2024/8/18
 * @Description:
 */
public class QuickSortDemo {

	public static void main(String[] args) {
		Integer[] arr = {6, 8, 2, 3, 1, 5, 4, 7};
		quicksort(arr);
		System.out.println(PrintString.printArray(arr));

		int n = 1_000_000;
		Integer[] arr2 = Helper.generateRandomNumbers(n, 0, 4); // 大量重复元素
		quicksort(arr2);
		System.out.println(Helper.isSorted(arr2));
	}

	// 三路快排

	public static void quicksort(Integer[] arr) {
		int n = arr.length;
		quicksort(arr, 0, n - 1);
	}

	public static void quicksort(Integer[] arr, int l, int r) {
		if (l >= r) {
			return;
		}

		int[] p = partition(arr, l, r);
		quicksort(arr, l, p[0]);
		quicksort(arr, p[1], r);
	}

	public static int[] partition(Integer[] arr, int l, int r) {
		swap(arr, l, (int)(Math.random() * (r - l + 1)) + l);
		int v = arr[l];

		int lt = l;
		int gt = r + 1;
		int i = l + 1;

		while (i < gt) {
			if (arr[i] < v) {
				swap(arr, i, lt + 1);
				lt++;
				i++;
			} else if (arr[i] > v) {
				swap(arr, i, gt - 1);
				gt--;
			} else {
				i++;
			}
		}

		if (l != lt) {
			swap(arr, l, lt);
		}

		return new int[]{lt, gt};
	}


	public static void swap(Integer[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
