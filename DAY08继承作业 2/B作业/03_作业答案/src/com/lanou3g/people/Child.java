package com.lanou3g.people;

public class Child extends Person {

	private Man father;
	private Woman mother;

	public Child() {
		super();
	}

	public Child(String name, String sex, int age) {
		super(name, sex, age);
	}

	public Man getFather() {
		return father;
	}

	public void setFather(Man father) {
		this.father = father;
	}

	public Woman getMother() {
		return mother;
	}

	public void setMother(Woman mother) {
		this.mother = mother;
	}

	public void study() {
		System.out.println("在他爸爸" + this.father.getName() + "和他妈妈" + this.getName() + "的呵护下茁壮成长");
	}
}
