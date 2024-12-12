package com.ssb.dsa.study.linkedlist;

public interface List<T> {
	boolean add(T t);
	T remove(T t);
	void print();
	T get(int i);
	void reverse();
	T middle();
	T getElementFromLast(int k);
}
