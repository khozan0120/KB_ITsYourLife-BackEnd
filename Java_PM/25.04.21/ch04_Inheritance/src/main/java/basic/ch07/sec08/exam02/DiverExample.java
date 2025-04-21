package basic.ch07.sec08.exam02;

public class DiverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.dirve(bus); // bus 객체의 run() 호출, -> 자동 업캐스팅

        Taxi taxi = new Taxi();
        driver.dirve(taxi);
    }
}
