import Instruments.Guitar;
import MiscellaneousItems.RickenbackerGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RickenbackerGuitarItemTest {

    Guitar guitar;
    RickenbackerGuitar rickenbackerGuitar;

    @Before
    public void before() {
        guitar = new Guitar("Guitar", "semi-acoustic", "maple", 12, 24);


    rickenbackerGuitar = new RickenbackerGuitar("Rickenbacker 330FG","Perfect for folk and folk rock players","Rickenbacker",8,999.99,1299.99,0,guitar);

}


    @Test
    public void hasName() {
        assertEquals("Rickenbacker 330FG", rickenbackerGuitar.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("Perfect for folk and folk rock players", rickenbackerGuitar.getDescription());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Rickenbacker", rickenbackerGuitar.getManufacturer());
    }

    @Test
    public void hasQuantity(){
        assertEquals(8, rickenbackerGuitar.getQuantity());
    }

    @Test
    public void hasWholesalePrice(){
        assertEquals(999.99, rickenbackerGuitar.getWholesalePrice(), 0);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(1299.99, rickenbackerGuitar.getRetailPrice(), 0);
    }

    @Test
    public void hasUnitsSold(){
        assertEquals(0, rickenbackerGuitar.getUnitsSold());
    }

    @Test
    public void hasGuitar(){
        assertEquals(guitar, rickenbackerGuitar.getGuitar());
    }

    @Test
    public void markupAccurate(){assertEquals(1.30, rickenbackerGuitar.calculateMarkup(),0.05);}

    }

