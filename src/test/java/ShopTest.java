import Instruments.Guitar;
import Instruments.ISell;
import MiscellaneousItems.Capo;
import MiscellaneousItems.RickenbackerGuitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    RickenbackerGuitar rickenbackerGuitar;
    Capo capo;
    Guitar guitar;
    ArrayList stock;

    @Before
    public void before() {
        stock = new ArrayList<>();
        guitar = new Guitar("Guitar", "semi-acoustic", "maple", 12, 24);
        capo = new Capo("Ibanez electric guitar capo", "Capo for steel-stringed electric guitars", "Ibanez", 8, 4.50, 7.99, 0, "steel");
        rickenbackerGuitar = new RickenbackerGuitar("Rickenbacker 330FG","Perfect for folk and folk rock players","Rickenbacker",8,999.99,1299.99,0,guitar);
        shop = new Shop(stock);
    }

    @Test
    public void canCountStock(){
        assertEquals(0, shop.countStock());
        shop.addItemToStock(capo);
        shop.addItemToStock(rickenbackerGuitar);
        assertEquals(2, shop.countStock());
        shop.removeItemFromStock(capo);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addItemToStock(capo);
        shop.addItemToStock(rickenbackerGuitar);
        assertEquals(10463.84, shop.calculatePotentialProfit(), 0);
    }

}
