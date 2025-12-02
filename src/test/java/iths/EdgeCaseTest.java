package iths;
import org.junit.jupiter.api.Test;
import iths.Calculator;
import static org.junit.jupiter.api.Assertions.*;

public class EdgeCaseTest {
    @Test
    void shouldShowOverFlowWhenResultIsTooLarge(){
        int maxInt = Integer.MAX_VALUE;

        int actual = Calculator.add(maxInt, 1);

        assertEquals(Integer.MIN_VALUE, actual);

    }
}
