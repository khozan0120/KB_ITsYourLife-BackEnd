package advanced.ch16.sec05.exam01;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

//        정적메소드일경우
//        람다식
//        person.action((x,y)-> Computer.staticMethod(x,y));
//        메소드참조
        person.action(Computer ::staticMethod);

//        인스턴스메소드일경우
        Computer com = new Computer();
//        람다식
//        person.action(((x, y) -> com.instanceMethod(x,y)));
//        메소드참조
        person.action(com :: instanceMethod);
    }
}
