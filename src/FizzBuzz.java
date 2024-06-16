// That's a class to show the multiples numbers of 3 and 5 between 1 and 100
public class FizzBuzz {
    // This method runs all the java application
    public static void main(String[] args) {

        // That's to start the counting by 1 until 100
        for (int counter = 1; counter <= 100; counter++) {

            if (counter % 3 == 0 && counter % 5 == 0) {
                // That's for when the number in both cases are multiple of 3 and 5
                System.out.println("FizzBuzz");
            } else if (counter % 3 == 0) {
                // That's to check if the number is multiple of 3
                System.out.println("Fizz");
            } else if (counter % 5 == 0) {
                // That's to check if the number is multiple of 5
                System.out.println("Buzz");
            } else {
                // Other cases will be shown the own number
                System.out.println(counter);
            }

        }

    }
}
