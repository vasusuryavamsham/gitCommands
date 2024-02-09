package com.task.service;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements IEmployeeService{

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
//		EmployeeBean bean1=new EmployeeBean();
		dao.insertEmployee(bean);
		
	}

	@Override
	public void updateEmployee(int id, String name, String Address) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.updateEmployee(id, name, Address);
	}

	public void selectEmployee(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.selectEmployee(id);
	}

	public void deleteEmployee(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.deleteEmployee(id);
	}

	public void showEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		EmployeeDaoImpl dao=new EmployeeDaoImpl();
		dao.showEmployees();
	}
	
	

}
