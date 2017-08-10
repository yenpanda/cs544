package com.movie.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String desc;

	@OneToMany
	private List<Season> seasons;
	
	private List<Artist> artists;
	
	public Movie() {};
	public Movie(String name){
		setName(name);
		}
	
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

	public List<Season> getSeasons() {
		return seasons;
	}

	public void setSeasons(List<Season> seasons) {
		this.seasons = seasons;
	}
	
}
