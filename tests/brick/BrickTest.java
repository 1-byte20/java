package brick;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BrickTest {
    Brick k= new Brick();

    @Test
    void teregy(){
        assertEquals(6, k.terulet(2,3));
    }

    @Test
    void keregy(){
        assertEquals(10, k.kerulet(2,3));
    }

    @Test
    void terketto(){
        assertEquals(25, k.terulet(5,5));
    }

    @Test
    void kerketto(){
        assertEquals(20, k.kerulet(5,5));
    }

}