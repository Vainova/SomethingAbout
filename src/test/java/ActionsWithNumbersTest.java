import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class ActionsWithNumbersTest {
    @Test(description = "Проверка суммы")
    public void testSum() {
        Assert.assertEquals(ActionsWithNumbers.sum(5, 6), 11);
    }

    @Test(description = "Проверка разности")
    public void testSubtraction() {
        Assert.assertEquals(ActionsWithNumbers.subtraction(10, 4), 6);
    }

    @Test(description = "Проверка деления")
    public void testDivision() {
        Assert.assertEquals(ActionsWithNumbers.division(24, 6), 4.0);
    }

    @Test(description = "Исключение при делении на 0")
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> ActionsWithNumbers.division(10, 0));
    }

    @Test(description = "Проверка умножения")
    public void testMultiplication() {
        Assert.assertEquals(ActionsWithNumbers.multiplication(4, 4), 16);
    }
}