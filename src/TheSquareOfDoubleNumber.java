// Importing Area
import java.util.Scanner;

// That's a class where it calculates the square of a double number
public class TheSquareOfDoubleNumber {
    // This method runs all the java application
    public static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing a message to the user type a double number
        System.out.print("Informe um valor numérico real: ");
        // Getting the double number that the user has typed
        double number = input.nextDouble();
        // Calculating the square of a double number and storing the result
        double result = Math.pow(number, 2);
        // Showing a message to the user about the calculation result
        System.out.printf("O resultado do cálculo do quadrado de %.2f é %.2f", number, result);
        // Closing the input keyboard where it's not possible to enter with more values
        input.close();

    }
}