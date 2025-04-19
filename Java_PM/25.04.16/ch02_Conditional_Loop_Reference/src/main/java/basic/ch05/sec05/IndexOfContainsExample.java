package basic.ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int x = subject.indexOf("프로그래밍");
        System.out.println(x);
        if(subject.indexOf("자바") != -1){
            System.out.println("자바 관련 책입니다.");
        }
    }
}


//문자 or 문자열의 위치를 찾는다. -> .indexOf()