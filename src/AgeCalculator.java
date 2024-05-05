// Importing Area
import java.util.Scanner;

// That's a Class of Age Calculator
public class AgeCalculator {
    // This method runs all the java application
    public static void main(String[] args){

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Getting the current year from the system
        int currentYear = 2024;
        // Showing the message to the user to type your born year
        System.out.print("Informe o seu ano de nascimento: ");
        // Getting the born year of the user
        int bornYear = input.nextInt();

        // Calculating the user age
        int age = currentYear - bornYear;
        // Showing a message to the user with your age information
        System.out.printf("Com base nessa informação, sua idade é de %d anos", age);

    }
}
