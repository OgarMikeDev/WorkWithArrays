import java.util.Random;

public class Hospital {
    public static void main(String[] args) {
        float startTemperature = 32.0f;
        float endTemperature = 40.0f;

        for (int i = 0; i < 100; i++) {
            //Формирование температуры в пределах от 32.0 до 40.0 - 33.117928
            float randomTemperature = startTemperature + ((float) (Math.random() * ((endTemperature - startTemperature) + 1)));
            if (randomTemperature > 40) {
                randomTemperature = 40.0f;
            }

            //3 знака - 329
            int intRandomTemperature = (int) (randomTemperature * 10);

            //Температура с одним знаком после точки - 32.9
            float finalTemperature = ((float) intRandomTemperature) / 10.0f;

            System.out.println(finalTemperature);
        }
    }
}
