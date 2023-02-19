public class Sandwich extends FastFoodObject implements FastFood {

    String bread;


    public Sandwich(String name, String taste, int size, boolean tomato, String bread) {
        super(name, taste, size, tomato);
        this.bread = bread;
        System.out.println(name + " has the taste of " + taste + " and uses " + bread);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
