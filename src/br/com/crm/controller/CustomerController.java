package br.com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.crm.dao.CustomerDAO;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerDAO dao;

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam("id") Long id) {
		return new ModelAndView("edit").addObject("customer", dao.selectById(id));
	}

	@RequestMapping(value = "/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		dao.remove(dao.selectById(id));
		return new ModelAndView("redirect:/");
	}
}