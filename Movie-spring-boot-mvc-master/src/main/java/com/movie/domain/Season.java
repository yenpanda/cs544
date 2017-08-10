package com.movie.domain;

import java.util.*;

import javax.persistence.*;

@Entity
public class Season {
	@Id
	@GeneratedValue
	private long id;
	
	private String poster;
	private String briefSummary;
	private Date year;
	
	@OneToMany
	private List<Episode> episodes;
	
	public Season() {};
	
	public Season(String poster, String briefSummary, Date year, List<Episode> episodes) {
		super();
		this.poster = poster;
		this.briefSummary = briefSummary;
		this.year = year;
		this.episodes = episodes;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getBriefSummary() {
		return briefSummary;
	}
	public void setBriefSummary(String briefSummary) {
		this.briefSummary = briefSummary;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public List<Episode> getEpisodes() {
		return episodes;
	}
	public void setEpisodes(List<Episode> episodes) {
		this.episodes = episodes;
	}
	
}
