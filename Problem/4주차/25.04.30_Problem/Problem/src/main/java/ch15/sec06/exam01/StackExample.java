package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coin = new Stack<>();

        coin.push(new Coin(100));
        coin.push(new Coin(50));
        coin.push(new Coin(500));
        coin.push(new Coin(10));

        while (!coin.isEmpty()){
            Coin coin1 = coin.pop();
            System.out.println("꺼내온  동전 : " + coin1.getValue() + "원");
        }
    }
}
