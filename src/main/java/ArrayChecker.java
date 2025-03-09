public class ArrayChecker {
    public static int checkSumArray(String[][] twoDimensionalArray) throws MyArraySizeException, MyArrayDataException {
        if (twoDimensionalArray.length != 4 || twoDimensionalArray[0].length != 4) {
            throw new MyArraySizeException("Неккоректный размер массива!Размер массива должен быть 4x4");
        }

        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(twoDimensionalArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неккоректные данные в ячейке [" + i + "][" + j + "]: "
                            + twoDimensionalArray[i][j]);
                }
            }
        }
        return sum;
    }
}
