package basic.ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char ch = ssn.charAt(6);

        if(ch == '1' || ch =='3'){
            System.out.println("남자입니다.");
        }else if(ch == '2' || ch =='4') {
            System.out.println("여자입니다.");
        }


    }
}
//chat at -> 문자열의 n번째 문자 하나를 반환해주는 메서드
//사용방법 - > 문자.charAt(인덱스);
//char 타입으로 변환)