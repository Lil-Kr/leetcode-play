package com.cy.leetcodeplay.matrix.binarytree.bst.no783;

import com.cy.leetcodeplay.matrix.common.interfases.impl.BST;
import com.cy.leetcodeplay.matrix.common.entity.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		Integer[] nums = {4,2,6,1,3};
		BST bst = new BST(nums);
		TreeNode root = bst.getRoot();
		int res1 = solution.minDiffInBST(root);
		Assertions.assertEquals(1, res1);
	}

	@Test
	public void test2() {
		Integer[] nums = {1,0,48,12,49};
		BST bst = new BST(nums);
		TreeNode root = bst.getRoot();
		int res1 = solution.minDiffInBST(root);
		Assertions.assertEquals(1, res1);
	}
}