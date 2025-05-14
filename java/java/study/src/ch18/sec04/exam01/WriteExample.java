package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("C:/Users/flsk2/Desktop/KB It's/study/KB_ass/java/study/src/ch18/sec04/exam01/test.txt");

            char a = 'A';
            char b = 'B';
            char[] arr = {'C', 'D', 'E'};

            writer.write(a);
            writer.write(b);
            writer.write(arr);

            writer.write("FGH");
            writer.flush();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
