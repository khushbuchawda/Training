package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.EmployeeManagementApplication;
import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	EmployeeService es=new EmployeeService();
	
	@PostMapping("employee/addEmp")
	String addEmployee(Employee e)
	{
		es.addEmployeeToDb(e);
		
		System.out.println("Employee added sucessfully");
		return "Employee is Added";
	}
	@GetMapping("getdata")
	Employee getEmployee()
	{
		Employee e=es.getEmpFromDb();
		return e;
	}

}
