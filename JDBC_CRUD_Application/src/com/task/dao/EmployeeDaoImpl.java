package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.task.bean.EmployeeBean;
import com.task.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao{
	public static PreparedStatement pst=null;
	

	@Override
	public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException {		
		int empId=bean.getEmpid();
		String empName=bean.getEmpname();
		String empAddress=bean.getEmpaddress();
		 Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("insert into emp values(?,?,?)");
		 pst.setInt(1, empId);
		 pst.setString(2, empName);
		 pst.setString(3, empAddress);
		  pst.executeUpdate();
		  System.out.println("insert one record successfully");
		  
	}

}
