package com.task.dao;

import java.sql.SQLException;

import com.task.bean.EmployeeBean;

public interface IEmployeeDao {
public void insertEmployee(EmployeeBean bean) throws ClassNotFoundException, SQLException;
public void updateEmployee(int id, String name,String Address) throws ClassNotFoundException, SQLException;
}
