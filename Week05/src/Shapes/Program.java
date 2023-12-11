
package Shapes;

public class Program {
    public static void main(String[] args) {
        Shape s,k;
        s = new Circle(5);
        System.out.println(s.DienTich());
        System.out.println(s.ChuVi());
        k = new Rect(4, 3);
        System.out.println(k.DienTich());
        System.out.println(k.ChuVi());
    }
}
