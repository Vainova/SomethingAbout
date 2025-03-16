import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    @DisplayName("Проверка факториала числа")
    public void factorialTest() {
        int result = Factorial.findFactorial(5,1);

        assertEquals(120,result);
    }

    @Test
    @DisplayName("Проверка на число 0 ")
    public void factorialTestByZero() {
        int result = Factorial.findFactorial(0,1);

        assertEquals(1,result);
    }
}
