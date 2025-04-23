package lecture.exception.section01;

public class Application {
    public static void main(String[] args) throws Exception{
        ExceptionTest et = new ExceptionTest();

        /*
        * 예외 처리 방법
        * -> try -catch 처리
        * */
        et.checkEnoughMoney(100000,10000);
    }
}
