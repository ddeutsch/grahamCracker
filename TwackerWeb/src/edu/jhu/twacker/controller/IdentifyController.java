package edu.jhu.twacker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Base view to ensure web service is functioning.
 * Equivalent to 'Hello World'
 * @author Disa Mhembere
 *
 */

@Controller
@RequestMapping(value = "/auth")
public class IdentifyController
{
	
	/**
	 * Simple page to be rendered upon get request
	 * @return the model containing the base view to be rendered
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get()
	{
		ModelAndView model = new ModelAndView("identify"); // renders base page
		return model;
	}

}
