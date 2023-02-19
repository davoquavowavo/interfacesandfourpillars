public class Frog extends Animal implements AnimalActions{

    double tongueLength;
    public Frog(String name, int nrOfLegs, boolean isMammal, double tongueLength) {
        super(name, nrOfLegs, isMammal);
        this.tongueLength = tongueLength;
    }

    @Override
    public String makeSound() {
        System.out.println("Quackity Quack");
        return "Quackity Quack";
    }
}
