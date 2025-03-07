package com.cy.leetcodeplay.matrix.binarytree.bt.no100;

import com.cy.leetcodeplay.matrix.common.interfases.impl.BST;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		Integer[] nums1 = {1,2,3};
		BST bst1 = new BST(nums1);
		BST bst2 = new BST(nums1);

		System.out.println(bst1);
		System.out.println(bst2);
		boolean res1 = solution.isSameTree2(bst1.getRoot(), bst2.getRoot());
		Assertions.assertEquals(true, res1);
	}
}