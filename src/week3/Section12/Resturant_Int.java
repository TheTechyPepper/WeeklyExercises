package week3.Section12;

import java.util.Scanner;

public class Resturant_Int {
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

        int firstOption = sc.nextInt();

        if (firstOption == 1) {
            System.out.println("Please choose your appetizer:");
            System.out.println("1. Spring rolls");
            System.out.println("2. Egg Rolls");
            int Appetizers = sc.nextInt();

            if (Appetizers == 1) {
                System.out.println("Your Spring Rolls are being prepared");
            } else if (Appetizers == 2) {
                System.out.println("Your Egg Rolls are being prepared");
            } else {
                System.out.println("Invalid Input, please try again");
            }
        } else if (firstOption == 2) {
            System.out.println("1. Chicken Curry");
            System.out.println("2. New York Ribeye");
            int mainCourseChoice = sc.nextInt();

            if (mainCourseChoice == 1) {
                System.out.println("Your Chicken Curry is being prepared by our Chef");
            } else if (mainCourseChoice == 2) {
                System.out.println("Your New York Ribeye is being grilled by our Chef");
            } else {
                System.out.println("Invalid Input, please try again");
            }
        } else {
            System.out.println("Invalid option, only Appetizers and Main Courses are avaliable");
        }
    }
}