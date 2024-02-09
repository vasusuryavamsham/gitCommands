package com.task.ui;
import com.task.bean.EmployeeBean;
import com.task.service.*;

import java.sql.SQLException;
import java.util.Scanner;


public class Demo_CRUD {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("\tJDBC CRUD OPERATIONS");
		
		while(true) {
		System.out.println("**********************************************");
		System.out.println("select your option");
		System.out.println("1. insert employee data");//create
		System.out.println("2. update employee data");//update
		System.out.println("3  select employee data");//read
		System.out.println("4  delete employee data");//delete
		System.out.println("5  list all employees data");//show all
		System.out.println("6  EXIT");//exit
		System.out.println("\n**********************************************");
		int option=sc.nextInt();
		switch(option) {
		case 1:
		{
			System.out.println("Insert into database: ");
			System.out.println("enter id: ");
			int id = sc.nextInt();
			System.out.println("enter name: ");
			String name = sc.next();
			System.out.println("enter address: ");
			String address = sc.next();
			insertEmployee(id, name, address);
			break;
		}
		case 2:
		{
			System.out.println("Update record in database: ");
			System.out.println("update record: ");
			System.out.println("enetr id: ");
			int id = sc.nextInt();
			System.out.println("enter new name: ");
			String name = sc.next();
			System.out.println("enter new address: ");
			String address = sc.next();
//			String[] ls = list(ip.split(","));
			updateEmployee(id,name,address);
			break;
		}
		case 3:
		{
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			selectEmployee(id);
			break;
		}
		case 4:
		{
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			deleteEmployee(id);
			break;
		}
		case 5:
		{
			System.out.println("All employees data");
			showEmployees();
			break;
		}
		case 6:
		{
			sc.close();
			System.out.println("Exiting the program");
			System.exit(0);
		}
		default:
		{
		System.out.println("your entered option is not match");	
		}
		}
		System.out.println("\n");
		}
	}

	private static void showEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.showEmployees();
	}

	private static void deleteEmployee(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.deleteEmployee(id);
	}

	private static void selectEmployee(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.selectEmployee(id);
		
	}

	

	private static void updateEmployee(int id, String name, String Address) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		service.updateEmployee(id,name,Address);
	}

	private static void insertEmployee(int id, String name, String address) throws ClassNotFoundException, SQLException {	
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		bean.setEmpid(id);
		bean.setEmpname(name);
		bean.setEmpaddress(address);
		service.insertEmployee(bean);
		
	}

}
