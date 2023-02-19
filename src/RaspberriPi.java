import java.util.ArrayList;

public class RaspberriPi extends ComputerObject implements Computer {

String processor;



    public RaspberriPi(String name, int price, String bytes, String processor) {
        super(name, price, bytes);
        this.processor = processor;
        System.out.println(name + " is working");
    }

    @Override
    public String getName() {
        this.name = name;
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
        features.add(processor);
        System.out.println(features);
        return features;
    }
}
