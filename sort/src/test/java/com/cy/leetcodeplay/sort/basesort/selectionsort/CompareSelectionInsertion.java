package com.cy.leetcodeplay.sort.basesort.selectionsort;

import com.cy.common.helper.Helper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @Author: Lil-K
 * @Date: 2024/8/14
 * @Description:
 */
@Slf4j
class CompareSelectionInsertion {

  @Test
  public void test_1() {
    int n = 10000;
    Integer[] arr = Helper.generateRandomNumbers(n, 0, n);

    Helper.testSort(arr,
      "com.cy.leetcodeplay.sort.basesort.selectionsort.SelectionSort",
      "selectionSortToMin");

    Helper.testSort(arr,
      "com.cy.leetcodeplay.sort.basesort.insertionsort.InsertionSort",
      "sortOptimization");

  }



}
