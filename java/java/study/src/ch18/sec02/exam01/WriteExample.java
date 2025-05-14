package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try{
      OutputStream os = new FileOutputStream("C:/Users/flsk2/Desktop/KB It's/study/KB_ass/java/study/src/ch18/sec02/exam01/test1.db");

        byte a=10;
        byte b=20;
        byte c=30;

        os.write(a);
        os.write(b);
    }catch(IOException e){
            e.printStackTrace();
        }
        }
}
