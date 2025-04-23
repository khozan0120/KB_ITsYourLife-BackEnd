package lecture.exception.section03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /*
        * try - with - resource
        * - close 해줘야하는 인스턴스의 경우 try 옆에 소괄호 안에서 생성하면
        * 해당 try-catch블럭이 완료될때 자동으로 close
        * */


        try {
            BufferedReader in = null;
            in = new BufferedReader(new FileReader("hello.txt"));

            String s;

            in.close();

            while((s = in.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생!");

        } catch (IOException e){
            System.out.println("IO Exeption 발생!");
        }
    }
}
