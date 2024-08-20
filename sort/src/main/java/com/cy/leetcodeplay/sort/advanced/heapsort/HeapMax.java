package com.cy.leetcodeplay.sort.advanced.heapsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Lil-K
 * @Date: 2023/9/5
 * @Description: 实现基础的堆结构
 */
public class HeapMax<E extends Comparable> {

    private List<E> datas;

    public HeapMax() {
        this.datas = new ArrayList<>();
    }

    public HeapMax(E[] datas) {
        this.datas = new ArrayList<>(Arrays.asList(datas));
        heapify(datas);
    }

    private int leftChildIndex(int index) {
        if (index < 0)
            throw new IllegalArgumentException("leftChildIndex index was error");

        return (index << 1) + 1;
    }

    private int rightChildIndex(int index) {
        if (index < 0)
            throw new IllegalArgumentException("rightChildIndex index was error");

        return (index << 1) + 2;
    }

    private int parentIndex(int index) {
        if (index <= 0)
            throw new IllegalArgumentException("parentIndex index was error");

        return (index - 1) / 2;
    }

    private void shiftUp(int k) {
        while (k > 0 && datas.get(this.parentIndex(k)).compareTo(datas.get(k)) < 0) {
            int parentIndex = this.parentIndex(k);
            Collections.swap(datas, parentIndex, k);
            k = parentIndex;
        }
    }

    /**
     * 下沉操作, 将元素下沉到该放置的位置
     * @param k
     */
    private void shiftDown(int k) {
        while (leftChildIndex(k) < datas.size()) {
            int j = leftChildIndex(k);

            /**
             * 获取 k 这个位置的左右子节点, 取最大(小)的元素顶
             * j + 1 表示右子节点
             */
            if (j + 1 < datas.size() && datas.get(j + 1).compareTo(datas.get(j)) > 0) {
                j++;
            }

            if (datas.get(k).compareTo(datas.get(j)) >= 0) {
                break;
            }else {
                Collections.swap(datas, k, j);
                k = j;
            }
        }
    }

    public void add(E e) {
        datas.add(e);

        /**
         * siftUp
         */
        shiftUp(datas.size() - 1);
    }

    public E extractMax() {
        if (isEmpty())
            throw new IllegalArgumentException("extractMax method is error");

//        E max = this.datas.get(0);
        Collections.swap(this.datas, 0, this.datas.size() - 1);
        E max = this.datas.remove(this.datas.size() - 1);
        shiftDown(0);
        return max;
    }

    public void heapify(Comparable[] arr) {
        for (int i = this.parentIndex(arr.length - 1); i >= 0; i--) {
            shiftDown(i);
        }
    }

    public int getSize() {
        return datas.size();
    }

    public boolean isEmpty() {
        return datas.isEmpty();
    }

}