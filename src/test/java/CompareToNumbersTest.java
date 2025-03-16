import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompareToNumbersTest {

    @Test
    @DisplayName("Сравнение двух чисел между собой")
    public void testCompareToNumbers() {

        boolean result = CompareTwoNumbers.compareNumbers(3,4);

        assertEquals(false, result);
   }
}
