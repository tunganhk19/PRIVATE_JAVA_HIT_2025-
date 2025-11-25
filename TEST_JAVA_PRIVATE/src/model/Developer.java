package model;

public class Developer extends Employee implements IDebuggable,IWorkable{
    private int overtimeHours;

    public Developer(String id, String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(id, name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public Developer() {
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + BASE_SALARY_RATE * overtimeHours;
    }

    @Override
    public void fixbug() {
        System.out.println("Sua code\n");
    }

    @Override
    public void word() {
        System.out.println("Code\n");
    }
}
