package com.javaguides.ems.mapper;

import com.javaguides.ems.dto.EmployeeDto;
import com.javaguides.ems.entity.Employee;

//mapping of employee to employeeDto
public class EmployeeMapper {

	public static EmployeeDto mapToEmployeeDta(Employee employee) {
		return new EmployeeDto(

				employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail()


				);

	}

	// mapping of employeeDto to employee
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		return new Employee(

				employeeDto.getId(), employeeDto.getFirstName(), employeeDto.getLastName(), employeeDto.getEmail());
	}


}
