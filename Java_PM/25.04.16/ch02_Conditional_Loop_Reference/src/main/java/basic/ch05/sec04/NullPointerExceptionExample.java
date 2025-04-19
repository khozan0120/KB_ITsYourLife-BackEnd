package basic.ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
//        int [] intArray = null;
        int [] intArray = new int[3]; // 이렇게 쓰면 오류X
        intArray[0] = 10;
//      intArray의 값은 null이여서 아무것도 가르키고 있지 않다.
//      여기에다가 배열의 값을 추가려고하니 오류가 난다.

//        String str =null;
        String str = "hello"; // 이런식이면 오류가 나지 않는다.
        System.out.println("총 문자 수 : " + str.length());
        // str은 null로 아무것도 가르키고 있지 않다.
    }
}
