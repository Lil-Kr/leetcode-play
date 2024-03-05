package com.cy.leetcodeplay.sort.basesort.selectionsort;


import com.cy.common.util.CommonUtil;

/**
 * @Author: Lil-K
 * @Date: 2023/8/26
 * @Description: 选择排序
 *
 */
public class SelectionSort<E extends Comparable<E>> {

//    public static void main(String[] args) {
//        Comparable[] arr = {3,2,6,1,9};
//        selectionSort_toMax(arr, arr.length);
//
//        StringBuilder res = new StringBuilder();
//        res.append("[");
//        for (int i = 0; i < arr.length; i++) {
//            res.append(arr[i] + ",");
//        }
//        res.replace(0, res.length(), StringUtils.removeEnd(res.toString(),","));
//        res.append("]");
//        System.out.println(res);
//
//        /** ================================================ **/
//        selectionSort_toMin(arr);
//        res.replace(0, res.length(), "");
//        res.append("[");
//        for (int i = 0; i < arr.length; i++) {
//            res.append(arr[i] + ",");
//        }
//        res.replace(0, res.length(), StringUtils.removeEnd(res.toString(),","));
//        res.append("]");
//        System.out.println(res);
//    }

    /**
     * 选择排序, find min value
     * @param arr
     */
    public static void selectionSort_toMin(Comparable[] arr) {
        int length = arr.length;
        /**
         * 寻找 [i...n) 区间里的最小值
         */
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i+1; j < length; j++) {
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
    public static void selectionSort_toMax(Comparable[] arr, int range) {
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