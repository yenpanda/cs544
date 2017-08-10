package com.movie.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Episode {
	@Id
	@GeneratedValue
	private long id;
	private String description;
	private String studio;
	private String director;
	private String cast;
	
	@Transient
	private List<Comment> comments;
	
	public Episode() {};
	
	public Episode(String description, String studio, String director, String cast) {
		super();
		this.description = description;
		this.studio = studio;
		this.director = director;
		this.cast = cast;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	
}
