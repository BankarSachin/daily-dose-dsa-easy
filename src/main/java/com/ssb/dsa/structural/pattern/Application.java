package com.ssb.dsa.structural.pattern;

public class Application {

	public static void main(String[] args) {
		Cofee simplCofee = new SimleCofee();
		
		Cofee sugCofee = new SugerDecorator(simplCofee);
		System.out.println(sugCofee.getDescription() + " Costing "+ sugCofee.getCost());
		
		Cofee milkCofee = new MilkDecorator(sugCofee);
		System.out.println(milkCofee.getDescription() + " Costing "+ milkCofee.getCost());
	}
}
