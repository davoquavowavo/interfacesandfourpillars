import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        ComputerObject version12 = new Mobile("iPhone", 12000, "16", "newUltra", "10");

        ComputerObject mb10xd = new RaspberriPi("wiltProc", 10000, "64", "Wilto3000" );

        version12.getName();
        version12.getPrice();
        version12.getFeatures();

        mb10xd.getName();
        mb10xd.getPrice();
        mb10xd.getFeatures();

        //Exercise 2
       FastFoodObject clubSandwich = new Sandwich("Clubby", "spicy", 10, false, "rye");

       FastFoodObject margarita = new Pizza("Margy", "sweet", 16, true, true);


       clubSandwich.getName();
       margarita.getSize();

       FastFood[] fastFoods = {clubSandwich, margarita};
        for (FastFood fastFood: fastFoods) {
            System.out.println(fastFood.getName());
            System.out.println(fastFood.getSize());
        }

        Car nissan = new Car("Ludwig", "white");
        Car volvo = new Car("Bex", "blue");

        nissan.applyBrakes(14);

        volvo.changeGear(15);

        volvo.speedUp(8);


        /*
        Vehicle[] cars = {nissan, volvo};
        for (Vehicle car: cars) {
            System.out.println(car.changeGear(10));
        }
             ) {
             Virker ikke fordi de skal returne noget og ikke være void - var bare test :-)
            */

        // Exercise 3
Animal linda = new Raven("Linda", 2, false, "black");
Animal timothy = new Frog("Timothy", 4, false, 12.8);
Animal loppy = new Flea("Loppy", 6, false, 0.1);

linda.makeSound();
timothy.makeSound();
loppy.makeSound();

AnimalActions[] animals = {linda, timothy, loppy};
        for (AnimalActions animal: animals) {
            System.out.println(animal.makeSound());
        }
              //For each loop skal returne noget, kan ikke bare printe!



    }





    }
