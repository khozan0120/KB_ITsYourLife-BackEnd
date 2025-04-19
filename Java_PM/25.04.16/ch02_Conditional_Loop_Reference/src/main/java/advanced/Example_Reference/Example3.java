package advanced.Example_Reference;

public class Example3 {
    public static void main(String[] args) {
        int [][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int count =0;
        //2중 for문을 이용해 첫번째 for문은 행 반복
        // 두번째 for문을 열을 반복
        for(int i = 0; i <array.length; i++){
            for(int j = 0; j <array[i].length; j++){
                sum += array[i][j]; // 합계 누적
                count++; // 계산된 배열 요수 개수 증가
            }
        }
        double avg = (double) sum/count;

        System.out.println("총합: " + sum);
        System.out.println("평균 : " + avg);
    }
}
