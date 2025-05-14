package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            // 한 글자씩
            reader = new FileReader("C:/Users/flsk2/Desktop/KB It's/study/KB_ass/java/study/src/ch18/sec04/exam01/test.txt");
            while(true) {
                int data = reader.read();
                if(data == -1) break;
                System.out.print((char)data);
            }
            reader.close();
            System.out.println();

            // 글자배열
            reader = new FileReader("C:/Users/flsk2/Desktop/KB It's/study/KB_ass/java/study/src/ch18/sec04/exam01/test.txt");
            char[] data = new char[100];
            while(true) {
                int num = reader.read(data);
                if(num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
