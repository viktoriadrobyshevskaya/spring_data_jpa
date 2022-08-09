package com.zaurtregulov.spring.springboot.spring_data_jpa.service;

import com.zaurtregulov.spring.springboot.spring_data_jpa.entity.Employee;
import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmp(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmp(int id);

    public List<Employee> findAllByName(String name);
}
