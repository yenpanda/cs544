package com.movie.service;

import java.util.List;

import com.movie.domain.Movie;

public interface MovieService {
	
	public List<Movie> getMovieList();
	public List<Movie> search(String q);

	public Movie findOne(int id);

    void save(Movie movie);

    void delete(int id);
}
