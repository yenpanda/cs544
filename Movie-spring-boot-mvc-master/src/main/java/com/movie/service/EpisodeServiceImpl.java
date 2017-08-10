package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.dao.EpisodeDao;
import com.movie.domain.Episode;

@Service
public class EpisodeServiceImpl implements EpisodeService{

	@Autowired
	EpisodeDao eDao;
	
	@Override
	public List<Episode> getListEpisode() {
		// TODO Auto-generated method stub
		return eDao.findAll();
	}

	
}
