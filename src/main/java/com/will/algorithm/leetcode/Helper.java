package com.will.algorithm.leetcode;

/**
 * created by jiayi.chen on 2018/5/16
 */
public class Helper {

  public static final void printArray(int[] nums) {
    if (nums == null || nums.length == 0) {
      return;
    }
    for (int num : nums) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static final void printNode(ListNode node) {
    if (node == null) {
      return;
    }
    for (; node != null; node = node.next) {
      System.out.print(node.val + " ");
    }
    System.out.println();
  }

}
