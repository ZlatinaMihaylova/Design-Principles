package com.epam.engx.cleandesign.lod;

public class Employee {

	String name;

	public Employee(String id) {
		this.name = "Name" + NameFormatter.DELIMITER + id;
	}

	public String getName() {
		return this.name;
	}

}
