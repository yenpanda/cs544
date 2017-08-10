package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.MovieDao;
import com.movie.domain.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDao mdao;
	
	@Override
	public List<Movie> getMovieList() {
		
		return mdao.findAll();
	}

	@Override
	public List<Movie> search(String q) {
		// TODO Auto-generated method stub
		return mdao.findByNameContaining(q);
	}

	@Override
	public Movie findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Movie movie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
