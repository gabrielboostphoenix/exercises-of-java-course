// Importing Area
import java.util.Scanner;

// That's a class that checks the received user age to vote
public class VotingSystem {
    // This method runs all the java application
    public static void main(String[] args) {

        // Creating an input object to capture what the user has typed
        Scanner input = new Scanner(System.in);
        // Showing a message to the user to enter with your born year
        System.out.print("Informe o seu ano de nascimento: ");
        // Getting the number value of the user born year
        int bornYear = input.nextInt();
        // Calculating the user age through the received born year
        int age = 2024 - bornYear;
        // Checking if the user age is valid
        if (age < 0 || age > 120) {

            // In this case the born year is invalid
            System.out.println("Idade de usuário incorreta, informe um ano de nascimento válido!");

        } else {

            // In this case the received born year is valid
            // Checking the age to say if the user can vote
            if (age <= 15) {
                System.out.print("Você não pode votar este ano!");
                System.out.println(" espere até completar no mínimo 16 anos de idade!");
            } else if (age <= 17) {
                System.out.println("Você já pode votar e seu voto é opcional!");
            } else if (age <= 70) {
                System.out.println("Você pode votar e seu voto é obrigatório!");
            } else {
                System.out.println("Você pode votar e não é obrigatório!");
            }

        }
    }
}
