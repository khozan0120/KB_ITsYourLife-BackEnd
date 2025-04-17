package basic.ch01.sec11;

public class VariableInitializationExample {
    public static void main(String[] args) {
//        int value; -> 변수 초기화 X, 이렇게 쓰지말자.
        int value = 10;
        int result = value + 10;

        System.out.println("result : " + result);
    }
}
