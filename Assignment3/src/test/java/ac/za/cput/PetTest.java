package ac.za.cput;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    private Pet cat = new Pet("Milkshakes");

    @Test
    public void getName() {

        assertEquals("Milkshakes", cat.getName());
    }
    @Test
    public void Ages(){

        Pet cat = new Pet(5);
        Pet dog = new Pet(5);
        assertSame(cat.getAge(), dog.getAge());
    }
    @Ignore
    @Test (timeout = 23250)
    public void beforePlay(){

        assertFalse(cat.isHappy());
    }
    //failing test. assertFalse needs to be assertTrue to pass the test
    @Test
    public void afterPlay(){

    cat.playWithToy();
    //assertFalse(cat.isHappy());
        assertTrue(cat.isHappy());

    }

}