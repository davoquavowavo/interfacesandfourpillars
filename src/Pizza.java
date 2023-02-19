public class Pizza extends FastFoodObject implements FastFood {

    boolean margarita;

    public Pizza(String name, String taste, int size, boolean tomato, boolean margarita) {
        super(name, taste, size, tomato);
        this.margarita = margarita;
        System.out.println(name + " has the taste of " + taste + " and is " + size + " cm in perimeter");

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
