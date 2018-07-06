package Instruments;
import Instruments.Instrument;

public class Piano extends Instrument implements IPlay{

    String name;
    String type;
    String wood;
    int numberOfKeys;

    public Piano(String name, String type, String wood, int numberOfKeys) {
        super(name, type);
        this.wood = wood;
        this.numberOfKeys = numberOfKeys;
    }

    public String getWood(){
        return this.wood;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    @Override
    public String makeSound() {
        return "Tinkle of ivories ensues...";
    }


}
