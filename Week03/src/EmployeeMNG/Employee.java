
package EmployeeMNG;

public class Employee {
    private String code;
    private String fullname;
    private int salary;

    public Employee(String code, String fullname, int salary) {
        this.code = code;
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
