
package week04;

public class DemoBS {
    public static void main(String[] args) {
        int[] a={1,2,3,5,6,7,8,10,12,13,15,16,18,19,20,22};
        int x=19;
        int i=1;
        int j=a.length;
        while (i<j){
            int m = (int)Math.floor((i+j)/2);
            if (x>a[m]) 
                i=m+1;
            else 
                j=m;
        }
        if (x==a[i])
            System.out.println(i);
        else 
            System.out.println(0);
    }
}
