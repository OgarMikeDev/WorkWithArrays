public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] updateArray = new String[4][4];
        updateArray = getTwoDimensionalArrayParallel(updateArray);

        for (int indexRow = 0; indexRow < updateArray.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < updateArray[indexRow].length; indexColumn++) {
                System.out.print(updateArray[indexRow][indexColumn]);
            }
            System.out.println();
        }
    }

    public static String[][] getTwoDimensionalArrayParallel(String[][] array) {
        for (int indexRow = 0, indexLeftPart = 0, indexRightPart = array.length - 1; indexRow < array.length; indexRow++, indexLeftPart++, indexRightPart--) {
            for (int indexColumn = 0; indexColumn < array[indexRow].length; indexColumn++) {
                array[indexRow][indexColumn] = " ";
            }
            array[indexRow][indexLeftPart] = "X";
            array[indexRow][indexRightPart] = "X";
        }
        return array;
    }

    public static void getTwoDimensionalArray(String[][] array) {
        for (int indexRow = 0; indexRow < array.length; indexRow++) {
            for (int indexColumn = 0; indexColumn < array[indexRow].length; indexColumn++) {
                if (indexRow == indexColumn || indexRow + indexColumn == array.length - 1) {
                    array[indexRow][indexColumn] = "X";
                    System.out.print(array[indexRow][indexColumn]);
                } else {
                    array[indexRow][indexColumn] = " ";
                    System.out.print(array[indexRow][indexColumn]);
                }
            }
            System.out.println();
        }
    }
}
