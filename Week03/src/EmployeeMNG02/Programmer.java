
package EmployeeMNG02;

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
        return this.salary - (26-workingDay)*200;
    }
    
    /*
    Trả về 1 chuỗi đại diện cho 1 đối tượng
    Phương thức này sẽ tự động được gọi khi 1 đối tượng của lớp được truy cập
    */

    @Override
    public String toString() {
        return this.code+" "+this.fullname+" "+totalmoney();
    }
    
}
