public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2","3","4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
                };
        String[][] incorrectSizeArray = {
                {"1", "2", "3"},
                {"5", "6", "7"}
                };
        String[][] incorrectDataArray = {
                 {"1", "2", "G", "4"},
                 {"5", "6", "7", "8"},
                 {"9", "10", "11", "12"},
                 {"13", "14", "15", "16"},
                 };

        try {
            int result = ArrayChecker.checkSumArray(correctArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            ArrayChecker.checkSumArray(incorrectSizeArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            ArrayChecker.checkSumArray(incorrectDataArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }


        try {
            int[] array = new int[10];
            System.out.println(array[20]);
        } catch (ArrayIndexOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Индекс выходит за пределы массива");
        }
    }
}





