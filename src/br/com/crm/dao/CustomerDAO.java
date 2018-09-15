package br.com.crm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.crm.entity.Customer;

@Repository
@Transactional
public class CustomerDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Customer customer) {
		manager.persist(customer);
	}

	public List<Customer> selectAll() {
		return (ArrayList<Customer>) manager.createQuery("from Customer", Customer.class).getResultList();
	}

	public Customer selectById(Long id) {
		return manager.find(Customer.class, id);
	}

	public void update(Customer customer) {
		manager.merge(customer);
	}

	public void remove(Long id) {
		Customer customer = this.selectById(id);
		manager.remove(customer);
	}
}
