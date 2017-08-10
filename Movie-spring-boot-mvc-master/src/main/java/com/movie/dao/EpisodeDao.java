package com.movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movie.domain.Episode;

public interface EpisodeDao extends JpaRepository<Episode, Long>{


}
