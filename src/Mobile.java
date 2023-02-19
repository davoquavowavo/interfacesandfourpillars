import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mobile extends ComputerObject implements Computer {


    String camera;

    String screenSize;

public Mobile(String name, int price, String bytes, String camera, String screenSize){
    super(name, price, bytes);
    this.camera = camera;
    this.screenSize = screenSize;
    System.out.println(name + " is working");
}

    @Override
    public String getName() {
        System.out.println(name);
        return name;
    }

    @Override
    public double getPrice() {
        System.out.println(price);
        return price;
    }

    @Override
    public ArrayList<String> getFeatures() {
        ArrayList<String> features = new ArrayList<>();
        features.add(bytes);
        features.add(camera);
        features.add(screenSize);
        System.out.println(features);
        return features;
    }
}
