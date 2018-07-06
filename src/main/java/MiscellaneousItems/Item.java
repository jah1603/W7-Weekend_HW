package MiscellaneousItems;

import Instruments.Guitar;

public abstract class Item {

    String name;
    String description;
    String manufacturer;
    int quantity;
    double wholesalePrice;
    double retailPrice;
    int unitsSold;

    public Item(String name, String description, String manufacturer, int quantity, double wholesalePrice, double retailPrice, int unitsSold){
        this.name = name;
        this.description = description;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
        this.unitsSold = unitsSold;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getManufacturer(){return this.manufacturer;}

    public int getQuantity() {return this.quantity;}

    public double getWholesalePrice(){
        return this.wholesalePrice;
    }

    public double getRetailPrice(){
        return this.retailPrice;
    }

    public int getUnitsSold(){return this.unitsSold;}

}
