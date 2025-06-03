package week5.Section17;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number:");
        int secondNum = sc.nextInt();
        System.out.println("Enter operator (+, -, *, /):");
        char operator = sc.next().charAt(0);


        switch(operator) {
            case '+':
                double result = firstNum + secondNum;
                System.out.printf("Result: %.1f", result);
                break;
            case '-':
                result = firstNum - secondNum;
                System.out.printf("Result: %.1f", result);
                break;
            case '*':
                result = firstNum * secondNum;
                System.out.printf("Result: %.1f", result);
                break;
            case '/':
                result = firstNum / secondNum;
                System.out.printf("Result: %.1f", result);
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }
}
