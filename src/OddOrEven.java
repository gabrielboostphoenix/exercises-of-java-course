// Importing Area
import java.util.Scanner;

// That's a class to check if the number is odd or even
public class OddOrEven {
    // This method runs all the java application
    public static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing a message to the user enter with an integer number
        System.out.print("Informe um número inteiro qualquer: ");
        // Getting the integer number through the user
        int anyNumber = input.nextInt();
        // Checking if the number is even or odd
        if (anyNumber % 2 == 0) {
            System.out.println("O número informado pelo usuário é par!");
        } else {
            System.out.println("O número informado pelo usuário é ímpar!");
        }

    }
}
