package advanced.ch16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        Member m1 = person.getMember1(Member :: new);
        System.out.println(m1);
        System.out.println();
        Member m2 = person.getMember2(Member :: new);
        System.out.println(m2);
    }
}




//객체 지향 코드 설계의 2대 원칙
//- 결합도 낮게 설계
//-> 특정한 클래스를 설정x
//-> 여러개의 클래스가 조립되도록 설정하는 방법
//
//
//
//-응집도 높게 설계
//-> 하나의 클래스에는 하나의 역할만
//-> 입력용 클래스, db처리용 클래스, 전달용 클래스를
//각각의 용도에 맞게 각각 클래스로 분리시켜 만들어놓아야
//다양하게 조립할 수 있다.
//        -> 하나의 클래스가 어떤 역할을 하는지에 대한