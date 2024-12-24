package com.ssb.dsa.study.lambdas;

import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<List<Integer>> listOfLists = List.of(
			    List.of(1, 2, 3),
			    List.of(4, 5),
			    List.of(6, 7, 8)
			);
		System.out.println(getListOfSquareOfDistinctOddNumbers(listOfLists));
	}
	
	public static List<Integer> getListOfSquareOfDistinctOddNumbers(List<List<Integer>> listOfList){
		return listOfList.stream()
				.flatMap(List::stream)
				.filter(n -> n%2!=0)
				.distinct()
				.map(n -> n*n)
				.toList();
	}
}
