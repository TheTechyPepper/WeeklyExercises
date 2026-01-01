package week3.Section20;

import java.util.Scanner;

public class NestedSwitchStatementsPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String country = "USA";
        String state = "New York";

        switch (country) {
            case "USA":
                switch (state) {
                    case "California":
                    case "Washington":
                    case "Arizona":
                        System.out.println("20%");
                        break;
                    case "Illinois":
                    case "New York":
                        System.out.println("15%");
                        break;
                    case "Florida":
                    case "Texas":
                        System.out.println("10%");
                }
                break;
            case "Canada":
            default:
                System.out.println("Unsupported Country");
        }
    }
}
