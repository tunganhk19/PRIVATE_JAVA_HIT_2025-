
import model.Employee;
import model.Developer;
import model.Tester;
import model.Device;
import service.IEmployeeServicelmpl;
import service.IEmployeeService;
import model.IDebuggable;
import model.IWorkable;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Employee> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        list.add(new Developer("101","Thuong",22,10.0,new Device("101","Developer"),7));
        list.add(new Tester("102","Hoa",20,11.0,new Device("102","Tester"),3));
        list.add(new Developer("103","Hung",24,12.0,new Device("103","Developer"),5));
        list.add(new Tester("104","Dat",23,13.0,new Device("104","Tester"),6));
        list.add(new Developer("105","Tu",21,14.0,new Device("105","Developer"),4));
        int chose;
        do
        {
            System.out.println("----- Menu -----\n" +
                    "1. In ra danh sách tất cả các nhân viên\n" +
                    "2. In ra thông tin nhiên viên theo ID\n" +
                    "3. Lọc ra danh sách nhân viên theo Tên \n" +
                    "4. Thoát\n");
            System.out.println("Lựa chọn của bạn?\n");
            chose = s.nextInt();
            switch (chose){
                case 1:
                    for (Employee x : new IEmployeeServicelmpl(list).getAllEmployees())
                    {
                        x.toString();
                    }
                    break;
                case 2:
                    System.out.println("\nNhập ID nhân viên: ");
                    String id = s.nextLine();
                    new IEmployeeServicelmpl(list).getEmployeeByld(id).toString();
                    break;
                case 3:
                    System.out.println("\nNhập tên nhân viên: ");
                    String name = s.nextLine();
                    for (Employee x : new IEmployeeServicelmpl(list).getEmployeeByName(name))
                    {
                        x.toString();
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERROR!!!");
            }
        } while (chose != 4);
    }
}