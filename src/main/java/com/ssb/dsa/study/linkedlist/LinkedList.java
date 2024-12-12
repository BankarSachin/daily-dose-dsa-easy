package com.ssb.dsa.study.linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {

	private Node head;
	private int length;
	
	public LinkedList(T value) {
		Node temp = new Node(value,null);
		head = temp;
		length++;
	}
	
	class Node{
		private Node next;
		private T value;
		
		public Node(T value,Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	@Override
	public boolean add(T t) {
		Node temp = head;
		while (temp.next!=null) {
			temp = temp.next;
		}
		Node newNode = new Node(t, null);
		temp.next = newNode;
		length++;
		return true;
	}

	@Override
	public T remove(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.value + " ");
			current = current.next;
		}		
	}

	@Override
	public T get(int i) {
		
		if (i>=length) {
			throw new IndexOutOfBoundsException();
		}
		
		Node temp = head;
		for (int j = 0; j < i; j++) {
			temp = temp.next;
		}
		return temp.value;
	}

	@Override
	public void reverse() {
		Node current = head;
		Node after = null;
		Node prev =  null;
				
		while (current!=null) {
			after = current.next;
			current.next = prev;
			
			prev = current;
			current = after;
		}
		this.head = prev;
	}

	@Override
	public T middle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getElementFromLast(int k) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
