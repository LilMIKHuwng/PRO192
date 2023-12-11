
package Polymorphism;

public class Emp_Fulltime extends Employee{
    private int Salary;
    private int dayoff;

    public Emp_Fulltime( String code, String fullname, String phone,int Salary, int dayoff) {
        super(code, fullname, phone);
        this.Salary = Salary;
        this.dayoff = dayoff;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getDayoff() {
        return dayoff;
    }

    public void setDayoff(int dayoff) {
        this.dayoff = dayoff;
    }
    
    @Override
    public int sumSalary(){
        return Salary - (dayoff * 50);
    }
    
    @Override
    public void viewinfor(){
        System.out.println( this.getCode() + "-" + this.getFullname() + "-" + this.getPhone() + "-" +sumSalary());
    }
}
