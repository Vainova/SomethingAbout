public class Factorial {
    public static int  findFactorial(int number, int factorial) {
        for (int i = 1; i <= number; i++) {
            factorial *= i ;
        }
        return factorial;
    }
}
