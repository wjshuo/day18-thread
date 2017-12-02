package com.lanou3g.people;

public class Woman extends Person {

	private Man husband;
	private Child son;

	public Woman() {
		super();
	}

	public Woman(String name, String sex, int age) {
		super(name, sex, age);
	}

	public Man getHusband() {
		return husband;
	}

	public void setHusband(Man husband) {
		this.husband = husband;
	}

	public Child getSon() {
		return son;
	}

	public void setSon(Child son) {
		this.son = son;
	}

	public void cook() {
		System.out.println("为她的丈夫" + this.husband.getName() + "和她的儿子" + this.son.getName() + "烹饪美食");
	}

}
