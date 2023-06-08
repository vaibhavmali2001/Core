package com.service;

import com.beans.Employee;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
	
private EmployeeDao edao;
	

	public EmployeeServiceImpl() {
		super();
		this.edao = new EmployeeDaoImpl();
	}

//accept details and send the data for adding in the list
	@Override
	public void addnewEmployee() {
		Scanner sc=new Scanner(System.in);
		//accept data for employee
		System.out.println("enter empid");
		int empid=sc.nextInt();
		System.out.println("enter ename");
		String nm=sc.next();
		//sc.nextLine();
		System.out.println("enter designation");
		String desg=sc.nextLine();
		desg+=sc.nextLine();
		//sc.nextLine();
		System.out.println("enter Salary");
		double s=sc.nextDouble();
		//create employee object
		Employee e=new Employee(empid,nm,desg,s);
		//add data in the elist using dao layer
		edao.save(e);
		
	}

//get all the employee objects from the the list
	@Override
	public List<Employee> displayAll() {
		return edao.getAllEmployee();
	}

	@Override
	public Employee SearchById(int id) {
		
		return edao.findById(id);
	}

	@Override
	public Employee SearchByName(String name) {
	
		return edao.findByName(name);
	}

	@Override
	public List<Employee> SortBySal() {
		return edao.sortBySal();
	}

	@Override
	public List<Employee> SortByName() {
		return edao.sortByName();
	}

	@Override
	public boolean modifySal(int id1, double nsal) {
		return edao.updateSal(id1,nsal);
	}

	@Override
	public boolean deleteById(int id2) {
		return edao.removeById(id2);
	}


}













