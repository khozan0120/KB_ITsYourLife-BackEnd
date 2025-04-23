package ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum = 0;

        for(int i = 1 ; i <= 1000000; i++) {
            sum += i;
        }
        long time2 = System.nanoTime();

        System.out.println("계산한 결과 : "  + sum);
        System.out.println("계산 걸린 시간은 " + (time2-time1) +"입니다." );
    }
}
