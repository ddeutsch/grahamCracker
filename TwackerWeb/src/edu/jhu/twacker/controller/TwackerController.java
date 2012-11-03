package edu.jhu.twacker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.jhu.twacker.form.TwackerBean;

@Controller
@RequestMapping(value = "/twacker")
public class TwackerController {
    
    private TwackerBean twackerBean;

    public TwackerController() {
        this.twackerBean = new TwackerBean();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get() {
        ModelAndView model = new ModelAndView("twacker");
        model.addObject(this.twackerBean);
        return model;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView post(@ModelAttribute("twackerBean") TwackerBean twackerBean) {
        if (!twackerBean.getQuery().equals("")) {
        	return new ModelAndView("results");
    	}
    	else {
	        ModelAndView model2 = new ModelAndView("twacker");
	        model2.addObject(twackerBean);
	        return model2;
	    }
    }
}
