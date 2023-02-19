public class Raven extends Animal implements  AnimalActions {

    String featherColor;

    public Raven(String name, int nrOfLegs, boolean isMammal, String featherColor) {
        super(name, nrOfLegs, isMammal);
        this.featherColor = featherColor;
    }

    @Override
    public String makeSound() {
        System.out.println("Caaawk");
        return "Caaawk";
    }
}
