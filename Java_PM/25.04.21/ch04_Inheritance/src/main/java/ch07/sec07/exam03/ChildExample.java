package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
//        객체 생성 및 자동 타입 변환 -> 업캐스팅
        Parent parent = new Child();

        parent.field1="data1"; // Parent 클래스의 필드
        parent.method1(); // Parent 클래스의 메서드
        parent.method2(); // Parent 클래스에 선언된 메서드 (→ 오버라이드 되었으므로 실제
        parent.method2();

//        parent.field2 = "data2"; //-> 불가능, Parent에는 없는 필드
//        parent.method3(); //-> 불가능, Parent 클래스에 없는 메서드
//        강제 타입 변환
        Child child = (Child)parent; // 실제 객체가 Child이므로 다운캐스팅 가능
        child.field2="data2"; //Child에 정의
        child.method3(); //Child에 정의


    }
}
