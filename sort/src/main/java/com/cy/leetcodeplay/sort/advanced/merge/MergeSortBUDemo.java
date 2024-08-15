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
		Integer[] arr = new Integer[]{19, -1, 8, 6, 2, 3, 1, 5, 7, 4};
		mergeSortBD(arr);
		System.out.println(PrintString.printArray(arr));
	}

	public static void mergeSortBD(Comparable[] arr) {
		if (null == arr) {
			return;
		}
		int n = arr.length;

		sort(arr, 0, n);
	}

	private static void sort(Comparable[] arr, int l, int r) {

		for (int sz = 1; sz <= r; sz = 2 * sz) {

			/**
			 * i 为 待归并子数组的左边界
			 * i += 2 * sz -> 表示下一轮待归并数组的左边界
			 */
			for (int i = 0; i + sz < r; i += 2 * sz) {
				int l1 = i;
				int mid = i + sz - 1;
				int r1 = Math.min(i + 2 * sz - 1, r - 1);
				if (arr[mid].compareTo(arr[mid + 1]) > 0) {
					merge(arr, l1, mid, r1);
				}
			}
		}
	}

	private static void merge(Comparable[] arr, int l, int mid, int r) {
		Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);

		int i = l, j = mid + 1;

		for (int k = l; k <= r; k++) {
			if (i > mid) {
				arr[k] = aux[j - l];
				j++;
			} else if (j > r) {
				arr[k] = aux[i - l];
				i++;
			} else if (aux[i - l].compareTo(aux[j - l]) < 0) {
				arr[k] = aux[i - l];
				i++;
			}else {
				arr[k] = aux[j - l];
				j++;
			}
		}
	}

}