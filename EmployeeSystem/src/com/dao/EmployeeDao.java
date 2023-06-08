package com.dao;

import java.util.List;

import com.beans.Employee;

public interface EmployeeDao {
	
	void save(Employee e);

	List<Employee> getAllEmployee();

	Employee findById(int id);

	Employee findByName(String name);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	boolean updateSal(int id1, double nsal);

	boolean removeById(int id2);

	

}
