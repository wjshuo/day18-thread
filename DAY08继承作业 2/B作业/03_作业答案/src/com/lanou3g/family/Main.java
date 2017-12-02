package com.lanou3g.family;

import com.lanou3g.people.Child;
import com.lanou3g.people.Man;
import com.lanou3g.people.Woman;

public class Main {

	public static void main(String[] args) {
		
		Man man = new Man("邓超", "男", 31);
		Woman woman = new Woman("孙俪", "女", 30);
		Child child = new Child("等等","男",5);
		// 建立关系:男女结婚生子
		man.setWife(woman);
		man.setSon(child);
		
		woman.setHusband(man);
		woman.setSon(child);
		
		child.setFather(man);
		child.setMother(woman);
		
		// 组建家庭
		Family family = new Family();
		family.setMan(man);
		family.setWoman(woman);
		family.setChild(child);
		
		family.travel();
		man.makeMoney();
		woman.cook();
		child.study();
		
	}
}
