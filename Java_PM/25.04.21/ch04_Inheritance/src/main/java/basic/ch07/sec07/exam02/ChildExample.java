package basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
//        자식 타입 객체 생성
        Child child = new Child();
//        부모타입 -> child를 업캐스팅
        Parent parent = child; // 다형성 -> 부모, 자식 method2 존재

        parent.method1(); // 출력값 : Parent-method1(), Parent에 있음
        parent.method2(); // 출력값 : Child-method2(), Parent에 있음, 단 Child에서 오버라이드 되었으니 Child의 method2()가 호출됨
//        parent.method3() -> 호출 불가능 , Parent에는 method3()이 없기 때문에 컴파일 에러 발생
    }
}
