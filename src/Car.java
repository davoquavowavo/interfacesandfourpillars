public class Car implements Vehicle {

    String name;

    String color;

    public Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public void changeGear(int a) {
        if (a > 10) {
            a++;
        } else if (a < 10) {
            a--;
        }
        System.out.println(a);
    }

    @Override
    public void speedUp(int a) {
        System.out.println(a + 10);
    }

    @Override
    public void applyBrakes(int a) {
        if (a > 0) {
            a = 0;
        }
        System.out.println(a);
    }
}
