package basic.ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] num ={84, 90, 96};

        int sum = 0;

        for(int i =0; i < num.length; i++){
            sum += num[i];
        }

        double avg = (double) sum / num.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
