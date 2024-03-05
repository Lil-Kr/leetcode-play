package com.cy.leetcodeplay.sort.heapsort;

/**
 * @Author: Lil-K
 * @Date: 2023/9/5
 * @Description: 原地堆排序
 *
 * 思路:
 *  先把待排序的数组整理为堆结构, 也就是 heapify 操作,
 *  然后通过获取堆顶元素(最大/最小)值 来进行排序
 */
public class HeapSort {

    public static void sort(Comparable[] arr) {
        if (null == arr)
            return;

        int n = arr.length - 1;

        /**
         * 先把数组整理为堆的结构, 也就是建堆
         */
        HeapMax heapMax1 = new HeapMax(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heapMax1.extractMax();
        }
    }
}