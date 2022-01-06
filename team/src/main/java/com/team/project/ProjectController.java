package com.team.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProjectController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping(value="/view", method= {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView view() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/view");
		return mv;
	}
	
	@RequestMapping(value="/login", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/login");
		return mv;
	}
	
	@RequestMapping(value="/join", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView join() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/join");
		return mv;
	}
	
	@RequestMapping(value="/notice", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView notice() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/notice");
		return mv;
	}
	
	@RequestMapping(value="/noticeList", method = {RequestMethod.POST})
	public ModelAndView noticeList() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/noticeList");
		return mv;
	}
	
	@RequestMapping(value="/ticket", method = {RequestMethod.POST})
	public ModelAndView ticket() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/ticket");
		return mv;
	}
	
	@RequestMapping(value="/searchList", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView searchList() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/searchList");
		return mv;
	}
	
	@RequestMapping(value="/seat", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView seat() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/seat");
		return mv;
	}
	
	@RequestMapping(value="/maps", method = {RequestMethod.POST , RequestMethod.GET})
	public ModelAndView maps() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index.jsp?sub=./site/maps");
		return mv;
	}

}
