import java.util.Arrays;

public class MainForArrays {
    public static void main(String[] args) {
        int[] arrayNumbers = {2, 9, 3};

        //Сортировка массива через класс Arrays и метод sort
        Arrays.sort(arrayNumbers);

        System.out.println("Сортированные элементы массива: ");
        for (int currentNumber : arrayNumbers) {
            System.out.println(currentNumber);
        }

        //Преобразование в строку массива через класс Arrays и метод toString
        String textNumbers = Arrays.toString(arrayNumbers);
        System.out.println("Преобразованные элементы массива в текст: " + textNumbers.replaceAll("[\\[\\]]", ""));

        //Сравнение массивов через класс Arrays и метод equals
        int[] secondArrayNumbers = arrayNumbers;
        boolean isEqualsArrays = Arrays.equals(arrayNumbers, secondArrayNumbers);
        System.out.println("Равны ли массивы: " + isEqualsArrays);

        //Замена элементов в массиве через класс Arrays и метод fill
        int[] arrayIntegerNumbers = {2, 5, 1};
        Arrays.fill(arrayIntegerNumbers, 0, 3, 43);
        System.out.println("Замена элементов массива c начального до конечного индексов элементами с одинаковым значением:");
        for (int currentIntegerNumber : arrayIntegerNumbers) {
            System.out.println(currentIntegerNumber);
        }

        //Копирование элементов в массиве через класс Arrays и метод copyOfRange
        int[] arrayIntegerNumbersForCopy = {2, 5, 1, 2, 1, 4};
        int[] copyArray = Arrays.copyOfRange(arrayIntegerNumbersForCopy, 1, arrayIntegerNumbersForCopy.length - 1);
        System.out.println("Копирование элементов массива в другой массив: ");
        for (int currentNum : copyArray) {
            System.out.println(currentNum);
        }
    }
}
