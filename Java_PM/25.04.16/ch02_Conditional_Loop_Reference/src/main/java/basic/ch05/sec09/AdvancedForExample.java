package basic.ch05.sec09;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;

        for(int score : scores){
            sum += score;
        }
        double avg = sum /scores.length;
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}

// 향상된 for문 기본 문법
// for(자료형 변수명 : 배열명){}