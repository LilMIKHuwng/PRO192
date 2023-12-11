
public class ArbitrayDemo {
    public double sum(double... group){
        double S=0;
        for (double x:group) S+=x;
        return S;
    }
    public String concate(String... group){
        String S="";
        for (String x:group) S+=x+" ";
        return S;
    }
    public static void main(String[] args) {
        ArbitrayDemo obj = new ArbitrayDemo();
        double total = obj.sum(5,6,7,8,9);
        System.out.println(total);
        String line = obj.concate("I","love","you","!");
        System.out.println(line);
    }
}
