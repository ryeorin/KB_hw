package ch06.exam;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }
    public static String read(String title, String defaultValue) {
        System.out.print(String.format("%s(%s):",title,defaultValue));
        String answer = sc.nextLine();

        return answer.isEmpty() ? defaultValue : answer;
    }
    public static int readInt(String title) {
        System.out.print(title);
        int answer = sc.nextInt();
        sc.nextLine();
        return answer;
    }
    public static boolean confirm(String title, boolean defaultValue) {
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.print(String.format("%s %s",title,yesNo));

        String answer = sc.nextLine();
        if (answer.isEmpty())
            return defaultValue;
        return answer.equalsIgnoreCase("y");
    }
    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}
