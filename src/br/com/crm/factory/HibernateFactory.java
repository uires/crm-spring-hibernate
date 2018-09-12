package br.com.crm.factory;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class HibernateFactory {
	public static Session getSession() {
		return new Configuration().configure().buildSessionFactory().getCurrentSession();
	}
}
