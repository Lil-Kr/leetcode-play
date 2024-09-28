package com.cy.leetcodeplay.question.no257;

import com.cy.common.util.printtree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/9/28
 * @Description: no.257. Binary Tree Paths
 *
 */
public class Solution {

	/**
	 *
	 * @param root
	 * @return
	 */
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<>();
		if (root == null) return res;

		buildPath(root, String.valueOf(root.val), res);
		return res;
	}

	private void buildPath(TreeNode node, String path, List<String> res) {

		if (node.left == null && node.right == null) {
			res.add(path);
			return;
		}

		if (node.left != null) {
			buildPath(node.left, path + "->" + node.left.val, res);
		}

		if (node.right != null) {
			buildPath(node.right, path + "->" + node.right.val, res);
		}
	}


}
