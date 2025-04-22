package basic.ch08.lecture;

public interface InterProduct {

    /*
    * 인터페이스는 상수 필드만 작성 가능
    *
    * 상수 필드 -> public static final -> 조합을 상수 필드 - >  선언과 동시에 초기화해야한다.
    * */
//    public static final int a = 0;
//    ex ) int a = 0; 으로만 써도 컴파일러가 알아서 앞에 public static final 을 생성, 숨어있다는걸 인지하기
    int MIN_NUM  = 10;
    int MAX_NUM = 100;

//    생성자를 가질 수 없다.
//    ex) -  public  InterProduct();

//  인터페이스는 구현부가 있는 메서드를 가질  수 없다.
//    public  void nonStaticmethod(){}

//    요놈은 허용 - why = >> static 메서드는 가질 수 있다.(java 8 버전 이후)
    public  static void Staticmethod(){
        System.out.println("InterProduct 인터페이스에서 staticMethod 호출됨...");
    }

//    추상 메소드 작성 가능
    /*
    * 인터페이스 안에 작성한 메소드는  public  abstract의 의미를 가진다.
    * public abstract가 없어도 된다.
    * 인터페이스를 상속받은 클래스는 메소드를 구현할때,
    * 접근제어자를 public으로 해야지 구현 가능함.
    * 부모 -> 자식 상속 관계에서 접근제어자를 지켜줘야해서.
    * */
    void noStaticmethod();
    void abstMethod();

//    인터페이스에서 일반 메소드를 만들기 위해서는 default 키워드를 붙여야한다.
    public  default void defaultMethod(){
        System.out.println("InterProduct 클래스의 defaultMethod  호출됨....");
    }
    public default  void staticMethod(){
        System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
    }
}
