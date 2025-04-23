package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        System.out.println("현재 시간 : " + now.format(dtf));
    }
}
