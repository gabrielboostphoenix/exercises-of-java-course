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
        System.out.print("Informe o ano de nascimento do usuário: ");
        // Getting the born year of the user
        int bornYear = input.nextInt();

        // Checking if the born year is invalid
        if (bornYear > currentYear) {
            System.out.print("O ano de nascimento do usuário é inválido!");
        } else {

            // Calculating the user age
            int age = currentYear - bornYear;
            // Showing a message to the user with your age information
            System.out.printf("Com base nessa informação, a idade deste usuário é de %d anos%n", age);

            // Checking the user age to show a specific message about your age category
            if (age >= 0 && age <= 2) {
                System.out.print("Portanto o usuário é um bebê!");
            } else if (age <= 9) {
                System.out.print("Portanto o usuário é uma criança!");
            } else if (age <= 12) {
                System.out.print("Portanto o usuário é um pré-adolescente!");
            } else if (age <= 17) {
                System.out.print("Portanto o usuário é um adolescente");
            } else if (age <= 64) {
                System.out.print("Portanto o usuário é um adulto!");
            } else if (age <= 100) {
                System.out.print("Portanto o usuário é um idoso!");
            } else {
                System.out.print("Usuário com idade inválida!");
            }

        }

    }
}
