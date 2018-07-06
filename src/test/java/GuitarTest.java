import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Rickenbacker 330FG", "semi-acoustic", "maple", 12, 24);}

    @Test
    public void hasName(){
        assertEquals("Rickenbacker 330FG", guitar.getName());
    }

    @Test
    public void hasType(){
        assertEquals("semi-acoustic", guitar.getType());
    }

    @Test
    public void hasWood(){
        assertEquals("maple", guitar.getWood());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(12, guitar.getNumberOfStrings());
    }

    @Test
    public void hasNumberOfFrets(){
        assertEquals(24, guitar.getNumberOfFrets());
    }

    @Test
    public void canMakeSound(){
        assertEquals("Strumming and plucking of strings ensues...", guitar.makeSound());}

}