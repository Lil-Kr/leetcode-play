package com.cy.leetcodeplay.linkedlist.no143;

import com.cy.leetcodeplay.classes.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1, 2, 3, 4};
		ListNode nodes = new ListNode(nums);
		solution.reorderList(nodes);
		System.out.println(nodes.toString());
		Assertions.assertEquals("1 -> 4 -> 2 -> 3 -> null", nodes.toString());

	}
}