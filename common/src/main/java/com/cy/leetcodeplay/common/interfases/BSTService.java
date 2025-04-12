package com.cy.leetcodeplay.common.interfases;
/**
 * @Author: Lil-K
 * @Date: 2023/2/23
 * @Description:
 */
public interface BSTService{

	void add(Integer e);

	boolean contains(Integer e);

	void update(Integer e);

	void remove(Integer e);

	int getSize();

	boolean isEmpty();
}
