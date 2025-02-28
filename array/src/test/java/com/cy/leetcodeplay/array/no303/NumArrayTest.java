package com.cy.leetcodeplay.array.no303;

import com.cy.leetcodeplay.array.no303.NumArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumArrayTest {

	private NumArray numArray;

	@Test
	public void test1() {
		numArray = new NumArray(new int[]{-2,0,3,-5,2,-1});
		int res = numArray.sumRange(0, 2);
		Assertions.assertEquals(res, 1);

		int res2 = numArray.sumRange(2, 5);
		Assertions.assertEquals(res2, -1);

		int res3 = numArray.sumRange(0, 5);
		Assertions.assertEquals(res3, -3);
	}
}