package service;

import model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeByld(String id);
    List<Employee> getEmployeeByName(String name);
}
