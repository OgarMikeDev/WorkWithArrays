public class Hospital {
    public static void main(String[] args) {
        generatePatientsTemperature();
        StringBuilder builderPatientsTemperature = new StringBuilder();

        for (float currentPatientTemperature : generatePatientsTemperature()) {
            builderPatientsTemperature.append(currentPatientTemperature + "\n");
        }
        String strPatientsTemperature = String.valueOf(builderPatientsTemperature);
        System.out.println(strPatientsTemperature);
    }

    public static float[] generatePatientsTemperature() {
        float[] arrayPatientsTemperature = new float[100];

        float startTemperature = 32.0f;
        float endTemperature = 40.0f;

        for (int i = 0; i < 100; i++) {
            float randomTemperature = startTemperature + ((float) (Math.random() * ((endTemperature - startTemperature) + 1)));
            if (randomTemperature > 40) {
                randomTemperature = 40;
            }
            arrayPatientsTemperature[i] = randomTemperature;
        }
        return arrayPatientsTemperature;
    }
}
