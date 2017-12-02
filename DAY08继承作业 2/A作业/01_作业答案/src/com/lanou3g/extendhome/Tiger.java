package com.lanou3g.extendhome;

public class Tiger extends Animal {

	private String eat;
	private String place;

	public Tiger() {
		super();
	}

	public Tiger(String eat, String place) {
		super();
		this.eat = eat;
		this.place = place;
	}

	public Tiger(String name, int age, String color,
				String eat, String place) {
		super(name,age,color);
		this.eat = eat;
		this.place = place;
	}

	public String getEat() {
		return eat;
}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public void sound() {
		super.sound();
		System.out.println("老虎发出怒吼");
	}
}
