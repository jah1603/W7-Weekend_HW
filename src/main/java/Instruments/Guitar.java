package Instruments;

public class Guitar extends Instrument implements IPlay {

    String name;
    String type;
    String wood;
    int numberOfStrings;
    int numberOfFrets;

    public Guitar(String name, String type, String wood, int numberOfStrings, int numberOfFrets) {
        super(name, type);
        this.wood = wood;
        this.numberOfStrings = numberOfStrings;
        this.numberOfFrets = numberOfFrets;
    }

    public String getWood(){
        return this.wood;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }

    public int getNumberOfFrets(){
        return this.numberOfFrets;
    }

    @Override
    public String makeSound() {
        return "Strumming and plucking of strings ensues...";
    }
}
