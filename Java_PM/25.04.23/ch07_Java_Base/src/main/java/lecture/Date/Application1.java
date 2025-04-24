package lecture.Date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
//        Date 년도 설정 문제
        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println("Date setYear(2025) -> 실제 출력 : " + legacyDate);
//        Calendar 0월부터 시작 +1을 해줘야하기때문에 헷갈려서 잘 안씀
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,24);
        System.out.println("Calender.set(2025,3,23) ->  실제 월 :  " + cal.getTime());
    }
}
