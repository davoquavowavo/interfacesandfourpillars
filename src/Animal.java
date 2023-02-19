public abstract class Animal implements AnimalActions {
    String name;

    int nrOfLegs;

    boolean isMammal;

    public Animal(String name, int nrOfLegs, boolean isMammal){
        this.name = name;
        this.nrOfLegs = nrOfLegs;
        this.isMammal = isMammal;
    }
}
