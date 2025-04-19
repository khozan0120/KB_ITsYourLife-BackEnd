package basic.ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";
        System.out.println("strVar1 과  strVar2의 참조결과 :" +(strVar1 == strVar2));
        System.out.println("strVar1 과  strVar2의 문자열값 :" +(strVar1.equals(strVar2)));

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        System.out.println("strVar1 과  strVar2의 참조결과 :" +(strVar3 == strVar4));
        System.out.println("strVar1 과  strVar2의 문자열값 :" +(strVar3.equals(strVar4)));
    }
}
