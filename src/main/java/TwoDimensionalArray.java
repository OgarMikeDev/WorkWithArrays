import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("Введите размер квадратного массива: ");
        int size = new Scanner(System.in).nextInt();
        char[][] squareArrayChars = getTwoDimensionalArray(size);

        for (int indexRow = 0; indexRow < squareArrayChars.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < squareArrayChars[indexRow].length; indexColumn++) {
                System.out.print(squareArrayChars[indexRow][indexColumn]);
            }
            System.out.println();
        }
    }
    public static char[][] getTwoDimensionalArray(int size) {
        char[][] squareArrayChars = new char[size][size];

        for (int indexRow = 0; indexRow < squareArrayChars.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < squareArrayChars[indexRow].length; indexColumn++) {
                //indexRow == squareArrayChars.length - 1 - indexColumn
                if (indexRow == indexColumn || indexRow + indexColumn == squareArrayChars.length - 1) {
                    squareArrayChars[indexRow][indexColumn] = 'X';
                } else {
                    squareArrayChars[indexRow][indexColumn] = ' ';
                }
            }
        }
        return squareArrayChars;
    }
}
