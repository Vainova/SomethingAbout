import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test(description = "Проверка факториала числа")
    public void factorialTest() {
        Assert.assertEquals(Factorial.findFactorial(5, 1), 120);
    }
}