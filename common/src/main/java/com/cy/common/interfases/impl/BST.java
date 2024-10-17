package com.cy.common.interfases.impl;

import com.cy.common.interfases.BSTService;
import com.cy.common.entity.TreeNode;

import java.util.*;

/**
 * @Author: Lil-K
 * @Date: 2024/9/27
 * @Description: 二分搜索树
 */
public class BST implements BSTService {


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
		this.size = 0;

		if (arr.length < 1) {
			return;
		}

		for (Integer e : arr) {
			add(e);
		}
	}

	/**
	 * 添加新元素
	 * @param e
	 */
	@Override
	public void add(Integer e) {
//        if (root == null) {
//            root = new Node(e);
//            size ++;
//        }else {
//            add1(root, e);
//        }

		root = add2(root, e);
	}

	/**
	 * add1() 这个方法需要单独处理根节点
	 * 更推荐使用add2()
	 * @param node
	 * @param e
	 */
	private void add1(TreeNode node, Integer e) {
		/**
		 * 终止条件
		 */
		if (e.equals(node.val)){
			return;
		} else if (e.compareTo((Integer) node.val) < 0 && node.left == null) {
			node.left = new TreeNode(e);
			size++;
			return;
		}else if (e.compareTo((Integer) node.val) > 0 && node.right == null) {
			node.right = new TreeNode(e);
			size++;
			return;
		}

		if (e.compareTo((Integer) node.val) < 0){
			add1(node.left, e);
		}else{ // e.compareTo(node.e) > 0
			add1(node.right, e);
		}
	}

	/**
	 * 此方法不需要单独处理根节点
	 * @param node
	 * @param e
	 * @return
	 */
	private TreeNode add2(TreeNode node, Integer e){
		if (node == null){
			size++;
			return new TreeNode(e);
		}

		if (e.compareTo((Integer) node.val) < 0){
			node.left = add2(node.left, e);
		}else if (e.compareTo((Integer) node.val) > 0){
			node.right = add2(node.right, e);
		}

		return node;
	}

	/**
	 * 查找元素
	 * @param e
	 * @return
	 */
	@Override
	public boolean contains(Integer e) {
		return contains(root, e);
	}

	private boolean contains(TreeNode node, Integer e) {
		if(node == null) {
			return false;
		}

		if(e.compareTo((Integer) node.val) == 0) {
			return true;
		}else if(e.compareTo((Integer) node.val) < 0) {
			return contains(node.left, e);
		}else {
			return contains(node.right, e);
		}
	}

	@Override
	public void update(Integer e) {
		// todo BST修改元素
	}

	/**
	 * 删除最大值 -> 最左的节点
	 * 删除最小值 -> 最右的节点
	 * @param e
	 * @return
	 */
	@Override
	public void remove(Integer e) {
		if (size == 0) {
			throw new IllegalArgumentException("BST is empty!");
		}

		root = remove(root, e);
	}

	/**
	 * 删除元素
	 * @param node
	 * @param e
	 * @return
	 */
	private TreeNode remove(TreeNode node, Integer e) {
		if (node == null) {
			return null;
		}

		/**
		 * 寻找需要删除的位置
		 */
		if (e.compareTo((Integer) node.val) < 0) {
			node.left = remove(node.left, e);
			return node;
		} else if (e.compareTo((Integer) node.val) > 0) {
			node.right = remove(node.right, e);
			return node;
		}else {// e == node.e

			if (node.left == null) {
				TreeNode rightNode = node.right;
				node.right = null;
				size --;
				return rightNode;
			} else if (node.right == null) {
				TreeNode leftNode = node.left;
				node.left = null;
				size --;
				return leftNode;
			}else {
				/**
				 * 找到待删除元素【d】的后继
				 * 也就是【d】的右子树中最小的元素, 用来替换【d】的位置
				 */
				TreeNode successor = getMin(node.right);
				successor.right = removeMin(node.right);// 已包含 size--
				successor.left = node.left;

				node.left = node.right = null; // 不需要再次 size--
				return successor;
			}
		}
	}

	/**
	 * 删除最小值, 并返回
	 * @return
	 */
	public Integer removeMin() {
		Integer ret = getMin();
		/**
		 * 找到待删除元素的位置
		 */
		root = removeMin(root);
		return ret;
	}

	/**
	 * 删除以node为根的二分搜索树中的最小节点
	 * 返回删除节点后新的二分搜索树的根
	 * @param node
	 * @return
	 */
	private TreeNode removeMin(TreeNode node) {
		if (node.left == null) {
			// 保存右节点, 作为删除节点后新的二分搜索树的根
			TreeNode rightNode = node.right;
			// 删除右节点
			node.right = null;
			size--;
			return rightNode;
		}

		node.left = removeMin(node.left);
		return node;
	}

	public Integer removeMax() {
		Integer ret = getMax();
		root = removeMax(root);
		return ret;
	}

	/**
	 * 删除以node为根的二分搜索树中的最大节点
	 * 返回删除节点后新的二分搜索树的根
	 * @param node
	 * @return
	 */
	private TreeNode removeMax(TreeNode node) {
		if (node.right == null) {
			// 保存左节点, 作为删除节点后新的二分搜索树的根
			TreeNode leftNode = node.left;
			// 删除左节点
			node.left = null;
			size--;
			return leftNode;
		}

		node.right = removeMax(node.right);
		return node;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/** =========================== 前序遍历 start ===========================**/
	/**
	 * BST前序遍历
	 * 以node为根的BST, 递归遍历
	 */
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(TreeNode node) {
		if(node == null) {
			return;
		}

		System.out.println(node.val);
		preOrder(node.left);
		preOrder(node.right);
	}

	/**
	 * 前序遍历, 非递归写法
	 * 借助一个栈来实现
	 */
	public void preOrderNR() {
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			System.out.println(cur.val);

			if (cur.right != null) {
				stack.push(cur.right);
			}

			if (cur.left != null) {
				stack.push(cur.left);
			}
		}
	}
	/** =========================== end ===========================**/

	/** =========================== 中序遍历 start ===========================**/
	public void inOrder() {
		inOrder(root);
		inOrderOutputList(root);
	}

	private void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		inOrder(node.left);
		System.out.println(node.val);
		inOrder(node.right);
	}

	/**
	 * 输出中序遍历的结果
	 */
	public void inOrderOutputList() {
		inOrderOutputList(root);
	}

	private void inOrderOutputList(TreeNode node) {
		if (node == null) {
			return;
		}

		inOrderOutputList(node.left);
		list.add((Integer) node.val);
		inOrderOutputList(node.right);
	}
	/** =========================== end ===========================**/

	/** =========================== 后序遍历 start ===========================**/
	/**
	 * 后序遍历
	 */
	public void endOrder() {
		endOrder(root);
	}

	private void endOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		endOrder(node.left);
		endOrder(node.right);
		System.out.println(node.val);
	}
	/** =========================== end ===========================**/

	/** =========================== 层序遍历 start ===========================**/
	/**
	 * 层序遍历, 也叫广度优先遍历
	 * 使用队列实现
	 * 意义: 常用于搜索策略
	 */
	public void levelOrder() {
		if(isEmpty())
			return;

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()){
			TreeNode cur = q.remove();
			System.out.println(cur.val);

			if(cur.left != null) {
				q.add(cur.left);
			}
			if(cur.right != null) {
				q.add(cur.right);
			}
		}
	}
	/** =========================== end ===========================**/

	/** =========================== 获取最大值 =========================== **/
	public Integer getMax() {
		if (size == 0){
			throw new IllegalArgumentException("BST is empty!");
		}
		return (Integer) getMax(root).val;
	}

	private TreeNode getMax(TreeNode node) {
		if (node.right == null){
			return node;
		}
		return getMax(node.right);
	}

	/**
	 * 非递归实现, 获取最大值
	 * @return
	 */
	public Integer getMax1() {
		if (size == 0){
			throw new IllegalArgumentException("BST is empty!");
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		TreeNode max = new TreeNode();

		while (!q.isEmpty()) {
			TreeNode cur = q.remove();

			if (cur.right != null) {
				q.add(cur.right);
			} else {
				max = cur;
			}
		}
		return (Integer) max.val;
	}
	/** =========================== end =========================== **/

	/** =========================== 获取最小值 ===========================**/
	public Integer getMin() {
		if (size == 0){
			throw new IllegalArgumentException("BST is empty!");
		}
		return (Integer) getMin(root).val;
	}

	private TreeNode getMin(TreeNode node) {
		if(node.left == null) {
			return node;
		}
		return getMin(node.left);
	}

	/**
	 * 获取最小值, 非递归写法
	 * @return
	 */
	public Integer getMin1() {
		if (size == 0){
			throw new IllegalArgumentException("BST is empty!");
		}
		return (Integer) getMin1(root).val;
	}

	private TreeNode getMin1(TreeNode node) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		TreeNode min = new TreeNode();

		while (!q.isEmpty()){
			TreeNode cur = q.remove();

			if (cur.left != null){
				q.add(cur.left);
			} else {
				min = cur;
			}
		}
		return min;
	}
	/** =========================== end =========================== **/

	public List getBSTListByInOrder() {
		this.inOrderOutputList();
		return list;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		generateBSTString(root,0,res);
		return res.toString();
	}

	private void generateBSTString(TreeNode node, int depth, StringBuilder res) {
		if(node == null) {
			res.append(generateDepthString(depth) + "null \n");
			return;
		}
		res.append(generateDepthString(depth) + node.val + "\n");
		generateBSTString(node.left, depth + 1, res);
		generateBSTString(node.right, depth + 1, res);
	}

	private String generateDepthString(int depth) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			res.append("--");
		}
		return res.toString();
	}
}
