package basic.ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        int [] arr1 ={10,20,30};
        System.out.println(Arrays.toString(arr1));
        String[] arr2 = new String[3];
        System.out.println(Arrays.toString(arr2));

    }
}


//배열의 실제 내용을 출력
// Arrays.toString()  -> import java.util.Arrays;필요