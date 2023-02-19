public class Flea extends Animal implements AnimalActions{

    double wingSpan;
    public Flea(String name, int nrOfLegs, boolean isMammal, double wingSpan) {
        super(name, nrOfLegs, isMammal);
        this.wingSpan = wingSpan;
    }

    @Override
    public String makeSound() {
        System.out.println("Bzzz!");
        return "Bzzz!";
    }
}
