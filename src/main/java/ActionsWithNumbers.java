public class ActionsWithNumbers {

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static double division(int number1, int number2) {
        if (number2 == 0 ) {
            throw new ArithmeticException("Деление на 0 запрещено");
        }
        return (double) number1 / number2 ;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }
}