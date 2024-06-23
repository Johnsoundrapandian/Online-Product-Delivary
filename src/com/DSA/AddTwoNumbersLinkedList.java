package com.DSA;

import java.util.*;
import java.util.List;

/* You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order,and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/
public class AddTwoNumbersLinkedList {
    public static void main(String args[]) {
        ListNode a =new ListNode();
        ListNode l1 = new ListNode();
        l1.add(2);
        l1.add(3);
        l1.add(5);
        ListNode l2 = new ListNode();
        l2.add(5);
       l2.add(6);
       l2.add(7);
        ListNode e = a.addTwoNumbers(l1, l2);
        while(e!=null){
            System.out.println(e.val+"  ");
            e=e.next;
        }

    }
}
class ListNode{
   ListNode head ;
   ListNode tail;
    int val;
    ListNode next;
    ListNode(){
        head = null;
        tail = null;
    };
    ListNode(int x){
        val = x;
        next = null;
    }
    public void add(int val){
        ListNode n = new ListNode(val);
        if(head == null){
            head = n;
            tail= n;
        }
        else
            tail.next = n;
             tail = n;
    }
    public ListNode addTwoNumbers(ListNode a,ListNode b){
        if(a==null||b==null) return null;
        ListNode n = new ListNode();
        ListNode pre = n;
        int carry = 0;
        while(a!=null||b!=null){
            int val1 = (a!=null)?a.val:0;
            int val2 = (b!=null)?b.val:0;
            int sum = val1+val2+carry;
            carry = sum/10;
            pre.next  = new ListNode(sum%10);
            pre = n.next;
            if(a!=null) a=a.next;
            if(a!=null) b=b.next;
        }
        if(carry > 0){
            pre.next = new ListNode(carry);
        }
        return n.next;
    }
}

