package advanced.Example_Reference;

import java.util.Arrays;
public class Example2 {
    public static void main(String[] args) {
        int [] array = {1, 5, 3, 8, 2};
        Arrays.sort(array); // 배열 정렬
        int max =array[0]; // 첫 번째 값을 기준으로 잡기.
        for(int i =0 ; i<array.length; i++){
            if(array[i]>max){
                max =array[i]; //array[i]가 max보다 큰 값이면 max값 교체
            }
        }

        System.out.println("최댓값 : " + max);
    }
}
