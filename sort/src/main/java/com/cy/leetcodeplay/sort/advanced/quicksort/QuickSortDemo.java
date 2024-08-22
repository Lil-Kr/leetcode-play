package com.cy.leetcodeplay.sort.advanced.quicksort;

import com.cy.common.helper.Helper;
import com.cy.common.util.PrintString;

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
	public static void quicksort(Integer[] arr) {
		int n = arr.length;

		quicksort(arr, 0, n - 1);
	}

	private static void quicksort(Integer[] arr, int l, int r) {
		if (l >= r) {
			return;
		}

		int p = partition(arr, l, r);
		quicksort(arr, l, p - 1);
		quicksort(arr, p+1, r);
	}

	private static int partition(Integer[] arr, int l, int r) {
		swap(arr, l, (int)(Math.random() * (r - l + 1)) + l);

		Integer v = arr[l];

		int i = l + 1, j = r;

		while (true) {
			while (i <= r && arr[i] < v) {
				i++;
			}
			while (j > l + 1 && arr[j] > v) {
				j--;
			}
			if (i > j) {
				break;
			}
			swap(arr, i, j);
			i++;
			j--;
		}
		swap(arr, l, j);
		return j;
	}

	private static void swap(Integer[] arr, int i, int j) {
		Integer temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
