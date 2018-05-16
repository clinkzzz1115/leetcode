package com.will.algorithm.leetcode;

/**
 * created by jiayi.chen on 2018/5/16
 */
public class ReverseInteger {

  /**
   * 123---321
   */
  public static int reverse(int x) {
    if (x == 0) {
      return 0;
    }
    int p = x / 10;
    int q = x % 10;

    return x;
  }

  public static void main(String[] args) {
    System.out.println(123 / 10);
    System.out.println(123 % 10);
  }

}
