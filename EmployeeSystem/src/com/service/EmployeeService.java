package com.service;

import java.util.List;

import com.beans.Employee;

public interface EmployeeService {

	void addnewEmployee();

	List<Employee> displayAll();

	Employee SearchById(int id);

	Employee SearchByName(String name);

	List<Employee> SortBySal();

	List<Employee> SortByName();

	boolean modifySal(int id1, double nsal);

	boolean deleteById(int id2);

	
}
