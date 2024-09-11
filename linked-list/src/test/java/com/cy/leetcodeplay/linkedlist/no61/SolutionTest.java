package com.cy.leetcodeplay.linkedlist.no61;

import com.cy.leetcodeplay.classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4, 5};
		int k = 2;
		ListNode res1 = new ListNode(nums);
		ListNode node = solution.rotateRight(res1, k);
		Assertions.assertEquals("4 -> 5 -> 1 -> 2 -> 3 -> null", node.toString());
	}

}