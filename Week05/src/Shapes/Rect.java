
package Shapes;

class Rect extends Shape{
    double l,w;
    public Rect(double ll, double ww){
        l=ll; w=ww;
    }
    @Override
    public double ChuVi() { return 2*(l+w); }
    @Override
    public double DienTich() { return l*w; }
}
