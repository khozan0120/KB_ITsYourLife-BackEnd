package basic.ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입,String을 학습합니다.,홍길동";
        String[] str = board.split(",");
        String[] title = {"번호","제목","내용","성명"};

        for(int i = 0 ; i < title.length ; i++){
            System.out.println(title[i] + " : " + str[i]);
        }
    }
}
