import java.util.ArrayList;
public abstract class ComputerObject implements Computer {
    String name;

    int price;

    String bytes;

     public ComputerObject(String name, int price, String bytes){
        this.name = name;
        this.price = price;
        this.bytes = bytes;
    }




}
