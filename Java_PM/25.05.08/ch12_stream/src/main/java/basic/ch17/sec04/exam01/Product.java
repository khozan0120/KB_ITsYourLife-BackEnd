package basic.ch17.sec04.exam01;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    private  int pno;
    private String name;
    private String company;
    private int price;
}
