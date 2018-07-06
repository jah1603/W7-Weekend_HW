import Instruments.ISell;
import MiscellaneousItems.*;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop(ArrayList stock) {
        this.stock = new ArrayList<>();
    }

    public int countStock() {
        return this.stock.size();
    }

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }

    public double calculatePotentialProfit() {
        double total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup() * item.getWholesalePrice() * item.getQuantity();
        }

        return total;
    }
}
