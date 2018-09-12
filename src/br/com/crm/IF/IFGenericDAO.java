package br.com.crm.IF;

import java.util.List;

public interface IFGenericDAO<T> {
	public void save(T t);
	public List<?> selectAll();
	public void delete(Long id);
	public void update(T t);
	public T selectById(Long id);
}
