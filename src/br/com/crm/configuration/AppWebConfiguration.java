package br.com.crm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.crm.controller.CustomerController;
import br.com.crm.dao.CustomerDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses = { CustomerDAO.class, CustomerController.class })
public class AppWebConfiguration {
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/pages/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
}
