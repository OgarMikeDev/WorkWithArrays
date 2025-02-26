import java.util.Arrays;

public class ReverseArray {
    private static String[] arrayLetters = {"a", "b", "c", "d"};

    public static void main(String[] args) {
//        arrayLetters = reverseWithStringBuilder(arrayLetters);
//        System.out.println(Arrays.toString(arrayLetters));

        reverse(arrayLetters);
        System.out.println(Arrays.toString(arrayLetters));
    }


    public static String[] reverse(String[] array) {
        /*
        Изначальный массив - "a", "b", "c", "d"
        Конечный массив - "d", "c", "b", "a"
         */

//        for (int i = 0; i < array.length / 2; i++) {
//            String temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }

        //Вариативный способ
        int endIndex = array.length - 1;
        for (int startIndex = 0; startIndex < endIndex; startIndex++, endIndex--) {
            String temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
        return array;
    }

    public static String[] reverseWithStringBuilder(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String currentLetter : arrayLetters) {
            stringBuilder.append(currentLetter);
        }

        stringBuilder.reverse();
        String reverseLettersStr = String.valueOf(stringBuilder);
//        System.out.println(reverseLettersStr);

        for (int i = 0; i < reverseLettersStr.length(); i++) {
            arrayLetters[i] = String.valueOf(reverseLettersStr.charAt(i));
//            System.out.println(arrayLetters[i]);
        }
        return arrayLetters;
    }
}
