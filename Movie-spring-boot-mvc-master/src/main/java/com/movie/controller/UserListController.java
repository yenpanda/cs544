package com.movie.controller;


import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UserListController {

    


    @RequestMapping("/user_list.html")
    public ModelAndView getListUsersView() {
      
        ModelMap model = new ModelMap();
        
        
        model.addAttribute("users", null);
        return new ModelAndView("user_list", model);
    }

}
