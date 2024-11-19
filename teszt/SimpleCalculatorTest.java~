import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator sc = new SimpleCalculator();

    @Test
    void kettoMegKettoAzNegy() {
        assertEquals(4, sc.add(2,2));
    }

    @Test
    void kettoMegHaromAzOt() {
        assertEquals(5, sc.add(2,2));
    }

    @Test
    void kettoMegKettoAzNemOt() {
        assertNotEquals(5, sc.add(2,2));
    }

    @Test
    void kettoMegMinuszKettoAzHibatDob() {
        assertNotEquals(5, sc.add(2,2));
    }

}