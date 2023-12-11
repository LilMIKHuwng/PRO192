
package Polymorphism;

abstract class Employee {
    private String code;
    private String fullname;
    private String phone;

    public Employee(String code, String fullname, String phone) {
        this.code = code;
        this.fullname = fullname;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    abstract public int sumSalary();
    
    abstract public void viewinfor();
   
}
