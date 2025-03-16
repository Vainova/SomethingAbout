import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ActionsWithNumbersTest {
    @Test
    @DisplayName("Проверка правильности подсчета суммы")
    public void testSum() {
        int result = ActionsWithNumbers.sum(5, 5);

        assertEquals(10,result,"проверка подсчета суммы чисел прошла");
    }

    @Test
    @DisplayName("Проверка правильности вычетания чисел ")
    public void testSubtraction() {
       int result = ActionsWithNumbers.subtraction(10,5);

       assertEquals(5,result,"Проверка подсчета разности прошла");
    }

    @Test
    @DisplayName("Проверка правильности умножения чисел ")
    public void testMultiplication() {
      int result = ActionsWithNumbers.multiplication(5,5);

        assertEquals(25,result,"Проверка умножения чисел прошла");
    }

    @Test
    @DisplayName("Проверка правильности деления чисел ")
    public void testDivision() {
       double result = ActionsWithNumbers.division(27,3);

       assertEquals(9,result,"Проверка деления чисел прошла");
    }

    @Test
    @DisplayName("Проверка исключения при делении на 0")
    public void testException() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
            ActionsWithNumbers.division(27,0);
        });

        assertEquals("Деление на 0 запрещено", thrown.getMessage());
    }
}
