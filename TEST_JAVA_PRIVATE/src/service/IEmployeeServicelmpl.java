package service;

import model.Developer;
import model.Device;
import model.Employee;
import model.Tester;

import java.util.ArrayList;
import java.util.List;

public class IEmployeeServicelmpl implements IEmployeeService{
    public IEmployeeServicelmpl() {
        getList();
    }

    public static List<Employee> list = new ArrayList<>();
    static void getList(){
        list.add(new Developer("101","Thuong",22,10.0,new Device("101","Laptop"),7));
        list.add(new Tester("102","Hoa",20,11.0,new Device("102","PC"),3));
        list.add(new Developer("103","Hung",24,12.0,new Device("103","Laptop"),5));
        list.add(new Tester("104","Dat",23,13.0,new Device("104","PC"),6));
        list.add(new Developer("105","Tu",21,14.0,new Device("105","PC"),4));
    }

    @Override
    public List<Employee> getAllEmployees() {
        for(Employee x : list)
        {
            System.out.println(x.toString());;
        }
        return null;
    }

    @Override
    public Employee getEmployeeByld(String id) {
        for(Employee x : list)
        {
            if(x.getId().equalsIgnoreCase(id))
            {
                System.out.println(x.toString());;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        for(Employee x : list)
        {
            if(x.getName().equalsIgnoreCase(name))
            {
                System.out.println(x.toString());;
            }
        }
        return null;
    }
}
