package com.cy.leetcodeplay.sort.basesort.selectionsort;

import com.cy.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2023/8/26
 * @Description: 选择排序
 *
 * 选中第一个元素为标定点, 遍历 [1...n) 区间, 找到最小的元素与标定点交换位置
 *
 */
public class SelectionSort<E extends Comparable<E>> {

    /**
     * 选择排序, find min value
     * @param arr
     */
    public static void selectionSortToMin(Comparable[] arr) {
        int length = arr.length;
        /**
         * 寻找 [i...n) 区间里的最小值
         */
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            CommonUtil.swap(arr, i, minIndex);
        }
    }

    /**
     * 选择排序 find max value
     * @param arr
     * @param range
     */
    public static void selectionSortToMax(Comparable[] arr, int range) {
        /**
         * 寻找 [i...n) 区间里的最大值
         */
        for (int i = 0; i < range; i++) {
            int minIndex = i;
            for (int j = i+1; j < range; j++) {
                if (arr[j].compareTo(arr[minIndex]) > 0)
                    minIndex = j;
            }
            CommonUtil.swap(arr, i, minIndex);
        }
    }
}