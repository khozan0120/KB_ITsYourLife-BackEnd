package advanced.Example_Reference;

public class Example1 {
    public static void main(String[] args) {
        int [][] array = {
                {95, 86}, // [0] -길이 2
                {83, 92, 96}, //[1] -> 길이 3
                {78, 83, 93, 87, 88} //[2] -> 길이 5
        };

        System.out.println(array.length); // 3 -> 바깥 배열의 행 개수
        System.out.println(array[2].length); // 5 -> 세 번째 행의 열 개수
    }
}
