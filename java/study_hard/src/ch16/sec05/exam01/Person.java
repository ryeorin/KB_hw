package ch16.sec05.exam01;

public class Person {
    public static void action(Calcuable calcuable) {
        double result=calcuable.cal(10,4);
        System.out.println("결과: "+result);
    }
}
