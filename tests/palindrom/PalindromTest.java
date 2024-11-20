package palindrom;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {
    Palindrom p= new Palindrom();

    @Test
    void elsotest(){
        assertTrue(p.isPalindrome("maoam"));
    }
    @Test
    void masodiktest(){
        assertFalse(p.isPalindrome("libikoka"));
    }
}