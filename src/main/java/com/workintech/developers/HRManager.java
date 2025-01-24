package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper [] juniorDevelopers;
    private MidDeveloper [] midDevelopers;
    private SeniorDeveloper [] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[20];
        midDevelopers = new MidDeveloper[20];
        seniorDevelopers = new SeniorDeveloper[20];
    }

    @Override
    public String work() {
        setSalary(getSalary() + getSalary() * 0.1);
        return "HRManager work";

    }
    public void addEmployee(JuniorDeveloper juniorDeveloper, int index) {

        if(juniorDevelopers[index] != null) {
            System.out.println("JuniorDevelopers is full");
            return;
        }
        juniorDevelopers[index] = juniorDeveloper;
    }
    public void addEmployee( MidDeveloper midDeveloper, int index) {

        if(midDevelopers[index] != null) {
            System.out.println("midDevelopers is full");
            return;
        }
        midDevelopers[index] = midDeveloper;
    }
    public void addEmployee( SeniorDeveloper seniorDeveloper, int index) {

        if(seniorDevelopers[index] != null) {
            System.out.println("midDevelopers is full");
            return;
        }
        seniorDevelopers[index] = seniorDeveloper;
    }
}
