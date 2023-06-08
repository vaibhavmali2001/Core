package com.dao;

import java.util.List;


import java.util.ArrayList;
import java.util.Comparator;

import com.beans.Employee;
import comparator.MyComparator;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(1,"Vaibhav","Full Stack Developer",50000.00));
		elist.add(new Employee(2,"Shailesh","Software Engg.",55000.50));
	}
	
	@Override
	public void save(Employee e) {
	
		elist.add(e);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return elist;
	}

	public Employee findById(int id) {
		int pos=elist.indexOf(new Employee(id));
		System.out.println(pos);
		if(pos!=-1)
		{
			return elist.get(pos);
		}
		else
		return null;
	}

	@Override
	public Employee findByName(String name) {
		for(Employee ob:elist)
		{
			if(ob.getEname().equals(name))
			{
				return ob;
			}
		}
		return null;
	}

	@Override
	public List<Employee> sortBySal() {
		List<Employee>li=new ArrayList<>();
			for(Employee ob:elist)
			{
				li.add(ob);
			}
			li.sort(null);
		return li;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee>li=new ArrayList<>();
		for(Employee ob:elist)
		{
			li.add(ob);
		}
		li.sort(new MyComparator());
		return li;
	}

	@Override
	public boolean updateSal(int id1, double nsal) {
		Employee ob=findById(id1);
		if(ob!=null)
		{
			ob.setSal(nsal);
			return true;
		}
		return false;
	
	}

	public boolean removeById(int id2) {
		return elist.remove(new Employee(id2));
	}
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




