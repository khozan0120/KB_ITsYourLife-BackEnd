package basic.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Computer computer = new Computer();
        Calculator calculator = new Calculator();

        System.out.println("Computer 의 원의 계산 : " + computer.areaCircle(r));
        System.out.println("Calculator 의 원의 계산 : " + calculator.areaCircle(r));
    }
}
