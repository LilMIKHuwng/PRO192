
package Polymorphism;

public class Emp_Parttime extends Employee{
    private int present;

    public Emp_Parttime( String code, String fullname, String phone, int present) {
        super(code, fullname, phone);
        this.present = present;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    @Override
    public int sumSalary(){
        return present * 40;
    }
    
    @Override
    public void viewinfor(){
        System.out.println( this.getCode() + "-" + this.getFullname() + "-" + this.getPhone() + "-" +sumSalary());
    }
}
