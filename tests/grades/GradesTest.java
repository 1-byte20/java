package grades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradesTest {

    Grades c = new Grades();

    @Test
    void NinetyFivePoints() {
        assertEquals('A', c.determineLetterGrade(95));
    }

    @Test
    void EightyFivePoints() {assertEquals('B',c.determineLetterGrade(85));}

    @Test
    void SeventyFivePoints() {assertEquals('C',c.determineLetterGrade(75));}

    @Test
    void SixtyFivePoints() {assertEquals('D',c.determineLetterGrade(65));}

    @Test
    void FiftyFivePoints() {assertEquals('E',c.determineLetterGrade(55));}

    @Test
    void FourtyFivePoints() {assertEquals('F',c.determineLetterGrade(45));}
}