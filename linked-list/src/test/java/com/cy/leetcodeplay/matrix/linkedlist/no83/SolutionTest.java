package com.cy.leetcodeplay.matrix.linkedlist.no83;

import com.cy.leetcodeplay.matrix.common.entity.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution = new Solution();

	@Test
	public void test1() {
		int[] nums = {1,1,2};
		ListNode head = new ListNode(nums);
		solution.deleteDuplicates(head);
		String res1 = head.toString();
		System.out.println(res1);
		Assertions.assertEquals("1 -> 2 -> null", res1);
	}

	@Test
	public void test2() {
		int[] nums = {1,1,1};
		ListNode head = new ListNode(nums);
		solution.deleteDuplicates(head);
		String res1 = head.toString();
		Assertions.assertEquals("1 -> null", res1);
	}
}