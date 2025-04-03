package com.cy.leetcodeplay.binarytree.bst.no109;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;
import com.cy.leetcodeplay.matrix.common.entity.TreeNode;
import com.cy.leetcodeplay.matrix.common.helper.Helper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {-10,-3,0,5,9};
		ListNode head = new ListNode(nums);
		TreeNode res1 = solution.sortedListToBST(head);

		Assertions.assertEquals(true, Helper.checkIsBST(res1));
	}
}