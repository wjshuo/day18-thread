package com.lanou3g.people;

public class Man extends Person {

	private Woman wife;
	private Child son;
	
	public Man() {
		super();
	}

	public Man(String name, String sex, int age) {
		super(name, sex, age);
	}

	public Woman getWife() {
		return wife;
	}

	public void setWife(Woman wife) {
		this.wife = wife;
	}

	public Child getSon() {
		return son;
	}

	public void setSon(Child son) {
		this.son = son;
	}

	public void makeMoney() {
		System.out.println("为他的妻子" + this.wife.getName() + "和他的儿子" + this.son.getName() + "努力赚钱");
	}

}
