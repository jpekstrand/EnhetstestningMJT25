package iths;

import org.junit.jupiter.api.Test;
import iths.Calculator;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddOnePlusTwoEqualsThree() {
        
        assertEquals(3, Calculator.add(1, 2));
    }
    @Test
    void shouldDivideAndReturnDecimalResult(){
        double expected = 3.5;

        double actual = Calculator.divide(7,2);
        assertEquals(expected, actual);
    }
    @Test
    void shouldThrowExceptionWhenDividingByZero(){
        assertThrows(IllegalArgumentException.class, () ->{
            Calculator.divide(5, 0);
        });
    }
    @Test
    void shouldHandleSubtractionGivingNegativeResult(){
        int expected = -5;

        int actual = Calculator.subtract(5, 10);
        assertEquals(expected, actual);
    }
}
