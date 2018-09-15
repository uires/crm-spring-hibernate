package br.com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.crm.dao.CustomerDAO;
import br.com.crm.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerDAO dao;

	@RequestMapping("/addPage")
	public ModelAndView addPage() {
		return new ModelAndView("customer-action/add");
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(Customer customer) {
		dao.save(customer);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/updatePage", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam("id") Long id) {
		return new ModelAndView("customer-action/update").addObject("customer", dao.selectById(id));
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(Customer customer) {
		System.out.println(customer.toString());
		dao.update(customer);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam("id") Long id) {
		dao.remove(id);
		return new ModelAndView("redirect:/");
	}

}
