public class TemperatureConverter {

    /**
     * Converts a temperature from Celsius to Fahrenheit.
     * @param celsius The temperature in Celsius (float).
     * @return The temperature in Fahrenheit (float).
     */
    public static float convertCelsiusToFahrenheit(float celsius) {
        // Primitive float for calculation
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        float celsiusTemp = 25.0f;
        float fahrenheitTemp = convertCelsiusToFahrenheit(celsiusTemp);
        System.out.println(celsiusTemp + "°C is equal to " + fahrenheitTemp + "°F");
    }
}
