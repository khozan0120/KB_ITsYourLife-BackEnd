package basic.ch07.sec10.lecture;

public abstract class Product {

//    필드를 가질수 있다.
    private int nonStaticField;
    private static int StaticField;

//    생성자를 가질수 있다.
    public  Product () {
    }

//    메소드 선언
    public abstract void  abstMethod();
    public  void nonStaticMethod() {
        System.out.println("추상클래스안의 nonStaticMethod() 호출됨!");
    }

    public static  void StaticMetod(){
        System.out.println("추상클래스안의 StaticMethod() 호출됨!");
    }
}
