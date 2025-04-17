package advanced.ch02.sec13;

import java.util.Scanner;
public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String str= sc.nextLine();
            System.out.println("입력 문자열 :" + str);
            if(str.equals("q")){
                break;
            }
            System.out.println("출력 문자열 : "+ str);
        }
        System.out.println("종료");
    }
}
