package com.cy.leetcodeplay.common.entity;

/**
 * @Author: Lil-K
 * @Date: 2024/10/18
 * @Description:
 */
public class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
}