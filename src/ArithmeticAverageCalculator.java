// Importing Area
import java.util.Scanner;

// That's a Class of Arithmetic Average Calculator
public class ArithmeticAverageCalculator {
    // This method runs all the java application
    public static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing a message to the user to type the first note of a student
        System.out.print("Informe a 1° nota de um aluno: ");
        // Getting the first note of a student
        float firstNote = input.nextFloat();
        // Showing a message to the user to type the second note of a student
        System.out.print("Informe a 2° nota de um aluno: ");
        // Getting the second note of a student
        float secondNote = input.nextFloat();
        // Showing a message to the user to type the third note of a student
        System.out.print("Informe a 3° nota de um aluno: ");
        // Getting the third note of a student
        float thirdNote = input.nextFloat();

        // Calculating the arithmetic average of the school notes
        float result = (firstNote + secondNote + thirdNote) / 3;
        // Showing the message with the result
        System.out.printf("O resultado da média aritmética das notas é de %.2f", result);

    }
}
