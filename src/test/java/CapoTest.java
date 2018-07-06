import MiscellaneousItems.Capo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CapoTest {

    Capo capo;

    @Before
    public void before(){
        capo = new Capo("Ibanez electric guitar capo", "Capo for steel-stringed electric guitars", "Ibanez", 8, 4.50, 7.99, 0, "steel");
    }

    @Test
    public void hasName(){
        assertEquals("Ibanez electric guitar capo", capo.getName());
    }

    @Test
    public void hasDescription(){
        assertEquals("Capo for steel-stringed electric guitars", capo.getDescription());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Ibanez", capo.getManufacturer());
    }

    @Test
    public void hasQuantity(){
        assertEquals(8, capo.getQuantity());
    }

    @Test
    public void hasWholesalePrice(){
        assertEquals(4.50, capo.getWholesalePrice(), 0);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(7.99, capo.getRetailPrice(), 0);
    }

    @Test
    public void hasUnitsSold(){assertEquals(0, capo.getUnitsSold());}

    @Test
    public void hasMetalType(){
        assertEquals("steel", capo.getMetalType());
    }

    @Test
    public void markupAccurate(){assertEquals(1.78, capo.calculateMarkup(),0.05);}
}
