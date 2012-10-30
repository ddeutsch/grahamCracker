package edu.jhu.twacker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController
{

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get()
	{
		ModelAndView model = new ModelAndView("base"); // renders base page
		return model;
	}

}
