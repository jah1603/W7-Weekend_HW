package Instruments;

public abstract class Instrument {

    String name;
    String type;


    public Instrument(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

}
