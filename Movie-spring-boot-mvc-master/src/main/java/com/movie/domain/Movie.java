package com.movie.domain;

public class Movie {
	public Movie(String name)
	{setName(name);}
	public String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String desc;
}
