package com.tecsup.lab09.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.lab09.dao.UserDAO;
import com.tecsup.lab09.dao.UserDAOImp;
import com.tecsup.lab09.db.ConnectionDB;
import com.tecsup.lab09.view.User;


@Controller
public class HomeController {
	

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		User user = new User();
		
		ModelAndView modelAndView = new ModelAndView("user", "command", user);
		return modelAndView;
	}
	
	@RequestMapping(value = "/consultar", method = RequestMethod.POST)
	public void addUser(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		UserDAO dao = new UserDAOImp();
		for (User item : dao.findAll()) {
			System.out.println(item); 
		};		
	}

}
