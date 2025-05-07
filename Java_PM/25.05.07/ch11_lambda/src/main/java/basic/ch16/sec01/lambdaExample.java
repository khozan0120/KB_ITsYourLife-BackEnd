package basic.ch16.sec01;

public class lambdaExample {
    public static void main(String[] args) {


        /*
        * 람다식
        *
        * - 메서드를 하나의 식으로 표현해 익명함수를 생성하는 식
        * */

        /*
        * 인터페이스에 정의된 추상메서드 사용방법
        * 1. 인터페이스를 구현한 클래스를 정의하는 방법
        * 2. 익명클래스를 활용해 메소드 정의후 사용하는 방법
        * 3. 람다식 활용하는 방법
        * */

//        인터페이스 구현방법
        Calculablelmpl calculablelmpl = new Calculablelmpl();
        calculablelmpl.calculate(5,3);
        System.out.println("============================================");
        Calculable c1 = new Calculable() {
            @Override
            public void calculate(int x, int y) {
                System.out.println("익명클래스  사용 : " + (x + y));
            }
        };
        c1.calculate(5, 3);
        System.out.println("============================================");
//        람다식 사용
        Calculable c2 = (int x , int y) -> {
            System.out.println("람다식 사용 : " + (x + y));
        };
        c2.calculate(5, 3);
        System.out.println("============================================");
        action((x,y) -> {
            int result = x + y;
            System.out.println("result : " + result);
        });
        System.out.println("============================================");
        action((x,y) -> {
            int result = x - y;
            System.out.println("result : " + result);
        });
    }
    public  static  void action(Calculable calculable){
//        데이터
        int x = 20;
        int y = 10;
//        데이터 처리
        calculable.calculate(x,y);
    }
}
