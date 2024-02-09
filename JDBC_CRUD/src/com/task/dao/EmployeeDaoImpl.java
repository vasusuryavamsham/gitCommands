package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public void updateEmployee( int id,String name, String Address) throws ClassNotFoundException, SQLException {
		
		Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("update emp set empname = '"+name+"', empaddress = '"+Address+"' where empid = "+id );
		 
		  pst.executeUpdate();
		  System.out.println("updated record successfully");
	}

	public void selectEmployee(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=DBUtil.getDBConnection();
		pst=connection.prepareStatement("select * from emp where empid = "+id);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}

	public void deleteEmployee(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=DBUtil.getDBConnection();
		 pst=connection.prepareStatement("delete from emp where empid = "+id );
		 
		  pst.executeUpdate();
		  System.out.println("deleted successfully");
	}

	public void showEmployees() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection=DBUtil.getDBConnection();
		pst=connection.prepareStatement("select * from emp");
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}

}
