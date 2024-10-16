package com.cy.common.helper;

import com.cy.common.util.printtree.TreeNode;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2024/10/16
 * @Description: 辅助类
 */
public class Helper {

	private Helper(){}

	/**
	 * 生成随机整数数组
	 * @param n
	 * @param rangeL
	 * @param rangeR
	 * @return
	 */
	public static Integer[] generateRandomNumbers(int n, int rangeL, int rangeR) {
		assert rangeL <= rangeR;

		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * (rangeR - rangeL + 1) + rangeL);
		}
		return arr;
	}

	/**
	 * 生成一个近乎有序的数组
	 * @param n
	 * @param swapTimes
	 * @return
	 */
	public static Integer[] generateNearlyOrderedArray(int n, int swapTimes) {

		Integer[] arr = new Integer[n];
		for( int i = 0 ; i < n ; i ++ )
			arr[i] = new Integer(i);

		for( int i = 0 ; i < swapTimes ; i ++ ){
			int a = (int)(Math.random() * n);
			int b = (int)(Math.random() * n);
			int t = arr[a];
			arr[a] = arr[b];
			arr[b] = t;
		}
		return arr;
	}

	/**
	 * 打印arr数组的所有内容
	 * @param arr
	 */
	public static void printArray(Object[] arr) {

		for (int i = 0; i < arr.length; i++){
			System.out.print( arr[i] );
			System.out.print( ' ' );
		}
		System.out.println();
	}

	/**
	 * 判断arr数组是否有序
	 * @param arr
	 * @return
	 */
	public static boolean isSorted(Comparable[] arr) {
		for( int i = 0 ; i < arr.length - 1 ; i ++ )
			if( arr[i].compareTo(arr[i+1]) > 0 )
				return false;
		return true;
	}

	/**
	 * 测试sortClassName所对应的排序算法排序arr数组所得到结果的正确性和算法运行时间
	 */
	public static void testSort(Comparable[] arr, String sortClassName, String methodName) {

		// 通过Java的反射机制, 通过排序的类名, 运行排序函数
		try{
			// 通过sortClassName获得排序函数的Class对象
			Class sortClass = Class.forName(sortClassName);
			// 通过排序函数的Class对象获得排序方法
			// Method sortMethod = sortClass.getMethod("sort",new Class[]{Comparable[].class});
			Method sortMethod = sortClass.getMethod(methodName, new Class[]{Comparable[].class});
			// 排序参数只有一个, 是可比较数组arr
			Object[] params = new Object[]{arr};

			long startTime = System.currentTimeMillis();
			// 调用排序函数
			sortMethod.invoke(null,params);
			long endTime = System.currentTimeMillis();

			assert isSorted( arr );

			System.out.println(sortClass.getSimpleName() + ": " + (endTime-startTime) + " ms");
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	/** ==================== check bst is right or not **/
	private static TreeNode prev = null;
	public static boolean checkIsBST(TreeNode node) {
		return inOrder(node);
	}

	private static boolean inOrder(TreeNode node) {
		if (node == null) return true;

		// 递归遍历左子树
		if (!inOrder(node.left)) return false;

		/**
		 * 检查当前节点是否比前一个节点大(严格递增)
		 * 右子树的元素 <= 根节点元素
		 */
		if (prev != null && node.val <= prev.val) {
			return false;
		}

		/**
		 * 更新前一个节点为当前节点
		 */
		prev = node;

		// 递归遍历右子树
		return inOrder(node.right);
	}

	/**
	 * 顺序输出BST中元素
	 */
	public static List<Integer> getBSTArray(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		inOrderGetBSTArray(root, res);
		return res;
	}

	private static void inOrderGetBSTArray(TreeNode node, List<Integer> res) {
		if (node == null) return;

		inOrderGetBSTArray(node.left, res);

		res.add(node.val);

		inOrderGetBSTArray(node.right, res);
	}
}
