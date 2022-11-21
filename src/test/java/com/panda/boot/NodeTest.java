package com.panda.boot;

import java.util.LinkedList;

public class NodeTest {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode.next = listNode2;
        listNode2.next = listNode3;

        LinkedList<ListNode> listNodes = new LinkedList<>();
        listNodes.add(listNode);
        listNodes.add(listNode2);
        listNodes.add(listNode3);
        System.out.println(listNodes);
        LinkedList<ListNode> reverse = reverse(listNode);

        System.out.println(reverse);
    }

    public static LinkedList<ListNode> reverse(ListNode head){
        LinkedList<ListNode> ListNodeList = new LinkedList<>();
        ListNode prev = null;//定义一个前置结点。
        while(head != null){
            //这里要把next放在这里定义，不提前的原因是需要先满足head!= null的条件。
            ListNode next = head.next;
            head.next = prev;//调整指针域，让结点指向前置结点。
            //为下一次做准备
            prev = head;
            head = next;
            System.out.println(prev);
            ListNodeList.add(prev);
        }
        return ListNodeList;
    }

    /*单链表的定义 Definition for singly-linked list*/
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        // ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}
