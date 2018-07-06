package MiscellaneousItems;

import Instruments.Guitar;
import Instruments.ISell;

public class RickenbackerGuitar extends Item implements ISell {

    String name;
    String description;
    String manufacturer;
    int quantity;
    double wholesalePrice;
    double retailPrice;
    int unitsSold;
    Guitar guitar;

    public RickenbackerGuitar(String name, String description, String manufacturer, int quantity, double wholesalePrice, double retailPrice, int unitsSold, Guitar guitar){
        super(name, description, manufacturer, quantity, wholesalePrice, retailPrice, unitsSold);
        this.guitar = guitar;
    }

    public Guitar getGuitar(){
        return this.guitar;
    }

    @Override
    public double calculateMarkup() {
        return getRetailPrice()/getWholesalePrice();
    }
}
