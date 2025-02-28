package com.cy.leetcodeplay.matrix.linkedlist.no82;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] head = {1,2,3,3,4,4,5};
		ListNode node = new ListNode(head);
		ListNode res1 = solution.deleteDuplicates(node);
		Assertions.assertEquals("1 -> 2 -> 5 -> null", res1.toString());
	}

	@Test
	public void test2() {
		int[] head = {1,1,1,2,3};
		ListNode node = new ListNode(head);
		ListNode res1 = solution.deleteDuplicates(node);
		Assertions.assertEquals("2 -> 3 -> null", res1.toString());
	}
}