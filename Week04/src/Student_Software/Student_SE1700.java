
package Student_Software;

public class Student_SE1700 {
    String code;
    String name;
    static String uni="fpt university";

    public Student_SE1700(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static String change(){
        return uni="fpt university tphcm";
    }

    public void output(){
        System.out.println(code+" - "+name+" - "+uni);
    }
    
}
