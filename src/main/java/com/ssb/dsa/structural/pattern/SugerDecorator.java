package com.ssb.dsa.structural.pattern;

public class SugerDecorator extends CofeeDecorator {

	protected SugerDecorator(Cofee cofee) {
		super(cofee);
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " With Suger";
	}
	
	@Override
	public int getCost() {
		return super.getCost() + 5;
	}
}
