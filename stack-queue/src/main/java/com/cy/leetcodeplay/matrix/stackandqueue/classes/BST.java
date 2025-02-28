package com.cy.leetcodeplay.matrix.stackandqueue.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/9/21
 * @Description:
 */
public class BST {

	private TreeNode root;
	private int size;
	private List<Integer> list;

	public BST() {
		this.root = null;
		this.list = new ArrayList<>();
		this.size = 0;
	}

	public BST(Integer[] arr) {
		this.root = null;
		this.list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
		}
		this.size = arr.length;
	}

	public void add(Integer e) {
		this.root = add(root, e);
	}

	private TreeNode add(TreeNode node, Integer val) {
		if (node == null){
			size++;
			return new TreeNode(val);
		}

		if (val.compareTo(node.val) < 0) {
			node.left = add(node.left, val);
		}else if (val.compareTo(node.val) > 0){
			node.right = add(node.right, val);
		}
		return node;
	}

	public int getSize() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public TreeNode getRoot() {
		return this.root;
	}
}