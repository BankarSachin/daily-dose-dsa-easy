package com.ssb.dsa.study.linkedlist;

public class Application {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(19);
		
		list.add(67);
		list.add(45);
		list.add(93);
		list.add(12);
		
		list.print();
		System.out.println();
		list.reverse();
		list.print();
	}
}
