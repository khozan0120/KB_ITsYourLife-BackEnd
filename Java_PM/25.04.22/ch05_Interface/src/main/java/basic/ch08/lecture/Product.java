package basic.ch08.lecture;

public class Product implements InterProduct{
    @Override
    public void noStaticmethod() {
        System.out.println("InterProduct.의 nonStaticMethod 오버라이딩한 메소드 호출....!!!");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct.의 abstMethod 오버라이딩한 메소드 호출....!!!");
    }

    @Override
    public void defaultMethod() {
        System.out.println("InterProduct.의 defaultMethod 오버라이딩한 메소드 호출....!!");
    }

    @Override
    public void staticMethod() {
        System.out.println("InterProduct.의 staticMethod 오버라이딩한 메소드 호출....!!");
    }
}
