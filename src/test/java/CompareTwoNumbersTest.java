import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareTwoNumbersTest {

    @Test(description = "Сравнение двух чисел")
    public void compareTwoNumbersTest() {
        Assert.assertEquals(CompareTwoNumbers.compareNumbers(10, 5), false);
    }
}