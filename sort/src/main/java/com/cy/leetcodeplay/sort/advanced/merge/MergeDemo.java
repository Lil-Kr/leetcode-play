package com.cy.leetcodeplay.sort.advanced.merge;

import com.cy.common.util.PrintString;

import java.util.Arrays;

/**
 * @Author: Lil-K
 * @Date: 2024/8/15
 * @Description:
 */
public class MergeDemo {

	public static void main(String[] args) {
		Integer[] arr = new Integer[]{8, 6, 2, 3, 1, 5, 7, 4};
		mergesort(arr);
		System.out.println(PrintString.printArray(arr));
	}

	public static void mergesort(Integer[] arr) {
		int n = arr.length;
		mergesort(arr, 0, n - 1);
	}

	private static void mergesort(Integer[] arr, int l, int r) {
		if (l >= r) {
			return;
		}

		int mid = l + (r - l) / 2;
		mergesort(arr, l, mid);
		mergesort(arr, mid + 1, r);

		sort(arr, l, mid, r);
	}

	private static void sort(Integer[] arr, int l, int mid, int r) {
		Integer[] aux = Arrays.copyOfRange(arr, l, r + 1);

		int i = l, j = mid + 1;

		for (int k = i; k <= r; k++) {
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