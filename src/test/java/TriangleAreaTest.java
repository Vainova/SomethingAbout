import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleAreaTest {

    @Test
    @DisplayName("Проверка площади треугольника")
    public void testTriangleArea() {

        double result = TriangleArea.calculateAreaTriangle(6,7);

        assertEquals(21,result);
    }
}
