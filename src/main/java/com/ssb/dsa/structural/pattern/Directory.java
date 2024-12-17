package com.ssb.dsa.structural.pattern;

import java.util.List;

public class Directory implements FileSystemObject{

	private String name;
	private List<File> fso;
	
	public Directory(String name) {
		this.name =  name;
	}

	@Override
	public void display() {
		System.out.println("Directory "+name);
		for (File file : fso) {
			file.display();
		}
	}
}
