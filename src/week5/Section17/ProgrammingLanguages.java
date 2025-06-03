package week5.Section17;

import java.util.Scanner;

public class ProgrammingLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a programming language:");
        String programmingLanguage = sc.nextLine();

        switch(programmingLanguage) {
            case "Python":
                System.out.println(programmingLanguage + " is an interpreted language");
                break;
            case "Ruby":
                System.out.println(programmingLanguage + " is an interpreted language");
                break;
            case "Perl":
                System.out.println(programmingLanguage + " is an interpreted language");
                break;
            case "JavaScript":
                System.out.println(programmingLanguage + " is an interpreted language");
                break;
            case "Java":
                System.out.println(programmingLanguage + " is a compiled language");
                break;
            case "C++":
                System.out.println(programmingLanguage + " is a compiled language");
                break;
            case "C#":
                System.out.println(programmingLanguage + " is a compiled language");
                break;
            case "Objective-C":
                System.out.println(programmingLanguage + " is a compiled language");
                break;
            case "Swift":
                System.out.println(programmingLanguage + " is a compiled language");
                break;
            default:
                System.out.println("Error: Invalid programming language. Please enter a valid programming language");
        }
    }
}
