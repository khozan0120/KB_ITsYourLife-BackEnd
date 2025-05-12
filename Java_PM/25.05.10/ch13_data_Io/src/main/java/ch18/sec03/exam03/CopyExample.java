package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws Exception {
        String originalFileNmae = "c:/TEMP/test.jpg";
        String targetFileName = "c:/TEMP/test2.jpg";

        try(
        InputStream is = new FileInputStream(originalFileNmae);
        OutputStream os = new FileOutputStream(targetFileName);
        ) {
        byte[] data  = new byte[1024];
        while (true){
            int num = is.read(data);
            if(num == -1 )break;
            os.write(data, 0 , num);
        }
        os.flush();
            System.out.println("복사가 되었습니다.");
    }  catch (Exception e){
            e.printStackTrace();
        }
    }
}
