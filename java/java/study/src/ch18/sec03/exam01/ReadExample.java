package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("C:/Users/flsk2/Desktop/KB It's/study/KB_ass/java/study/src/ch18/sec02/exam01/test1.db");

            while(true){
                int data= is.read();
                if(data==-1)break;
                System.out.println(data);
            }
            is.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
