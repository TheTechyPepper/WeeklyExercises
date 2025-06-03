package week5.Section20;

import java.util.Scanner;

public class GoodDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday):");
        String dayOfWeek = sc.nextLine();
        System.out.println("Enter the time of day (morning, afternoon, evening):");
        String timeOfTheDay = sc.nextLine();

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (timeOfTheDay) {
                    case "morining":
                        System.out.printf("Good morning! It's %s!", dayOfWeek);
                        break;
                    case "afternoon":
                        System.out.printf("Good morning! It's %s!", dayOfWeek);
                        break;
                    case "evening":
                        System.out.printf("Good morning! It's %s!", dayOfWeek);
                        break;
                    default:
                        System.out.println("Invalid day of week");
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (timeOfTheDay) {
                    case "morining":
                        System.out.println("Good morning! It's the weekend!");
                        break;
                    case "afternoon":
                        System.out.println("Good afternoon! It's the weekend!");
                        break;
                    case "evening":
                        System.out.println(" Good evening! It's the weekend!");
                        break;
                    default:
                        System.out.println("Invalid day of day");
                        break;
                }
                break;
            default:
                System.out.println("Invalid day of week");
        }
    }
}