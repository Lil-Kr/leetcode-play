package com.cy.leetcodeplay.question.bst.no783;

import com.cy.common.interfases.impl.BST;
import com.cy.common.util.printtree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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