package advanced.ch03.sec01;

public class LogicalAndBoolean {
    public static void main(String[] args) {
        int x =10;
        int y = 5;

        System.out.println((x>7) && (y<=5)); // true
        System.out.println((x%3 == 2) || (y % 2 !=1)); //flase
    }
}
