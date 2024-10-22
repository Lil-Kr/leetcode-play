package com.cy.leetcodeplay.sort.advanced.quicksort;

import com.cy.common.helper.Helper;
import com.cy.common.util.CommonUtil;
import com.cy.common.util.PrintString;

/**
 * @Author: Lil-K
 * @Date: 2024/10/21
 * @Description: 双路快排, 解决重复元素比较多的情况
 */
public class QuickSort2Ways {

	public static void main(String[] args) {
		Comparable[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6, 5};
		quicksort(nums);
		System.out.println(PrintString.printArray(nums));


		int n = 1_000_000;
		Integer[] arr2 = Helper.generateRandomNumbers(n, 0, 4); // 大量重复元素
		quicksort(arr2);
		System.out.println(Helper.isSorted(arr2));
	}

	public static void quicksort(Comparable[] arr) {
		if(null == arr)
			return;

		int n = arr.length;
		/**
		 * arr[l ... r]
		 */
		quicksort(arr, 0, n - 1);
	}

	/**
	 * 双路快排
	 * @param arr
	 * @param l
	 * @param r
	 */
	private static void quicksort(Comparable[] arr, int l, int r) {
		// 可使用插入排序优化
		if (l >= r)
			return;

		int p = partition(arr, l, r);
		quicksort(arr, l, p-1); // 注意是 p - 1
		quicksort(arr, p+1, r);
	}

	/**
	 * partition 计算
	 * @param arr
	 * @param l
	 * @param r
	 * @return
	 */
	private static int partition(Comparable[] arr, int l, int r) {
		/**
		 * 获取随机点
		 */
		CommonUtil.swap(arr,l,(int)(Math.random() * (r - l + 1)) + l);

		/**
		 * 固定数组的第一个元素
		 */
		Comparable v = arr[l];

		/**
		 * 第一个元素排序之后, 正确的位置, 从0开始
		 */
		int i = l + 1, j = r;

		while (true) {
			while (i <= r && arr[i].compareTo(v) < 0)
				i++;
			while (j > l + 1 && arr[j].compareTo(v) > 0)
				j--;
			if (i > j) {  // i 与 j 是有可能重合的
				break;
			}
			CommonUtil.swap(arr, i, j);
			i++;
			j--;
		}

		/**
		 * 此时, arr[j] 的位置就是 >= v 的所有元素的左边界
		 */
		CommonUtil.swap(arr, l, j);
		return j;
	}
}
