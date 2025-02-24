import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Массив, в кот-м сразу известны значения элементов
//        char[] arrayChars = {'A', 'b', 'c'};
//        for (int index = 0; index < arrayChars.length; index++) {
//            char currentChar = arrayChars[index];
//            int numberCurrentChar = (int) currentChar;
//            System.out.println(numberCurrentChar + " - " + currentChar);
//        }

        //Массив, в кот-м сразу неизвестны значения элементов
//        int[] countApartmentInHouse = new int[5];
//        countApartmentInHouse[0] = 5;
//        countApartmentInHouse[1] = 5;
//        countApartmentInHouse[2] = 5;
//        countApartmentInHouse[3] = 5;
//        countApartmentInHouse[4] = 2;
//
//        for (int currentCountApartmentInFloor : countApartmentInHouse) {
//            System.out.println(currentCountApartmentInFloor);
//        }

        //Многомерные массивы
//        int[][] arrayRoomsInApartmentsAndFloors = new int[2][];
//        arrayRoomsInApartmentsAndFloors[0] = new int[]{2, 5, 1};
//        arrayRoomsInApartmentsAndFloors[1] = new int[]{3, 2, 4, 1};

        int[][] arrayRoomsInApartmentsAndFloors = {
                {4, 1, 2},
                {3, 5, 1, 1}
        };

        for (int indexFloor = 0; indexFloor < arrayRoomsInApartmentsAndFloors.length; indexFloor++) {
            System.out.println("Этаж " + (indexFloor + 1) + ":");
            for (int indexCountRoomsInCurrentApartment = 0; indexCountRoomsInCurrentApartment < arrayRoomsInApartmentsAndFloors[indexFloor].length; indexCountRoomsInCurrentApartment++) {
                System.out.println("Текущая квартира и кол-во комнат в ней: " + arrayRoomsInApartmentsAndFloors[indexFloor][indexCountRoomsInCurrentApartment]);
            }
            System.out.println();
        }
    }
}
