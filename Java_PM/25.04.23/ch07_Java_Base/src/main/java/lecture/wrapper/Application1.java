package lecture.wrapper;

import org.w3c.dom.ls.LSOutput;

public class Application1 {
    public static void main(String[] args) {
        /*
         *  기본타입         래퍼클래스
         *  byte                   Byte
         *  short                Short
         *  int                   Integer
         *  long                Long
         *  float               Float
         *  double          Double
         *  char            Character
         *  boolean        Boolean
         *
         * 박싱과 언박싱
         * 박싱 : 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는거
         * 언박싱 : 래퍼클래스의 인스턴스를 기본타입으로 바꾸는 것 */

        int intValue = 10;
        //박싱
//    Integer boxingNumber1 = new Integer(intValue);
        Integer boxingNumber1 = intValue; // 박싱방법 1

        Integer boxingNumber1a = Integer.valueOf(intValue); //  정석박싱 방법

        int unBoxingNumber1 = boxingNumber1; // 오토 언박싱

        System.out.println(unBoxingNumber1);

//        ==
        Integer num1 = 10;
        Integer num2 = 10;
        int num3 = 20;

        System.out.println("Integer와  Integer 비교 : " + (num1 == num2));
        System.out.println("int와  Integer 비교 : " + (num1 == num3));

    }
}
