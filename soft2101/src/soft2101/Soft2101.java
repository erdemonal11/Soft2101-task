package soft2101;

import java.util.Scanner;

public class Soft2101 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        scanner.close();


        
        if (firstNumber < secondNumber) {
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                if (i % 2 == 0) {

        if (firstNumber < secondNumber) {
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                if (i % 2 != 0) {

                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid input. The first number should be less than the second number.");
        }
    }
}

    

