package week3.Section18;

import java.util.Scanner;

public class LinuxCommands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Linux Command:");
        String commands = sc.nextLine();

        switch (commands) {
            case "cd":
            case "pwd":
                System.out.printf("%s is a navigation command",commands);
                break;
            case "ls":
            case "cp":
            case "mv":
            case "mkdir":
                System.out.printf("%s is a file management command",commands);
                break;
            case "shutdown":
            case "restart":
                System.out.printf("%s is a system management command",commands);
                break;
            default:
                System.out.println("Invalid command. Please enter a valid command");
        }
    }
}
