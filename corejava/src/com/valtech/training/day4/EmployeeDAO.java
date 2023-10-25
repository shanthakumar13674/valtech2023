package com.valtech.training.day4;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	
	long count() throws SQLException;

	void deleteEmployee(int id) throws SQLException;

	void updateEmployee(Employee emp) throws SQLException;

	void createEmployee(Employee emp) throws SQLException;

	List<Employee> getAllEmployees() throws SQLException;

	Employee getEmployee(int id) throws SQLException;

}