
package HCN;

public class TinhDTHCN {
    private int length;
    private int width;

    public TinhDTHCN(int length, int width) {
        if (length>0)
            this.length = length;
        else 
            this.length = 0;
        
        if (width>0)
            this.width = width;
        else 
            this.width = 0;
        
    }

    @Override
    public String toString() {
        return  "[" + length + "," + width + ']';
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int area(){
        return length*width;
    }
     
}
