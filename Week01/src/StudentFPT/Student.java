
package StudentFPT;
/* 
    Class là khuông đại diện để tạo các object
    trong class bao gồm:
    + Thuộc tính
    + hoặc nhiều Cóntructor
    + có hàm set/get để cập nhật và lấy thông tin
    + Có các hàm để đáp ứng thông tin yêu cầu
*/
public class Student {
    //attribute - properties
    private String code;
    private String fullname;
    private String birthday;
    private String major;
    private float gpa;

    //ham nay se tu dong dc goi khi 1 doi tuong cua class dc khoi tao

    public Student(String code, String fullname) {
        this.code = code;
        this.fullname = fullname;
    }
    
    
    public Student(String code, String fullname, String birthday, String major, float gpa) {
        this.code = code;
        this.fullname = fullname;
        this.birthday = birthday;
        this.major = major;
        this.gpa = gpa;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getCode() {
        return code;
    }

    public String getFullname() {
        return fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getMajor() {
        return major;
    }

    public float getGpa() {
        return gpa;
    }
    
    
    

    
   
    //method
    public void viewfor(){
        System.out.println(code+"-"+fullname+"-"+birthday+"-"+major+"-"+gpa);
    }
}
