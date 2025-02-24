import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arrayLetters = {"a", "b", "c", "d"};

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Arrays.toString(arrayLetters).replaceAll("[\\]\\[]", ""));

//        for (String currentLetter : arrayLetters) {
//            stringBuilder.append(currentLetter);
//        }

        //.replaceAll("[\\s\\,]", ", ")
        stringBuilder.reverse();
        String finalStr = stringBuilder.toString().replaceAll("[\\s][,]", ", ");
        System.out.println("Отзеркалить элементы: " + finalStr);
    }
}
