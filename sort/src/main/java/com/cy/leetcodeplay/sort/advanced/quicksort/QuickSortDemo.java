package com.cy.leetcodeplay.sort.advanced.quicksort;

import com.cy.common.util.CommonUtil;
import com.cy.common.util.PrintString;

/**
 * @Author: Lil-K
 * @Date: 2024/8/18
 * @Description:
 */
public class QuickSortDemo {

	public static void main(String[] args) {
		int[] arr = {6, 8, 2, 3, 1, 5, 4, 7};
		quickSort(arr);
		System.out.println(PrintString.printIntArray(arr));
	}
	public static void quickSort(int[] arr) {
		int n = arr.length;

		quickSort(arr, 0, n - 1);
	}

	private static void quickSort(int[] arr, int l, int r) {
		if (l >= r) {
			return ;
		}

		int p = partition(arr, l, r);

		quickSort(arr, l, p-1);
		quickSort(arr, p+1, r);
	}

	private static int partition(int[] arr, int l, int r) {
		CommonUtil.swap(arr, l,  (int)(Math.random() * (r - l + 1)) + l);

		int v = arr[l];

		int i = l + 1, j = r;

		while(true) {
			while (i <= r && arr[i] < v) {
				i++;
			}
			while (j >= l + 1 && arr[j] > v) {
				j--;
			}
			if (i > j) {
				break;
			}
			CommonUtil.swap(arr, i, j);
			i++;
			j--;
		}
		CommonUtil.swap(arr, l, j);
		return j;
	}
}
