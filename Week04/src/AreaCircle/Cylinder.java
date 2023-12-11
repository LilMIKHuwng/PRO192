
package AreaCircle;

public class Cylinder extends Circle{
    int heght;

    public Cylinder(int heght, int r) {
        super(r);
        this.heght = heght;
    }

    public int getHeght() {
        return heght;
    }

    public void setHeght(int heght) {
        this.heght = heght;
    }
    
    public double Area(){
        return 2*r*heght*Math.PI;
    }
    public void print(){
        System.out.println("Area Cylinder: "+Area());
    }
}
