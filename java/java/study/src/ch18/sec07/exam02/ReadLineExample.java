package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/flsk2/Desktop/KB It's/study/KB_ass/java/study/src/ch18/sec07/exam02/ReadLineExample.java"));

        int lineNo = 1;
        while(true) {
            String str = br.readLine();
            if (str == null) break;
            System.out.println(lineNo + "\t" + str);
            lineNo++;
        }
        br.close();
    }
}
