package com.example.demo.Service;

import com.example.demo.Model.Employee;

public class EmployeeService {

	public void addEmployeeToDb(Employee e)
	{
		System.out.println("Employee added to Database");
		
	}
	
	public Employee getEmpFromDb()
	{
		Employee emp=new Employee();
		emp.setEmployeeId(101);
		emp.setFirstName("Khushbu");
		emp.setLastName("Chawda");
		emp.setGender("Female");
		emp.setDateOfBirth("1998-07-15");
		emp.setEmail("khushbuchawda14@gmail.com");
		emp.setPhoneNumber("7666234201");
		emp.setAddress("Pune, Maharashtra");
		return emp;
		
	}
}
