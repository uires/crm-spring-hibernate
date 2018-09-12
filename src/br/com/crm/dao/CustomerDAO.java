package br.com.crm.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import br.com.crm.IF.IFGenericDAO;
import br.com.crm.entity.Customer;
import br.com.crm.factory.HibernateFactory;

@Repository
public class CustomerDAO implements IFGenericDAO<Customer> {
	private Session session;

	@Override
	public void save(Customer t) {
		session = HibernateFactory.getSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Customer selectById(Long id) {
		session = HibernateFactory.getSession();
		session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.getTransaction().commit();
		session.close();
		return customer;
	}

	@Override
	public void update(Customer customer) {
		session = HibernateFactory.getSession();
		session.beginTransaction();
		session.update(customer);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Customer> selectAll() {
		session = HibernateFactory.getSession();
		session.beginTransaction();
		ArrayList<Customer> list = (ArrayList<Customer>) session.createQuery("FROM Customer").getResultList();
		session.getTransaction().commit();
		session.close();
		return list;
	}

	@Override
	public void delete(Long id) {
		session = HibernateFactory.getSession();
		session.beginTransaction();
		session.delete(this.selectById(id));
		session.getTransaction().commit();
		session.close();
	}

}
