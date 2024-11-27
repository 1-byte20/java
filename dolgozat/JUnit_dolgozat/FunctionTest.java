import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {
    Function f =new Function();

    @Test
    void FirstTest(){
        assertEquals(9,f.dividersNumber(3));
    }

    @Test
    void SecondTest(){
        assertEquals(17,f.dividersNumber(2));
    }

    @Test
    void ThirdTest(){
        assertEquals(38,f.dividersNumber(4));
    }

    @Test
    void FourthTest(){
        assertEquals(17,f.maxOfThree(2, 8, 17 ));
    }

    @Test
    void FifthTest(){
        assertEquals(2,f.maxOfThree(2, 0, 1 ));
    }

    @Test
    void SixthTest(){
        assertEquals(99,f.maxOfThree(72, 99, 89 ));
    }

    @Test
    void SeventhTest(){
        assertEquals("Fizz", f.fizzBuzz(6));
    }

    @Test
    void EighthTest(){
        assertEquals("Buzz", f.fizzBuzz(10));
    }

    @Test
    void NinethTest(){
        assertEquals("FizzBuzz", f.fizzBuzz(30));
    }

    @Test
    void TenthTest(){
        assertEquals(2, f.fizzBuzz(2));
    }

    @Test
    void EleventhTest(){
        assertTrue(f.isVowel('u'));
    }

    @Test
    void TwelfthTest(){
        assertTrue(f.isVowel('A'));
    }

    @Test
    void ThirtteenthTest(){
        assertFalse(f.isVowel('B'));
    }

}