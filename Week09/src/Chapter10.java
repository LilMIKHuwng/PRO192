

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Chapter10 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("example01.txt");
            BufferedReader br = new BufferedReader(fr);
            File f = new File("example02.txt");
            PrintWriter pr = new PrintWriter(f);
            String s;
            while( (s = br.readLine()) != null){
                System.out.println(s);
                //ghi dong doc duoc ra cai file example02.txt
                pr.println(s);
            }
            pr.close();
            br.close();
            fr.close();
        } catch (Exception ex) {
            System.out.println("Error File Not Existed!!!");
        }
        System.out.println("");
    }
}
