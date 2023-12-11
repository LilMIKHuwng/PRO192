
public class Demo05 {
    public static void main(String[] args) {
        int a[] = {4, 1, 9, 2, 12, 8, 20};
        

        //vòng lặp foreach: không làm thay đổi giá trị phần tử
        for (int pt:a) {
            pt+=100;
        }
        System.out.println("");

        for (int pt:a) {
            System.out.print(pt + "\t");
        }
        System.out.println("");
    }
}
