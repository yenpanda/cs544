package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.movie.domain.Movie;
@Service
public class MovieServiceImpl implements MovieService {

	//@Autowired
	//MovieDao mdao;
	
	@Override
	public List<Movie> getMovieList() {
		
		return null;//mdao.findAll();
	}

}
