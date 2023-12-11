package week04;

public class DemoTry {

    public static void main(String[] args) {

        int x = 10;
        int y = 0;
        try {
            System.out.println("Result: " + (x / y));
        } catch (Exception e) {
            System.out.println(e);
            //có thể bỏ trống để catch bỏ qua
        } finally {
            y = 2;
            System.out.println("Result: " + (x / y));
        }

        System.out.println("Successfully");
    }
}
