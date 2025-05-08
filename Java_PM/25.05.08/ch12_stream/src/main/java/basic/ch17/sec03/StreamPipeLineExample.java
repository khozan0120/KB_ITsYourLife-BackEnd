package basic.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );
//        1. 단계별로 변수에 담아 처리
//        1) List<Student> - > Stream<Student>로 변경
       Stream<Student> studentStream = list.stream();

//       2) Student의 score만 추출
        IntStream socreStream = studentStream
                .mapToInt(s -> s.getScore());

//        Stream- -> 1회성
//        IntStream socreStream2 = studentStream
//                .mapToInt(s -> s.getScore());

//        3) 평균을 계산(average())하고 Optional에서  double값을 꺼냄
        double avg1 = socreStream
                .average() // 평균을 계산 OptionalDouble반환
                // Optional(없을경우에 대한 예외처리)
                .orElseThrow(()-> new IllegalArgumentException("점수가 없음"));
//                .getAsDouble();
        System.out.println("평균 점수 : " + avg1);

//        파이프라인스타일(체이닝)
        double avg2  =list.stream()
                .mapToInt(s -> s.getScore())
                .average()
                .orElse(0.0);
//                .getAsDouble();
        System.out.println("평균 점수 : "  + avg2);

        Stream<Student> studentStream1 =list.stream();
        Stream<Student> studentStream2 =Stream.of(
                new Student("세종", 40),
                new Student("광종",30)
        );

        Stream<Student> concatStudent =Stream.concat(studentStream1,studentStream2);
        concatStudent.forEach(student -> System.out.println(student));
    }
}