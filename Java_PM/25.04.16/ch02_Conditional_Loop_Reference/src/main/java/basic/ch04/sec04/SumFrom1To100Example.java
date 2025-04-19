package basic.ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1; i<=100; i++){
            sum += i;
        }System.out.println("1 ~ 100 합 : " + sum);

        int j =1;
        int sum2 =0;
        while (j <= 100){
            sum2 += j;
            j ++;
        }System.out.println("1 ~ 100 합 : " + sum2);

    }
}
