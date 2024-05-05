// Importing Area
import java.util.Scanner;

// That's a Class of Body Mass Index Calculator
public class BodyMassIndexCalculator {
    // This method run all the java application
    public  static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing a message to the user to type your height
        System.out.print("Informe sua altura em metros: ");
        // Getting the height value of the user
        float height = input.nextFloat();
        // Showing a message to the user to type your weight
        System.out.print("Informe o seu peso em Kg: ");
        // Getting the weight value of the user
        float weight = input.nextFloat();

        // Calculating the body mass index of the user
        float result = weight / (height * height);
        // Showing the result in the screen
        System.out.printf("O índice de massa corpórea do usuário é de %.2f kg/m²%n", result);
        System.out.printf("Com base nas informações de peso: %.2f kg e altura: %.2f m²", weight, height);

    }
}
