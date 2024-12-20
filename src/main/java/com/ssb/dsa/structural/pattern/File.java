package com.ssb.dsa.structural.pattern;

public class File implements FileSystemObject {
	private String name;
	
	public File(String name) {
		this.name =  name;
	}
	
	@Override
	public void display() {
		System.out.println(name);
	}

}
