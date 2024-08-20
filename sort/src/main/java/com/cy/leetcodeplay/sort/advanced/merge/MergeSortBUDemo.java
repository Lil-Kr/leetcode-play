package com.cy.leetcodeplay.sort.advanced.merge;

import com.cy.common.util.PrintString;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/8/15
 * @Description:
 */
public class MergeSortBUDemo {

	public static void main(String[] args) {
		int[] arr = new int[]{19, -1, 8, 6, 2, 3, 1, 5, 7, 4};
		mergesort(arr);
		System.out.println(PrintString.printIntArray(arr));
	}
	public static void mergesort(int[] arr) {
		int n = arr.length;
		sort(arr, 0, n);
	}

	private static void sort(int[] arr, int l, int r) {

		for (int sz = 1; sz <= r; sz = 2 * sz) {
			// i 每次参与归并数组的左边界
			for (int i = 0; i + sz < r; i += 2 * sz) {
				int l1 = i;
				int mid = i + sz - 1;
				int r1 = Math.min(i + 2 * sz - 1, r - 1);

				if (arr[mid] > arr[mid + 1]) {
					merge(arr, l1, mid, r1);
				}
			}
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int[] aux = Arrays.copyOfRange(arr, l, r+1);

		int i = l, j = mid + 1;

		for (int k = l; k <= r; k++) {
			if (i > mid) {
				arr[k] = aux[j - l];
				j++;
			} else if (j > r) {
				arr[k] = aux[i - l];
				i++;
			} else if (aux[i - l] < aux[j - l]) {
				arr[k] = aux[i - l];
				i++;
			} else {
				arr[k] = aux[j - l];
				j++;
			}
		}
	}
}