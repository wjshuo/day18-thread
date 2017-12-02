package com.lanou3g.family;

import com.lanou3g.people.Child;
import com.lanou3g.people.Man;
import com.lanou3g.people.Woman;

public class Family {

	private Man man;
	private Woman woman;
	private Child child;

	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}

	public Woman getWoman() {
		return woman;
	}

	public void setWoman(Woman woman) {
		this.woman = woman;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public void travel() {
		System.out.println(
				"一家三口:" + this.man.getName() + "和" + this.woman.getName() + "领着他们的孩子" + this.child.getName() + "出去旅行");
	}

}
