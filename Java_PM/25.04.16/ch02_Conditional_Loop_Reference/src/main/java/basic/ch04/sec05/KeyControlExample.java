package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = 0;
        boolean run = true;
        while(run){
            System.out.println("-----------------------------");
            System.out.println("1.증속 | 2. 감속 | 3. 중지");
            System.out.println("----------------------------");
            System.out.println("선택 : ");

        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                speed++;
                System.out.println("현재 속도 = " + speed);
                break;
            case 2:
                if(speed >0){
                    speed--;
                }
                System.out.println("현재 속도 = " + speed);
                break;
            case 3:
                run = false;
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
