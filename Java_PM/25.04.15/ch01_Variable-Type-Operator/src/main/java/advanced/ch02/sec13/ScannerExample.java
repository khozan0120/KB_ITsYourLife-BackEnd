package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("x값 입력 : " +x);
        System.out.println("y값 입력 : " + y);
        System.out.println("x + y : " + (x+y));
    }
}
