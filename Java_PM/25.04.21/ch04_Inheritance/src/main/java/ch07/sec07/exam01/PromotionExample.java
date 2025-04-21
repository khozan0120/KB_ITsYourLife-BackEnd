package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        /*
        * 다형성
        * 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미
        * 하나의 타입으로 여러 타입의 인스턴스를 처리 할 수 있기도 하고
        * 하나의 메소드 호출로 각기 다른 방법으로 동작하게 할 수 있다*/
//            A
//           / \
//          B   C
//         /     \
//        D       E
        B b = new B(); // A 상속
        C c = new C(); // A 상속
        D d = new D(); // A and B 상속
        E e = new E(); // A and C 상속

//        업캐스팅
//        자식 -> 부모로 대입 시 자동 타입 형 변환이 발생(안전해서 자바에서 자동으로 해준다.)
        A a  = new A();
        A a1 = b;
//        A a1 = new B();
        A a2 = c;
//        A a2 = new C();
        A a3 = d;
//        A a3 = new D();
        A a4 = e;
//        A a4 new E();
        B b1 = d;
//        B b1 = new D();
        C c1 = e;
//        C c1 = new E();
        //상속받은 관계여서 주석처리 된걸로 써도 사용가능

//        타입 변환 A -> E -> B
        A a6 = new E();
        B b3 = (B) a6;

//        B b3 = e;
//        B b3 = new E();
//        E는 B를 상속받은것이 아니기 때문에 컴파일 에러, E -> C의 자식

//        C c2 = d;
//        C c2 = new D();
//        D는 C를 상속받은것이 아니기 때문에 컴파일 에러 , D -> B의 자식

//        다운캐스팅
//        부모 -> 자식, 가능하다는것만 알고있기, 불완전해서 사용 많이 안함
        B b6 = (B) a;
        Object o = new B();
    }

}
