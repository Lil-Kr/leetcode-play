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
		int[] arr = new int[]{8, 6, 2, 3, 1, 5, 7, 4};
		mergeSort1(arr);
		System.out.println(PrintString.printIntArray(arr));
	}

	public static void mergeSort1(int[] arr) {
		int n = arr.length;

		sort(arr, 0, n-1);
	}

	private static void sort(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}

		int mid = l + (r - l) / 2;

		sort(arr, l, mid);
		sort(arr, mid + 1, r);

		if (arr[mid] > arr[mid + 1]) {
			merge(arr, l, mid, r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int[] aux = Arrays.copyOfRange(arr, l, r + 1);

		//定义左右子数组的开始坐标
		int i = l, j = mid + 1;

		for (int k = l; k <= r; k++) {
			if (i > mid) {
				arr[k] = aux[j - l]; // 因为 aux中截取元素的范围是 [l ... r - 1], 当 l 的值为3的时候, j = 5,
				j++;
			}else if (j > r) {
				arr[k] = aux[i - l];
				i++;
			}else if (aux[i - l] < aux[j - l]) {
				arr[k] = aux[i -l];
				i++;
			}else {
				arr[k] = aux[j - l];
				j++;
			}
		}
	}

}
