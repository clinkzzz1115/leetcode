package com.will.algorithm.leetcode;

/**
 * created by jiayi.chen on 2018/5/16
 */
public class AddTwoNumbers {

  /**
   * 链表的操作，一个node，也就是说要有个节点用来表示当前的节点
   */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) {
      return null;
    }
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode node = new ListNode(0);
    ListNode cur = node;
    int plus = 0;
    while (l1 != null || l2 != null) {
      int p = (l1 == null) ? 0 : l1.val;
      int q = (l2 == null) ? 0 : l2.val;
      int sum = p + q + plus;
      cur = cur.next = new ListNode(sum % 10);
      plus = (sum / 10);
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (plus > 0) {
      cur.next=new ListNode(plus);
    }
    return node.next;
  }

  public static void main(String[] args) {
    AddTwoNumbers instance = new AddTwoNumbers();
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    ListNode node = instance.addTwoNumbers(l1, l2);
    Helper.printNode(node);
  }

}
