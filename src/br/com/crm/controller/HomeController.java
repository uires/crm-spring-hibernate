package br.com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.crm.dao.CustomerDAO;

@Controller
public class HomeController {
	@Autowired
	private CustomerDAO dao;

	@RequestMapping(name = "/")
	public ModelAndView home() {
		return new ModelAndView("index").addObject("customerList", dao.selectAll());
	}
}
