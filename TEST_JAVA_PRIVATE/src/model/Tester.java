package model;

public class Tester extends Employee implements IWorkable{
    private int bugsDetectedCount;

    public Tester(String id, String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(id, name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public Tester() {
    }

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + BASE_SALARY_RATE * bugsDetectedCount;
    }

    @Override
    public void word() {
        System.out.println("Kiem tra code\n");
    }
}
