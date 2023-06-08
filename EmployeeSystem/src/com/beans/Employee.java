package com.beans;



public class Employee implements Comparable<Employee> {
	
	private int empid;
	private String Ename;
	private String desg;
	private double Sal;
	
	public Employee() {
		super();
		this.empid=0;
		this.Ename=null;
		this.desg=null;
		this.Sal=0;
	}

	public Employee(int empid, String Ename, String desg, double Sal) {
		super();
		this.empid = empid;
		this.Ename = Ename;
		this.desg = desg;
		this.Sal = Sal;
	}
	public Employee(int id)
	{
		super();
		this.empid=id;
		this.Ename = null;
		this.desg = null;
		this.Sal = 0;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getSal() {
		return Sal;
	}


	public void setSal(double sal) {
		Sal = sal;
	}

	public boolean equals(Object a)
	{
		System.out.println("in emplyee equals "+this.empid+"-----"+((Employee)a).empid);
		return this.empid == ((Employee)a).empid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", Ename=" + Ename + ", desg=" + desg + ", Sal=" + Sal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getSal()<o.getSal())
		{
			return -1;
		}
		else if(this.getSal()==o.getSal())
			return 0;
		else
			return 1;
	}
	
	
	
	
}


