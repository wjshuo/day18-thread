package com.lanou3g.extendhome;

public class Animal {
	
	private String name;
	private int age;
	private String color;
	
	public Animal() {
		
	}

	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//	动物叫声
	public void sound(){
		System.out.println("动物发出声音！");
	}
	
}
