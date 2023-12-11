
package Session04;

public class Adder {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Adder s1 = new Adder();
        int c1 = s1.add(10,20);
        System.out.println("Result: "+c1);
        
        Adder s2 = new Adder();
        double c2 = s2.add(10.5,20.8);
        System.out.println("Result: "+c2);
        
        Adder s3 = new Adder();
        int c3 = s3.add(10,20,30);
        System.out.println("Result: "+c3);
        
    }
}
