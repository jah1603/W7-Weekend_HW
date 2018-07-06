package MiscellaneousItems;

import Instruments.ISell;

public class Capo extends Item implements ISell {

    String name;
    String description;
    String manufacturer;
    int quantity;
    double wholesalePrice;
    double retailPrice;
    int unitsSold;
    String metalType;

    public Capo(String name, String description, String manufacturer, int quantity, double wholesalePrice, double retailPrice, int unitsSold, String metalType){
        super(name, description, manufacturer, quantity, wholesalePrice, retailPrice, unitsSold);
        this.metalType = metalType;
    }

    public String getMetalType(){
        return this.metalType;
    }

    public double calculateMarkup(){
        return getRetailPrice()/getWholesalePrice();
    }

}
