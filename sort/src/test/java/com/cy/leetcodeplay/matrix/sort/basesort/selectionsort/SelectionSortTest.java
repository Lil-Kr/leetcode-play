package com.cy.leetcodeplay.matrix.sort.basesort.selectionsort;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;


@Slf4j
class SelectionSortTest {

  private static SelectionSort selectionSort = new SelectionSort();

  @Test
  public void test_1() {

    Comparable[] arr = {3,2,6,1,9};
    selectionSort.selectionSortToMax(arr, arr.length);

    StringBuilder res = new StringBuilder();
    res.append("[");
    for (int i = 0; i < arr.length; i++) {
      res.append(arr[i] + ",");
    }
    res.replace(0, res.length(), StringUtils.removeEnd(res.toString(),","));
    res.append("]");
    System.out.println(res);

    /** ================================================ **/
    selectionSort.selectionSortToMin(arr);
    res.replace(0, res.length(), "");
    res.append("[");
    for (int i = 0; i < arr.length; i++) {
      res.append(arr[i] + ",");
    }
    res.replace(0, res.length(), StringUtils.removeEnd(res.toString(),","));
    res.append("]");
    System.out.println(res);
  }

}