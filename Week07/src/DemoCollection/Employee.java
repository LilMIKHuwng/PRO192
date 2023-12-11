
package DemoCollection;

public class Employee implements Comparable<Object>{
    private String code;
    private String fullname;
    private int age;

    public Employee(String code, String fullname, int age) {
        this.code = code;
        this.fullname = fullname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return code + "-" + fullname + "-" + age ;
    }

    @Override
    //in danh sach nhan vien tang dan theo age
//    public int compareTo(Object t) {
//        Employee emp = (Employee) t;
//        return this.age-emp.age;
//    }
    
    public int compareTo(Object t) {
        Employee emp = (Employee) t;
        return this.code.compareTo(emp.code);
    }
}
