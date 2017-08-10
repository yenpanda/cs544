package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.movie.service.SeasonService;

@Controller
public class SeasonController {
	@Autowired
	SeasonService ss;

}
