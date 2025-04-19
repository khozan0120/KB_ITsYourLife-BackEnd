package advanced.Example_Loop;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int moneySum = 0;
        boolean run =true;
        while(run){
            System.out.println("---------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------");
            System.out.print("선택> ");

            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    System.out.print("예금액> ");
                    int deposit = sc.nextInt();
                    moneySum +=deposit;
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int withdraw = sc.nextInt();
                    if(moneySum < withdraw){
                        System.out.println("잔고 부족!");
                    }else{
                        moneySum -= withdraw;
                        System.out.println("출금 완료!");
                    }

                    break;
                case 3:
                    System.out.println("잔고> " + moneySum);
                    break;
                case 4:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
            }
        }
    }
}