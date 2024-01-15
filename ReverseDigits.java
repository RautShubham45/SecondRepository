import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initializing the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reversing the digits
        int reversedNumber = reverseDigits(number);

        // Displaying the result
        System.out.println("Reversed digits of " + number + " is: " + reversedNumber);

        scanner.close();
    }

    // Method to reverse the digits of a number
    private static int reverseDigits(int num) {
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return reversedNumber;
    }
}
