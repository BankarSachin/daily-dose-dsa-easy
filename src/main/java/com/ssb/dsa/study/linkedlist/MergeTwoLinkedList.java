package com.ssb.dsa.study.linkedlist;

public class MergeTwoLinkedList {
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		while (list1 !=null && list2!=null) {
			if (list1.val <= list2.val) {
				tail.next = list1;
				list1 = list1.next;
			}else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}
		
		if (list1 != null) {
			tail.next = list1;
		}else {
			tail.next = list2;
		}
		return dummy.next;
	}
	
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1,new ListNode(2, new ListNode(4)));
		ListNode list2 = new ListNode(1,new ListNode(3, new ListNode(5)));
		
		ListNode list3 = mergeTwoLists(list1, list2);
		while (list3!=null) {
			System.out.println(list3.val);
			list3 = list3.next;
		}
	}
}
