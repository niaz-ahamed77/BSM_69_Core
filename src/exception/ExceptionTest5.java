package exception;

import java.io.File;
import java.io.FileWriter;

public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        File f = new File("abc.txt");
        try {
            FileWriter f1 = new FileWriter(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
    }
}
