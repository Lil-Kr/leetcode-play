package com.cy.leetcodeplay.sort.advanced.quicksort;


import com.cy.leetcodeplay.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2023/9/1
 * @Description: 三路快排 --> O(n) 级别
 *
 */
public class QuickSort3Ways {

    public static void quicksort(Comparable[] arr) {
        int n = arr.length;
        quicksort(arr, 0, n-1);
    }

    private static void quicksort(Comparable[] arr, int l, int r) {
        /**
         * 对于小规模数组, 使用插入排序
         */
        if (l >= r) {
            return;
        }
//        if(r - l <= 15) {
//            InsertionSort.sortOptimization(arr, l, r);
//            return;
//        }

        int[] p = partition(arr, l, r);
        quicksort(arr, l, p[0]);
        quicksort(arr, p[1], r);
    }

    private static int[] partition(Comparable[] arr, int l, int r) {
        /**
         * 随机在 arr[l...r] 的范围中, 选择一个数值作为标定点 pivot
         */
        CommonUtil.swap(arr, l, (int) (Math.random() * (r - l + 1)) + l);
        Comparable v = arr[l];

        int lt = l;     // arr[l+1...lt] < v, 排序后: arr[l ... lt] < v
        int gt = r + 1; // arr[gt...r] > v
        int i = l + 1;    // arr[lt+1...i) == v

        while (i < gt) {
            if (arr[i].compareTo(v) < 0) {
                CommonUtil.swap(arr, i, lt + 1);
                i++;
                lt++;
            } else if (arr[i].compareTo(v) > 0) {
                CommonUtil.swap(arr, i, gt - 1);
                gt--;
            } else { // arr[i].compareTo(v) == 0
                i++;
            }
        }

        /**
         *
         */
        if(l != lt) {
            CommonUtil.swap( arr, l, lt);
        }

        return new int[]{lt, gt};
    }
}