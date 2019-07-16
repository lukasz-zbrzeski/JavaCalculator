import java.util.Scanner;

public class Main {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        String firstNumberText = "Input a first number: ";
        String secondNumberText = "Input a second number: ";

        Integer firstNumber, secondNumber;

        System.out.print("Input a symbol (+, -, *, /) or input x if you want exit this program: ");
        String symbol = scanner.next(); // gets a symbol

        if (symbol.equals("+")) {
            System.out.print(firstNumberText);
            firstNumber = scanner.nextInt(); //gets a first number
            System.out.print(secondNumberText);
            secondNumber = scanner.nextInt(); //gets a second number

            System.out.print("The sum of these numbers is: ");
            System.out.println(firstNumber + secondNumber); // count sum
        }
        else if (symbol.equals("-")) {
            System.out.print(firstNumberText);
            firstNumber = scanner.nextInt(); //get a first number
            System.out.print(secondNumberText);
            secondNumber = scanner.nextInt(); //gets a second number

            System.out.print("The difference of these numbers is: ");
            System.out.println(firstNumber - secondNumber); // count difference
        }
        else if (symbol.equals("*")) {
            System.out.print(firstNumberText);
            firstNumber = scanner.nextInt(); //get a first number
            System.out.print(secondNumberText);
            secondNumber = scanner.nextInt(); //gets a second number

            System.out.print("The multiplication of these numbers is: ");
            System.out.println(firstNumber * secondNumber); // count multiplication
        }
        else if (symbol.equals("/")) {
            System.out.print(firstNumberText);
            firstNumber = scanner.nextInt(); //get a first number
            System.out.print(secondNumberText);
            secondNumber = scanner.nextInt(); //gets a second number

            System.out.print("The quotient of these numbers is: ");
            System.out.println(firstNumber.floatValue() / secondNumber.floatValue()); // count quotient
        }
        else if (symbol.equals("x")) {
            System.out.println("Closing the calculator.");
            System.exit(0); // exit the program
        }
        else {
            System.out.println("Wrong symbol!");
        }
    }

    public static void main(String[] args) {
        calculator();
    }
}
