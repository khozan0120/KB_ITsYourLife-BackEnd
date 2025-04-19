package basic.ch05.sec05;

public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby="";

        if(hobby.equals("")){
            System.out.println("hobby 변수가 참조하는 String객체는 빈 문자열");
        }
    }
}

// 문자열을 비교할때는 .equals()
// == 이것은 참조주소를 확인할때 쓰는 방법