package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.movie.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	MovieService service;
	
	
	@RequestMapping("/movies")
    public String getListUsersView(Model model) {
      
		
        //ModelMap model = new ModelMap();
       
       /* List<Movie> movieList=new ArrayList();
        
        movieList.add(new Movie("panda"));
        movieList.add(new Movie("Nana"));*/
		
        model.addAttribute("movies", service.getMovieList());
        
        
        return "moviesPage";
    }
	
}
