package week3.Section17;

import java.util.Scanner;

public class MusicalNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7:");
        int musicalNotes = sc.nextInt();

        switch(musicalNotes) {
            case 1:
                System.out.println("The corresponding musical note is do");
                break;
            case 2:
                System.out.println("The corresponding musical note is re");
                break;
            case 3:
                System.out.println("The corresponding musical note is mi");
                break;
            case 4:
                System.out.println("The corresponding musical note is fa");
                break;
            case 5:
                System.out.println("The corresponding musical note is sol");
                break;
            case 6:
                System.out.println("The corresponding musical note is la");
                break;
            case 7:
                System.out.println("The corresponding musical note is ti");
                break;
            default:
                System.out.println("Error: Invalid input. Please enter a number between 1 and 7");
        }
    }
}
