
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
            s.nextLine();
            switch (chose){
                case 1:
                    new IEmployeeServicelmpl().getAllEmployees();
                    break;
                case 2:
                    System.out.println("\nNhập ID nhân viên: ");
                    String id = s.nextLine();
                    new IEmployeeServicelmpl().getEmployeeByld(id);
                    break;
                case 3:
                    System.out.println("\nNhập tên nhân viên: ");
                    String name = s.nextLine();
                    new IEmployeeServicelmpl().getEmployeeByName(name);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ERROR!!!");
            }
        } while (chose != 4);
    }
}