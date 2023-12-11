
package EmployeeMNG;

public class Programmer extends Employee{
    private int workingDay;

    public Programmer(int workingDay, String code, String fullname, int salary) {
        super(code, fullname, salary);
        this.workingDay = workingDay;
    }

    

    public int getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }
    
    public int totalmoney(){
        return this.getSalary() - (26-workingDay)*200;
    }
    
    public void viewfor(){
        System.out.println(this.getCode()+" "+this.getFullname()+" "+totalmoney());
    }
}
