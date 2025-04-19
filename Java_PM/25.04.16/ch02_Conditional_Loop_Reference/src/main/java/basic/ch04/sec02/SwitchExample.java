package basic.ch04.sec02;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) + 1;
        Random rand =new Random();

        num = rand.nextInt(6) + 1;
        switch(num){
            case 1:
            System.out.println(num + "번이 나왔습니다.");
                break;
            case 2:
                System.out.println(num + "번이 나왔습니다.");
                break;
            case 3:
                System.out.println(num + "번이 나왔습니다.");
                break;
            case 4:
                System.out.println(num + "번이 나왔습니다.");
                break;
            case 5:
                System.out.println(num + "번이 나왔습니다.");
                break;
            case 6:
                System.out.println(num + "번이 나왔습니다.");
                break;
        }

    }
}
