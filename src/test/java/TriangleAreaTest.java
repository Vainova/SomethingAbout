import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaTest {

    @Test(description = "Проверка расчета площади треугольника")
    public void triangleAreaTest() {
        Assert.assertEquals(TriangleArea.calculateAreaTriangle(5.0, 3.0), 7.5);
    }
}