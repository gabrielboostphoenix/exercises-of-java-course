// Importing Area
import java.util.Scanner;

// That's a class to converter the Celsius temperature to Fahrenheit temperature
public class TemperatureConverter {
    // This method runs all the java application
    public static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing a message to the user type the temperature number
        System.out.print("Quantos graus está fazendo agora? ");
        // Getting the number value of Celsius temperature
        int celsiusTemperature = input.nextInt();
        // Converting the Celsius to Fahrenheit
        double fahrenheitTemperature = celsiusTemperature * 1.8 + 32;
        // Showing the calculation result like a Fahrenheit temperature
        System.out.printf("Os graus em celsius convertidos são %.1f°F", fahrenheitTemperature);
        // Closing the input keyboard where isn't possible to enter with more values
        input.close();

    }
}
