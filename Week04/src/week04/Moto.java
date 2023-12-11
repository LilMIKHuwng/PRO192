
package week04;
// variable hang khai bao bang final
// phuong thuc la final thi khong dc ghi de
public /*final*/ class Moto {
    public void output(){
        System.out.println("this is moto class");
    }
}
class SH extends Moto{
    int speed;

    public SH(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    
    public static void main(String[] args) {
        SH s1 = new SH(120);
        s1.output();
        System.out.println("Speed: "+s1.getSpeed());
    }
}
