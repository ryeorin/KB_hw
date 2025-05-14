package ch04.exam;

public class Triangle2 {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {           // 줄 수
            for(int j = 0; j < i; j++) {        // 별 개수
                System.out.print("*");
            }
            System.out.println();              // 줄바꿈
        }
    }
}
