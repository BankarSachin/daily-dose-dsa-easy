package com.ssb.dsa.structural.pattern;

public abstract class CofeeDecorator implements Cofee{

	protected Cofee cofee;
	
	protected CofeeDecorator(Cofee cofee) {
		this.cofee = cofee;
	}

	@Override
	public String getDescription() {
		return cofee.getDescription();
	}

	@Override
	public int getCost() {
		return cofee.getCost();
	}
	
	
}
