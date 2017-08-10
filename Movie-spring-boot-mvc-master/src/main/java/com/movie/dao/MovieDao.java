package com.movie.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.domain.Movie;
public interface MovieDao extends JpaRepository<Movie, Long> {

	List<Movie> findByNameContaining(String q);
	
}

