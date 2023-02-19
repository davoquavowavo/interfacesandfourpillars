public abstract class FastFoodObject implements FastFood{

    String name;
    String taste;

    int size;

    boolean tomato;

    public FastFoodObject(String name, String taste, int size, boolean tomato){
        this.name = name;
        this.taste = taste;
        this.size = size;
        this.tomato = tomato;
    }
}
