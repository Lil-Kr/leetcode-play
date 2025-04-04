package com.cy.leetcodeplay.common.util.printtree;

import com.cy.leetcodeplay.common.entity.TreeNode;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description:
 */
public class PrintTree {

	/**
	 * print tree
	 * @param root
	 * @return
	 */
	public static String printTree(TreeNode root) {
		StringBuilder res = new StringBuilder();
		generateBSTString(root,0,res);
		return res.toString();
	}

	private static void generateBSTString(TreeNode node, int depth, StringBuilder res) {
		if(node == null) {
			res.append(generateDepthString(depth) + "null \n");
			return;
		}
		res.append(generateDepthString(depth) + node.val + "\n");
		generateBSTString(node.left, depth + 1, res);
		generateBSTString(node.right, depth + 1, res);
	}

	private static String generateDepthString(int depth) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			res.append("--");
		}
		return res.toString();
	}

	/**
	 * print tree
	 * @param root
	 * @return
	 */
	public static void printTree2(TreeNode root) {
		printSubTree(root, "", true);
	}

	// 递归打印子树
	private static void printSubTree(TreeNode node, String prefix, boolean isRight) {
		if (node == null) {
			return;
		}

		// 打印当前节点，判断是左边还是右边
		System.out.println(prefix + (isRight ? "└── " : "┌── ") + node.val);

		// 增加前缀，用于下一级的缩进
		String newPrefix = prefix + (isRight ? "    " : "│   ");

		// 递归打印左子树和右子树
		printSubTree(node.left, newPrefix, false);
		printSubTree(node.right, newPrefix, true);
	}

}
