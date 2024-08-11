package com.artemtartakovsky.learn_spring_boot.ponies.bean;

public class Pony {

	private long id;
	private String name;
	private String race;

	public Pony(long id, String name, String race) {
		super();
		this.id = id;
		this.name = name;
		this.race = race;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRace() {
		return race;
	}

	@Override
	public String toString() {
		return "Pony [id=" + id + ", name=" + name + ", race=" + race + "]";
	}
}
