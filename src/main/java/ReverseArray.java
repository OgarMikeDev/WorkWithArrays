public class ReverseArray {
    public static void main(String[] args) {
        String[] arrayLetters = {"a", "b", "c", "d"};
        StringBuilder stringBuilder = new StringBuilder();

        for (String currentLetter : arrayLetters) {
            stringBuilder.append(currentLetter);
        }

        stringBuilder.reverse();
        String reverseLettersStr = String.valueOf(stringBuilder);
        System.out.println(reverseLettersStr);

        for (int i = 0; i < reverseLettersStr.length(); i++) {
            arrayLetters[i] = String.valueOf(reverseLettersStr.charAt(i));
            System.out.println(arrayLetters[i]);
        }
    }
}
