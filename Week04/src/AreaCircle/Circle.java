
package AreaCircle;

public class Circle {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    public double Area(){
        return Math.PI*r*r;
    }
    
    public void print(){
        System.out.println("Area Circle: "+Area());
    }
    
}
