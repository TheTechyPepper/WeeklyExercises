package week5_and_6.Section12;

import java.util.Scanner;

public class Resturant_String {
    public static void main(String[] args) {
        //Restaurant menu app

        //write a program that will display the menu options
        //first it should prompt the options like
        //1. Appetizers
        //2. Main Course

        //if the users picks Appetizers then
        //user should be displayed with the following two options
        //1. Spring Rolls
        //2. Egg Rolls

        //if the users pick Main Course
        //user should displayed with the following two options
        //1. New York Ribeye
        //2. Chicken Curry

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pepper's Restaurant\n");
        System.out.println("Please choose one of the following options");
        System.out.println("1. Appetizers");
        System.out.println("2. Main Course");

        String firstOption = sc.nextLine();

        if (firstOption.equals("1") || firstOption.equals("Appetizers")) {
            System.out.println("Please choose your appetizer:");
            System.out.println("1. Spring rolls");
            System.out.println("2. Egg Rolls");

            String Appetizers = sc.nextLine();

            if (Appetizers.equals("1") || Appetizers.equals("Spring Rolls")) {
                System.out.println("Your Spring Rolls are being prepared");
            } else if (Appetizers.equals("2") || Appetizers.equals("Egg Rolls")) {
                System.out.println("Your Egg Rolls are being prepared");
            } else {
                System.out.println("Invalid Input, please try again");
            }
        } else if (firstOption.equals("2") || firstOption.equals("Main Course")) {
            System.out.println("1. Chicken Curry");
            System.out.println("2. New York Ribeye");

            String mainCourseChoice = sc.nextLine();

            if (mainCourseChoice.equals("1") || mainCourseChoice.equals("Chicken Curry")) {
                System.out.println("Your Chicken Curry is being prepared by our Chef");
            } else if (mainCourseChoice.equals("2") || mainCourseChoice.equals("Ribeye")) {
                System.out.println("Your New York Ribeye is being grilled by our Chef");
            } else {
                System.out.println("Invalid Input, please try again");
            }
        } else {
            System.out.println("Invalid option, only Appetizers and Main Courses are avaliable");
        }
    }
}