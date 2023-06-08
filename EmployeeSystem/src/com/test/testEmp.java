package com.test;
import java.util.List;

import java.util.Scanner;

import com.beans.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;
public class testEmp {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				EmployeeService es=new EmployeeServiceImpl();
				int choice=0;
				do {
				System.out.println("1.Add new Employee\n2.Display all\n3.Disaly by id\n4.Display by name");
				System.out.println("5.sort by sal\n6.sort by name\n7.modify sal\n8.delete by id\n9.exit");
				System.out.println("choice : ");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					es.addnewEmployee();
					break;
				case 2:
					List<Employee> list=es.displayAll();
					list.forEach(ob->{System.out.println(ob);});
					break;
				case 3:
					System.out.println("Enter The Id : ");
					int id=sc.nextInt();
					Employee e = es.SearchById(id);
					if(e!=null)
					{
						System.out.println(e);
					}
					else
					{
						System.out.println("Not Found");
					}
					break;
				case 4:
					System.out.println("Enter the Name");
					String name=sc.next();
					Employee ab=es.SearchByName(name);
					if(ab!=null)
					{
						System.out.println(ab);
					}
					else
					{
						System.out.println("Not found");
					}
					break;
				case 5:
					List<Employee>li=es.SortBySal();
					li.forEach(ob->System.out.println(ob));
					break;
				case 6:
					List<Employee>lis=es.SortByName();
					lis.forEach(ob->System.out.println(ob));
					break;
				case 7:
					System.out.println("Enter the Id");
					int id1=sc.nextInt();
					System.out.println("Enter the Sal");
					double nsal=sc.nextDouble();
					boolean status=es.modifySal(id1,nsal);	
					if(status)
					{
						System.out.println("Modified Succesfully...");
					}
					else
					{
						System.out.println("Not found");
					}
					break;
				case 8:
					System.out.println("Enter the Id");
					int id2=sc.nextInt();
					boolean status1=es.deleteById(id2);
					if(status1)
					{
						System.out.println("Deleted Succesfully...");
					}
					else
					{
						System.out.println("Not Found");
					}
					break;
				default:
					sc.close();
					System.out.println("Thank You For Visiting...");
						
				}
				
				}while(choice != 9);

			

		


	}

}
