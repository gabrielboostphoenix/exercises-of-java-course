// Importing Area
import java.util.Scanner;

// That's a class that checks if the number is perfect
public class PerfectNumber {
    // This method runs all the java application
    public static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing a message to the user enter with an integer number
        System.out.print("Informe um número inteiro qualquer: ");
        // Getting the integer number through the user
        int anyNumber = input.nextInt();
        // Showing the message of the dividers to the user
        System.out.println("Os divisores deste número perfeito são: ");
        // Initializing a counter for loop
        int counter = 1;
        // Loop to find all the dividers of an integer number
        while (counter <= anyNumber) {
            // Checking if the counter is a divider of the number
            if (anyNumber % counter == 0) {
                // Checking if the counter is at the end
                if (counter == anyNumber) {
                    // Showing the formated divider of the number
                    System.out.println("fim.");
                } else {
                    // Showing the divider of the number
                    System.out.printf("%d, ", counter);
                }
            }
            // Incrementing the counter
            counter++;
        }

    }
}
