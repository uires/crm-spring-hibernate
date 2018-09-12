package br.com.crm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.crm.entity.Customer;

@Repository
@Transactional
public class CustomerDAO {
	@Autowired
	private EntityManager manager;

	public void save(Customer customer) {
		manager.persist(customer);
	}

	public List<Customer> selectAll() {
		return (ArrayList<Customer>) manager.createQuery("from Livro", Customer.class).getResultList();
	}

	public Customer selectById(Long id) {
		return manager.find(Customer.class, id);
	}

	public void udpdate(Customer customer) {
		manager.persist(customer);
	}
	
	public void remove(Customer customer) {
		manager.remove(customer);
	}
}
