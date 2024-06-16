// Importing Area
import java.util.Scanner;

// That's a class of counter that shows all the even numbers
public class CounterOfEvenNumbers {
    // This method runs all the java application
    public static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing a message to the user to enter with a number value
        System.out.print("Informe um número inteiro qualquer: ");
        // Getting a random number value from the user
        int limitNumber = input.nextInt();
        // Creating a counter variable to control the loop
        int counter = 1;
        // Starting the counting by 1 until the received number from user
        while (counter <= limitNumber) {
            // Checking if the number is even to show it
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            // Incrementing the counter variable
            counter++;
        }

    }
}
