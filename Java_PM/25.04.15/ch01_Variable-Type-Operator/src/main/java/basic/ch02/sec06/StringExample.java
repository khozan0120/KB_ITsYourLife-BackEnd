package basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name +"\n" +job);

//        \" : 큰따음표 표시
//        \' : 작은따음표 표시
        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

//        \t : 탭
        str ="번호\t이름\t직업";
        System.out.println(str);

//        \n : 줄바꿈
        str = "나는 \n자바를\n배웁니다.";
        System.out.println(str);

    }
}
