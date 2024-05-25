// Importing Area
import java.util.Scanner;

// That's a class where two integer numerical values will be added
public class AddingOfTwoIntegerNumbers {
    // This method runs all the java application
    public static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing the message to the user type the first integer number
        System.out.print("Informe o primeiro número inteiro: ");
        // Getting the first integer number that the user has typed
        int firstNumber = input.nextInt();
        // Showing the message to the user type the second integer number
        System.out.print("Informe o segundo número inteiro: ");
        // Getting the second integer number that the user has typed
        int secondNumber = input.nextInt();
        // Adding the two integer numbers and storing the result
        int result = firstNumber + secondNumber;
        // Showing the result in the screen
        System.out.printf("O resultado da soma dos valores %d e %d é %d", firstNumber, secondNumber, result);
        // Closing the input keyboard where isn't possible to enter with more values
        input.close();

    }
}