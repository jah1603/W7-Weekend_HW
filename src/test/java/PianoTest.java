import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha DGX650", "digital piano", "mahogany", 50);
    }

    @Test
    public void hasName(){
        assertEquals("Yamaha DGX650", piano.getName());
    }

    @Test
    public void hasType(){
        assertEquals("digital piano", piano.getType());
    }


    @Test
    public void hasWood(){
        assertEquals("Mahogany", piano.getWood());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(50, piano.getNumberOfKeys());
    }

}
