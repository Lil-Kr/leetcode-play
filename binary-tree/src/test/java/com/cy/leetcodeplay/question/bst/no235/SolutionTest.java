package com.cy.leetcodeplay.question.bst.no235;


import com.cy.common.interfases.impl.BST;
import com.cy.common.entity.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		Integer[] nums = {6,2,8,0,4,7,9,3,5};
		BST bst = new BST(nums);
		TreeNode root = bst.getRoot();
		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(8);
		TreeNode res1 = solution.lowestCommonAncestor(root, p, q);
		Assertions.assertEquals(6, res1.val);
	}

	@Test
	public void test2() {
		Integer[] nums = {6,2,8,0,4,7,9,3,5};
		BST bst = new BST(nums);
		TreeNode root = bst.getRoot();
		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(4);
		TreeNode res1 = solution.lowestCommonAncestor(root, p, q);
		Assertions.assertEquals(2, res1.val);
	}
}