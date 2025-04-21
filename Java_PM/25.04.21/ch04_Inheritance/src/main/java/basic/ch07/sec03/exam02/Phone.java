package basic.ch07.sec03.exam02;

public class Phone {
    //필드 선언
    public String model;
    public String color;

    public Phone(){

    } // 기본생성자
    //메서드 선언
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model,String color) 생성자 실행");
    }

    public void printModel(){
        System.out.println("부모(Phone)에서 model = " + model);
    }
}
