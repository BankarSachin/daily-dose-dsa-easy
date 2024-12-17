package com.ssb.dsa.structural.pattern;

public class MilkDecorator extends CofeeDecorator {

	protected MilkDecorator(Cofee cofee) {
		super(cofee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " With Milk";
	}
	
	@Override
	public int getCost() {
		return super.getCost() + 10;
	}
}
