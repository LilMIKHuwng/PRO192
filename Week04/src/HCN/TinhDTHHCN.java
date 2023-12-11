
package HCN;

public class TinhDTHHCN extends TinhDTHCN{
    private int heigh;

    public TinhDTHHCN( int length, int width, int heigh) {
        super(length, width);
        this.heigh = heigh;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public String toString() {
        return "[" + getLength() + "," + getWidth() +"," + heigh + ']';
    }
    
    public int area(){
        int l = getLength();
        int w = getWidth();
        int h = heigh;
        return 2*(l*w+w*h+h*l);
    }
    
    public int volumn(){
       return getLength()*getWidth()*heigh;
    }
}
