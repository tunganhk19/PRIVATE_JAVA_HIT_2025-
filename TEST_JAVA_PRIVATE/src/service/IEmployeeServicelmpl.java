package service;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class IEmployeeServicelmpl implements IEmployeeService{
    public IEmployeeServicelmpl(List<Employee> ds) {
        list = ds;
    }

    public static List<Employee> list = new ArrayList<>();
    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employeeAllList = new ArrayList<>();
        employeeAllList = list;
        return employeeAllList;
    }

    @Override
    public Employee getEmployeeByld(String id) {
        for(Employee x : list)
        {
            if(x.getId().equalsIgnoreCase(id))
            {
                return x;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> employeeNameList = new ArrayList<>();
        for(Employee x : list)
        {
            if(x.getName().equalsIgnoreCase(name))
            {
                employeeNameList.add(x);
            }
        }
        return employeeNameList;
    }
}
