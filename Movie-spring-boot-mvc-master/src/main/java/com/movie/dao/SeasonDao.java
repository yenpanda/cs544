package com.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.domain.Season;

public interface SeasonDao extends JpaRepository<Season, Long>{

}
