package com.cy.leetcodeplay.question.bt.no226;

import com.cy.common.util.printtree.PrintTree;
import com.cy.common.entity.TreeNode;
import com.cy.common.interfases.impl.BST;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		Integer[] nums = {4, 2, 7, 1, 3, 6, 9};
		BST bst = new BST(nums);
		PrintTree.printTree2(bst.getRoot());

		TreeNode res1 = solution.invertTree(bst.getRoot());
//		System.out.println(PrintTree.printTree(res1));

		PrintTree.printTree2(res1);
	}

}