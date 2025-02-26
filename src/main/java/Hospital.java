public class Hospital {
    public static void main(String[] args) {
        StringBuilder allTemperatures = new StringBuilder();
        int countHealthyPatients = 0;
        float valuesTemperatures = 0f;
        int countAllTemperatures = 0;
        float averageAllTemperatures = 0f;

        for (int i = 0; i < 100; i++) {
            float start = 32.0f;
            float end = 40.0f;
            float randomTemperature = start + ((float) (Math.random() * ((end - start) + 1)));
            if (randomTemperature >= 36.2 && randomTemperature <= 36.9) {
                countHealthyPatients++;
            }
            countAllTemperatures++;
            valuesTemperatures += randomTemperature;
            allTemperatures.append(randomTemperature + "\n");
        }

        averageAllTemperatures = valuesTemperatures / countAllTemperatures;
        System.out.println("Среднее значение всех температур: " + averageAllTemperatures);
        System.out.println("Набор всех температур:\n" + String.valueOf(allTemperatures));
        System.out.println("Кол-во здоровых пациентов равно: " + countHealthyPatients);
    }
}
