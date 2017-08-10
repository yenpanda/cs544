package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.movie.dao.SeasonDao;
import com.movie.domain.Season;

public class SeasonServiceImpl implements SeasonService{
	
	@Autowired
	SeasonDao sDao;

	@Override
	public List<Season> getListSeason() {
		// TODO Auto-generated method stub
		return sDao.findAll();
	}

}
