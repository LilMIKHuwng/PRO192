
package Shapes;

class Circle extends Shape{
    double r;
    public Circle (double rr) {r = rr;}
    @Override
    public double ChuVi() { return 2*Math.PI*r; }
    @Override 
    public double DienTich() { return Math.PI*r*r; }
    
}
