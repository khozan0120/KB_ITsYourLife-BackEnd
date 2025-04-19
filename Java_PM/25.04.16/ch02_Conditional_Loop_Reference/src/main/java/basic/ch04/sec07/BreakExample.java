package basic.ch04.sec07;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {

        Random rand =new Random();

        while (true){
            int num = (int)(Math.random()*6) + 1;
            num = rand.nextInt(6) + 1;
            System.out.println(num);

            if(num ==6){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
